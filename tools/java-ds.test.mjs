import assert from "node:assert/strict";
import { spawn } from "node:child_process";
import { createHash } from "node:crypto";
import { once } from "node:events";
import { mkdtemp, rm, writeFile } from "node:fs/promises";
import { createServer } from "node:http";
import { tmpdir } from "node:os";
import { delimiter, join } from "node:path";
import test from "node:test";
import { fileURLToPath } from "node:url";

const root = fileURLToPath(new URL("../", import.meta.url));
const javaHome = process.env.JAVA_HOME;
const javac = javaHome && join(javaHome, "bin", "javac");
const java = javaHome && join(javaHome, "bin", "java");
const classpath = [
  join(root, "generated", "clients", "java", "target", "classes"),
  join(process.env.USERPROFILE ?? "", ".m2", "repository", "io", "clientcore", "core", "1.0.0-beta.11", "core-1.0.0-beta.11.jar"),
].join(delimiter);

test("Java clients automatically sign omitted V1 and V2 DS headers", { skip: !javaHome }, async () => {
  const requests = [];
  const server = createServer((incoming, response) => {
    requests.push({ ds: incoming.headers.ds, url: incoming.url });
    response.writeHead(200, { "content-type": "application/json" });
    response.end('{"retcode":0,"message":"OK","data":{}}');
  });
  server.listen(0, "127.0.0.1");
  await once(server, "listening");
  const endpoint = `http://127.0.0.1:${server.address().port}`;
  const directory = await mkdtemp(join(tmpdir(), "uigf-java-ds-"));
  try {
    await writeFile(join(directory, "Program.java"), `
import io.clientcore.core.http.client.HttpClient;
import uigf.mihoyo.DsSigner;
import uigf.mihoyo.game.cn.records.CnGameRecordsClientBuilder;
import uigf.mihoyo.game.cn.records.StarRailApiClient;
import uigf.mihoyo.miyoushe.staticnamespace.StaticApiHubClient;
import uigf.mihoyo.miyoushe.staticnamespace.StaticClientBuilder;

public final class Program {
    public static void main(String[] args) {
        StaticApiHubClient staticClient = DsSigner.configure(new StaticClientBuilder(), "caller-provided-salt")
            .endpoint(args[0]).httpClient(HttpClient.getNewInstance()).buildStaticApiHubClient();
        staticClient.getStaticResource(2);

        StarRailApiClient recordsClient = DsSigner.configure(new CnGameRecordsClientBuilder(), "caller-provided-salt")
            .endpoint(args[0]).httpClient(HttpClient.getNewInstance()).buildStarRailApiClient();
        recordsClient.getSimulatedUniverse("ltuid=123", "prod_gf_cn", "123456");
    }
}
`);
    const compile = await run(javac, ["--release", "11", "--add-modules", "jdk.httpserver", "-cp", classpath, "Program.java"], directory);
    assert.equal(compile.status, 0, `${compile.stdout}\n${compile.stderr}`);
    const execute = await run(java, ["--add-modules", "jdk.httpserver", "-cp", `${classpath}${delimiter}${directory}`, "Program", endpoint], directory);
    assert.equal(execute.status, 0, `${execute.stdout}\n${execute.stderr}`);

    assert.equal(requests.length, 2);
    verifyV1(requests.find((request) => request.url === "/apihub/api/staticResource?client_type=2"));
    verifyV2(requests.find((request) => request.url?.startsWith("/game_record/app/hkrpg/api/rogue?")));
  } finally {
    await rm(directory, { recursive: true, force: true });
    server.close();
    await once(server, "close");
  }
});

function verifyV1(request) {
  assert.match(request?.ds ?? "", /^\d+,[0-9a-z]{6},[0-9a-f]{32}$/);
  const [timestamp, nonce, digest] = request.ds.split(",");
  assert.equal(digest, createHash("md5")
    .update(`salt=caller-provided-salt&t=${timestamp}&r=${nonce}`, "utf8").digest("hex"));
}

function verifyV2(request) {
  assert.match(request?.ds ?? "", /^\d+,\d+,[0-9a-f]{32}$/);
  const [timestamp, nonce, digest] = request.ds.split(",");
  const query = request.url.split("?", 2)[1].split("&").sort().join("&");
  assert.equal(digest, createHash("md5")
    .update(`salt=caller-provided-salt&t=${timestamp}&r=${nonce}&b=&q=${query}`, "utf8").digest("hex"));
}

function run(command, args, cwd) {
  return new Promise((resolve) => {
    const child = spawn(command, args, { cwd });
    let stdout = "";
    let stderr = "";
    child.stdout.setEncoding("utf8").on("data", (chunk) => { stdout += chunk; });
    child.stderr.setEncoding("utf8").on("data", (chunk) => { stderr += chunk; });
    child.on("close", (status) => resolve({ status, stderr, stdout }));
  });
}

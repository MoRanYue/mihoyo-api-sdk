"""Exercises automatic V1/V2 DS signing through the generated Python clients."""

import hashlib
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
from pathlib import Path
import sys
from threading import Thread
from urllib.parse import urlsplit

client_directory = Path(sys.argv[1]).resolve() if len(sys.argv) > 1 else Path(__file__).resolve().parents[1] / "generated" / "clients" / "python"
sys.path.insert(0, str(client_directory))

from uigf.mihoyo.ds import DsSigner
from uigf.mihoyo.game.cn.records import CnGameRecordsClient
from uigf.mihoyo.miyoushe.static import StaticClient


class Handler(BaseHTTPRequestHandler):
    requests: list[tuple[str, str | None]] = []

    def do_GET(self) -> None:  # noqa: N802
        self.requests.append((self.path, self.headers.get("DS")))
        self.send_response(200)
        self.send_header("Content-Type", "application/json")
        self.end_headers()
        self.wfile.write(b'{"retcode":0,"message":"OK","data":{}}')

    def log_message(self, _format: str, *_args: object) -> None:
        pass


def verify(request: tuple[str, str | None], generation: int) -> None:
    path, ds = request
    assert ds is not None
    timestamp, nonce, digest = ds.split(",")
    parsed = urlsplit(path)
    payload = f"salt=caller-provided-salt&t={timestamp}&r={nonce}"
    if generation == 2:
        payload += f"&b=&q={'&'.join(sorted(parsed.query.split('&')))}"
    assert digest == hashlib.md5(payload.encode("utf-8")).hexdigest()


server = ThreadingHTTPServer(("127.0.0.1", 0), Handler)
thread = Thread(target=server.serve_forever, daemon=True)
thread.start()
endpoint = f"http://127.0.0.1:{server.server_port}"

try:
    static = StaticClient(endpoint=endpoint, **DsSigner.create_client_options("caller-provided-salt"))
    records = CnGameRecordsClient(endpoint=endpoint, **DsSigner.create_client_options("caller-provided-salt"))
    static.static_api_hub.get_static_resource(client_type=2)
    records.star_rail_api.get_simulated_universe(
        cookie="ltuid=123", server="prod_gf_cn", role_id="123456", schedule_type=0, need_detail=False, need_all=False
    )
    static.static_api_hub.get_static_resource(client_type=2, ds="caller-supplied")
    static.close()
    records.close()
finally:
    server.shutdown()
    server.server_close()

assert len(Handler.requests) == 3
verify(Handler.requests[0], 1)
verify(Handler.requests[1], 2)
assert Handler.requests[2][1] == "caller-supplied"
print("Python client automatically signs V1/V2 DS requests and preserves an explicit header.")

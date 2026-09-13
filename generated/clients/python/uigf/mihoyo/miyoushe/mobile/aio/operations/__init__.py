# coding=utf-8
# pylint: disable=wrong-import-position

from typing import TYPE_CHECKING

if TYPE_CHECKING:
    from ._patch import *  # pylint: disable=unused-wildcard-import

from ._operations import MobileApiHubOperations  # type: ignore
from ._operations import MobileChatApiOperations  # type: ignore
from ._operations import MobileForumApiOperations  # type: ignore
from ._operations import MobileMiscApiOperations  # type: ignore
from ._operations import MobilePainterApiOperations  # type: ignore
from ._operations import MobilePostApiOperations  # type: ignore
from ._operations import MobileReceptionApiOperations  # type: ignore
from ._operations import MobileTeenagerApiOperations  # type: ignore
from ._operations import MobileTimelineApiOperations  # type: ignore
from ._operations import MobileUserApiOperations  # type: ignore
from ._operations import MobileUserInstantApiOperations  # type: ignore
from ._operations import MobilePreloadApiOperations  # type: ignore

from ._patch import __all__ as _patch_all
from ._patch import *
from ._patch import patch_sdk as _patch_sdk

__all__ = [
    "MobileApiHubOperations",
    "MobileChatApiOperations",
    "MobileForumApiOperations",
    "MobileMiscApiOperations",
    "MobilePainterApiOperations",
    "MobilePostApiOperations",
    "MobileReceptionApiOperations",
    "MobileTeenagerApiOperations",
    "MobileTimelineApiOperations",
    "MobileUserApiOperations",
    "MobileUserInstantApiOperations",
    "MobilePreloadApiOperations",
]
__all__.extend([p for p in _patch_all if p not in __all__])  # pyright: ignore
_patch_sdk()

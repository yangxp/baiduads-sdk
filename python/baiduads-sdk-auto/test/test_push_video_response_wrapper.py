"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.videosynthetise.model.push_video_response_wrapper_body import PushVideoResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['PushVideoResponseWrapperBody'] = PushVideoResponseWrapperBody
from baiduads.videosynthetise.model.push_video_response_wrapper import PushVideoResponseWrapper


class TestPushVideoResponseWrapper(unittest.TestCase):
    """PushVideoResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPushVideoResponseWrapper(self):
        """Test PushVideoResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PushVideoResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()

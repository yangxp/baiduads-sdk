"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.platproduct.model.plat_product_delete_request import PlatProductDeleteRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['PlatProductDeleteRequest'] = PlatProductDeleteRequest
from baiduads.platproduct.model.delete_product_request_wrapper import DeleteProductRequestWrapper


class TestDeleteProductRequestWrapper(unittest.TestCase):
    """DeleteProductRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteProductRequestWrapper(self):
        """Test DeleteProductRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteProductRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()

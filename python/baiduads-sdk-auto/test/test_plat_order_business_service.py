"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from platorderbusiness.api.plat_order_business_service import PlatOrderBusinessService  # noqa: E501


class TestPlatOrderBusinessService(unittest.TestCase):
    """PlatOrderBusinessService unit test stubs"""

    def setUp(self):
        self.api = PlatOrderBusinessService()  # noqa: E501

    def tearDown(self):
        pass

    def test_confirm_or_cancel_order(self):
        """Test case for confirm_or_cancel_order

        """
        pass

    def test_deliver_order(self):
        """Test case for deliver_order

        """
        pass

    def test_update_remark(self):
        """Test case for update_remark

        """
        pass


if __name__ == '__main__':
    unittest.main()

"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from orderbusiness.api.order_business_service import OrderBusinessService  # noqa: E501


class TestOrderBusinessService(unittest.TestCase):
    """OrderBusinessService unit test stubs"""

    def setUp(self):
        self.api = OrderBusinessService()  # noqa: E501

    def tearDown(self):
        pass

    def test_grant_call_back(self):
        """Test case for grant_call_back

        """
        pass


if __name__ == '__main__':
    unittest.main()

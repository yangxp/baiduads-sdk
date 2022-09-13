"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from baiduads.exceptions import ApiAttributeError


def lazy_import():
    from baiduads.platbusinessorderrefund.model.discount_info import DiscountInfo
    from baiduads.platbusinessorderrefund.model.order_bussiness_detail_info import OrderBussinessDetailInfo
    from baiduads.platbusinessorderrefund.model.order_click_info import OrderClickInfo
    from baiduads.platbusinessorderrefund.model.order_express_info import OrderExpressInfo
    from baiduads.platbusinessorderrefund.model.order_express_package_info import OrderExpressPackageInfo
    from baiduads.platbusinessorderrefund.model.order_status_detail_info import OrderStatusDetailInfo
    from baiduads.platbusinessorderrefund.model.pay_order_info import PayOrderInfo
    globals()['DiscountInfo'] = DiscountInfo
    globals()['OrderBussinessDetailInfo'] = OrderBussinessDetailInfo
    globals()['OrderClickInfo'] = OrderClickInfo
    globals()['OrderExpressInfo'] = OrderExpressInfo
    globals()['OrderExpressPackageInfo'] = OrderExpressPackageInfo
    globals()['OrderStatusDetailInfo'] = OrderStatusDetailInfo
    globals()['PayOrderInfo'] = PayOrderInfo


class OrderBussinessInfo(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'order_id': (int,),  # noqa: E501
            'copuser_id': (int,),  # noqa: E501
            'ucid': (int,),  # noqa: E501
            'passport_id': (int,),  # noqa: E501
            'cuid': (str,),  # noqa: E501
            'baiduid': (str,),  # noqa: E501
            'agent_id': (int,),  # noqa: E501
            'app_id': (int,),  # noqa: E501
            'sub_app_id': (int,),  # noqa: E501
            'status': (int,),  # noqa: E501
            'pay_type': (int,),  # noqa: E501
            'pay_status': (int,),  # noqa: E501
            'is_del': (int,),  # noqa: E501
            'total_amount': (int,),  # noqa: E501
            'discount_amount': (int,),  # noqa: E501
            'adjust_amount': (int,),  # noqa: E501
            'payment_amount': (int,),  # noqa: E501
            'message': (str,),  # noqa: E501
            'remark': (str,),  # noqa: E501
            'create_time': (str,),  # noqa: E501
            'update_time': (str,),  # noqa: E501
            'cancel_time': (str,),  # noqa: E501
            'pay_time': (str,),  # noqa: E501
            'pay_timeout': (str,),  # noqa: E501
            'ext_info': (str,),  # noqa: E501
            'total_count': (int,),  # noqa: E501
            'refund_id': (int,),  # noqa: E501
            'refund_status': (int,),  # noqa: E501
            'shop_name': (str,),  # noqa: E501
            'order_express_info': (OrderExpressInfo,),  # noqa: E501
            'order_click_info': (OrderClickInfo,),  # noqa: E501
            'order_bussiness_detail_infos': ([OrderBussinessDetailInfo],),  # noqa: E501
            'freight_amount': (int,),  # noqa: E501
            'product_type': (int,),  # noqa: E501
            'return_data': (str,),  # noqa: E501
            'business_value': (str,),  # noqa: E501
            'tag': (int,),  # noqa: E501
            'tag_list': ([str],),  # noqa: E501
            'due_amount': (int,),  # noqa: E501
            'due_discount_amount': (int,),  # noqa: E501
            'sell_amount': (int,),  # noqa: E501
            'stage_amount': (int,),  # noqa: E501
            'business_code': (int,),  # noqa: E501
            'discount_amount_detail': (DiscountInfo,),  # noqa: E501
            'group_status': (int,),  # noqa: E501
            'order_transaction_mode': (int,),  # noqa: E501
            'submit_type': (int,),  # noqa: E501
            'batch_id': (int,),  # noqa: E501
            'part_consign': (int,),  # noqa: E501
            'order_express_package_infos': ([OrderExpressPackageInfo],),  # noqa: E501
            'express_mod_info': (str,),  # noqa: E501
            'status_detail': (OrderStatusDetailInfo,),  # noqa: E501
            'cashier_pay_type': (int,),  # noqa: E501
            'due_paid': (bool,),  # noqa: E501
            'personal_labels': ([int],),  # noqa: E501
            'pay_order_infos': ([PayOrderInfo],),  # noqa: E501
            'settle_amount': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'order_id': 'orderId',  # noqa: E501
        'copuser_id': 'copuserId',  # noqa: E501
        'ucid': 'ucid',  # noqa: E501
        'passport_id': 'passportId',  # noqa: E501
        'cuid': 'cuid',  # noqa: E501
        'baiduid': 'baiduid',  # noqa: E501
        'agent_id': 'agentId',  # noqa: E501
        'app_id': 'appId',  # noqa: E501
        'sub_app_id': 'subAppId',  # noqa: E501
        'status': 'status',  # noqa: E501
        'pay_type': 'payType',  # noqa: E501
        'pay_status': 'payStatus',  # noqa: E501
        'is_del': 'isDel',  # noqa: E501
        'total_amount': 'totalAmount',  # noqa: E501
        'discount_amount': 'discountAmount',  # noqa: E501
        'adjust_amount': 'adjustAmount',  # noqa: E501
        'payment_amount': 'paymentAmount',  # noqa: E501
        'message': 'message',  # noqa: E501
        'remark': 'remark',  # noqa: E501
        'create_time': 'createTime',  # noqa: E501
        'update_time': 'updateTime',  # noqa: E501
        'cancel_time': 'cancelTime',  # noqa: E501
        'pay_time': 'payTime',  # noqa: E501
        'pay_timeout': 'payTimeout',  # noqa: E501
        'ext_info': 'extInfo',  # noqa: E501
        'total_count': 'totalCount',  # noqa: E501
        'refund_id': 'refundId',  # noqa: E501
        'refund_status': 'refundStatus',  # noqa: E501
        'shop_name': 'shopName',  # noqa: E501
        'order_express_info': 'orderExpressInfo',  # noqa: E501
        'order_click_info': 'orderClickInfo',  # noqa: E501
        'order_bussiness_detail_infos': 'orderBussinessDetailInfos',  # noqa: E501
        'freight_amount': 'freightAmount',  # noqa: E501
        'product_type': 'productType',  # noqa: E501
        'return_data': 'returnData',  # noqa: E501
        'business_value': 'businessValue',  # noqa: E501
        'tag': 'tag',  # noqa: E501
        'tag_list': 'tagList',  # noqa: E501
        'due_amount': 'dueAmount',  # noqa: E501
        'due_discount_amount': 'dueDiscountAmount',  # noqa: E501
        'sell_amount': 'sellAmount',  # noqa: E501
        'stage_amount': 'stageAmount',  # noqa: E501
        'business_code': 'businessCode',  # noqa: E501
        'discount_amount_detail': 'discountAmountDetail',  # noqa: E501
        'group_status': 'groupStatus',  # noqa: E501
        'order_transaction_mode': 'orderTransactionMode',  # noqa: E501
        'submit_type': 'submitType',  # noqa: E501
        'batch_id': 'batchId',  # noqa: E501
        'part_consign': 'partConsign',  # noqa: E501
        'order_express_package_infos': 'orderExpressPackageInfos',  # noqa: E501
        'express_mod_info': 'expressModInfo',  # noqa: E501
        'status_detail': 'statusDetail',  # noqa: E501
        'cashier_pay_type': 'cashierPayType',  # noqa: E501
        'due_paid': 'duePaid',  # noqa: E501
        'personal_labels': 'personalLabels',  # noqa: E501
        'pay_order_infos': 'payOrderInfos',  # noqa: E501
        'settle_amount': 'settleAmount',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """OrderBussinessInfo - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            order_id (int): [optional]  # noqa: E501
            copuser_id (int): [optional]  # noqa: E501
            ucid (int): [optional]  # noqa: E501
            passport_id (int): [optional]  # noqa: E501
            cuid (str): [optional]  # noqa: E501
            baiduid (str): [optional]  # noqa: E501
            agent_id (int): [optional]  # noqa: E501
            app_id (int): [optional]  # noqa: E501
            sub_app_id (int): [optional]  # noqa: E501
            status (int): [optional]  # noqa: E501
            pay_type (int): [optional]  # noqa: E501
            pay_status (int): [optional]  # noqa: E501
            is_del (int): [optional]  # noqa: E501
            total_amount (int): [optional]  # noqa: E501
            discount_amount (int): [optional]  # noqa: E501
            adjust_amount (int): [optional]  # noqa: E501
            payment_amount (int): [optional]  # noqa: E501
            message (str): [optional]  # noqa: E501
            remark (str): [optional]  # noqa: E501
            create_time (str): [optional]  # noqa: E501
            update_time (str): [optional]  # noqa: E501
            cancel_time (str): [optional]  # noqa: E501
            pay_time (str): [optional]  # noqa: E501
            pay_timeout (str): [optional]  # noqa: E501
            ext_info (str): [optional]  # noqa: E501
            total_count (int): [optional]  # noqa: E501
            refund_id (int): [optional]  # noqa: E501
            refund_status (int): [optional]  # noqa: E501
            shop_name (str): [optional]  # noqa: E501
            order_express_info (OrderExpressInfo): [optional]  # noqa: E501
            order_click_info (OrderClickInfo): [optional]  # noqa: E501
            order_bussiness_detail_infos ([OrderBussinessDetailInfo]): [optional]  # noqa: E501
            freight_amount (int): [optional]  # noqa: E501
            product_type (int): [optional]  # noqa: E501
            return_data (str): [optional]  # noqa: E501
            business_value (str): [optional]  # noqa: E501
            tag (int): [optional]  # noqa: E501
            tag_list ([str]): [optional]  # noqa: E501
            due_amount (int): [optional]  # noqa: E501
            due_discount_amount (int): [optional]  # noqa: E501
            sell_amount (int): [optional]  # noqa: E501
            stage_amount (int): [optional]  # noqa: E501
            business_code (int): [optional]  # noqa: E501
            discount_amount_detail (DiscountInfo): [optional]  # noqa: E501
            group_status (int): [optional]  # noqa: E501
            order_transaction_mode (int): [optional]  # noqa: E501
            submit_type (int): [optional]  # noqa: E501
            batch_id (int): [optional]  # noqa: E501
            part_consign (int): [optional]  # noqa: E501
            order_express_package_infos ([OrderExpressPackageInfo]): [optional]  # noqa: E501
            express_mod_info (str): [optional]  # noqa: E501
            status_detail (OrderStatusDetailInfo): [optional]  # noqa: E501
            cashier_pay_type (int): [optional]  # noqa: E501
            due_paid (bool): [optional]  # noqa: E501
            personal_labels ([int]): [optional]  # noqa: E501
            pay_order_infos ([PayOrderInfo]): [optional]  # noqa: E501
            settle_amount (int): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """OrderBussinessInfo - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            order_id (int): [optional]  # noqa: E501
            copuser_id (int): [optional]  # noqa: E501
            ucid (int): [optional]  # noqa: E501
            passport_id (int): [optional]  # noqa: E501
            cuid (str): [optional]  # noqa: E501
            baiduid (str): [optional]  # noqa: E501
            agent_id (int): [optional]  # noqa: E501
            app_id (int): [optional]  # noqa: E501
            sub_app_id (int): [optional]  # noqa: E501
            status (int): [optional]  # noqa: E501
            pay_type (int): [optional]  # noqa: E501
            pay_status (int): [optional]  # noqa: E501
            is_del (int): [optional]  # noqa: E501
            total_amount (int): [optional]  # noqa: E501
            discount_amount (int): [optional]  # noqa: E501
            adjust_amount (int): [optional]  # noqa: E501
            payment_amount (int): [optional]  # noqa: E501
            message (str): [optional]  # noqa: E501
            remark (str): [optional]  # noqa: E501
            create_time (str): [optional]  # noqa: E501
            update_time (str): [optional]  # noqa: E501
            cancel_time (str): [optional]  # noqa: E501
            pay_time (str): [optional]  # noqa: E501
            pay_timeout (str): [optional]  # noqa: E501
            ext_info (str): [optional]  # noqa: E501
            total_count (int): [optional]  # noqa: E501
            refund_id (int): [optional]  # noqa: E501
            refund_status (int): [optional]  # noqa: E501
            shop_name (str): [optional]  # noqa: E501
            order_express_info (OrderExpressInfo): [optional]  # noqa: E501
            order_click_info (OrderClickInfo): [optional]  # noqa: E501
            order_bussiness_detail_infos ([OrderBussinessDetailInfo]): [optional]  # noqa: E501
            freight_amount (int): [optional]  # noqa: E501
            product_type (int): [optional]  # noqa: E501
            return_data (str): [optional]  # noqa: E501
            business_value (str): [optional]  # noqa: E501
            tag (int): [optional]  # noqa: E501
            tag_list ([str]): [optional]  # noqa: E501
            due_amount (int): [optional]  # noqa: E501
            due_discount_amount (int): [optional]  # noqa: E501
            sell_amount (int): [optional]  # noqa: E501
            stage_amount (int): [optional]  # noqa: E501
            business_code (int): [optional]  # noqa: E501
            discount_amount_detail (DiscountInfo): [optional]  # noqa: E501
            group_status (int): [optional]  # noqa: E501
            order_transaction_mode (int): [optional]  # noqa: E501
            submit_type (int): [optional]  # noqa: E501
            batch_id (int): [optional]  # noqa: E501
            part_consign (int): [optional]  # noqa: E501
            order_express_package_infos ([OrderExpressPackageInfo]): [optional]  # noqa: E501
            express_mod_info (str): [optional]  # noqa: E501
            status_detail (OrderStatusDetailInfo): [optional]  # noqa: E501
            cashier_pay_type (int): [optional]  # noqa: E501
            due_paid (bool): [optional]  # noqa: E501
            personal_labels ([int]): [optional]  # noqa: E501
            pay_order_infos ([PayOrderInfo]): [optional]  # noqa: E501
            settle_amount (int): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")

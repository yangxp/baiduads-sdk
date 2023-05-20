/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.subshopopenapi.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.subshopopenapi.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.subshopopenapi.model.CreateSubShopRequestWrapper;
import com.baidu.dev2.api.sdk.subshopopenapi.model.CreateSubShopResponseWrapper;
import com.baidu.dev2.api.sdk.subshopopenapi.model.UpdateSubShopRequestWrapper;
import com.baidu.dev2.api.sdk.subshopopenapi.model.UpdateSubShopResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubShopOpenApiService {
  private ApiClient apiClient;

  public SubShopOpenApiService() {
    this(Configuration.getDefaultApiClient());
  }

  public SubShopOpenApiService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param createSubShopRequestWrapper  (required)
   * @return CreateSubShopResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CreateSubShopResponseWrapper createSubShop(CreateSubShopRequestWrapper createSubShopRequestWrapper) throws ApiException {
    Object localVarPostBody = createSubShopRequestWrapper;
    
    // verify the required parameter 'createSubShopRequestWrapper' is set
    if (createSubShopRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'createSubShopRequestWrapper' when calling createSubShop");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/SubShopOpenApiService/createSubShop";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<CreateSubShopResponseWrapper> localVarReturnType = new TypeReference<CreateSubShopResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param updateSubShopRequestWrapper  (required)
   * @return UpdateSubShopResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateSubShopResponseWrapper updateSubShop(UpdateSubShopRequestWrapper updateSubShopRequestWrapper) throws ApiException {
    Object localVarPostBody = updateSubShopRequestWrapper;
    
    // verify the required parameter 'updateSubShopRequestWrapper' is set
    if (updateSubShopRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateSubShopRequestWrapper' when calling updateSubShop");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/SubShopOpenApiService/updateSubShop";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<UpdateSubShopResponseWrapper> localVarReturnType = new TypeReference<UpdateSubShopResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}

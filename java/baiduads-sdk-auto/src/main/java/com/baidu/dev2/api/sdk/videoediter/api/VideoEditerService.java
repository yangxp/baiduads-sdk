/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.videoediter.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.videoediter.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.videoediter.model.SmartAudioRequestWrapper;
import com.baidu.dev2.api.sdk.videoediter.model.SmartAudioResponseWrapper;
import com.baidu.dev2.api.sdk.videoediter.model.SmartMusicRequestWrapper;
import com.baidu.dev2.api.sdk.videoediter.model.SmartMusicResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoEditerService {
  private ApiClient apiClient;

  public VideoEditerService() {
    this(Configuration.getDefaultApiClient());
  }

  public VideoEditerService(ApiClient apiClient) {
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
   * @param smartAudioRequestWrapper  (required)
   * @return SmartAudioResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public SmartAudioResponseWrapper smartAudio(SmartAudioRequestWrapper smartAudioRequestWrapper) throws ApiException {
    Object localVarPostBody = smartAudioRequestWrapper;
    
    // verify the required parameter 'smartAudioRequestWrapper' is set
    if (smartAudioRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'smartAudioRequestWrapper' when calling smartAudio");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/VideoEditerService/smartAudio";

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

    TypeReference<SmartAudioResponseWrapper> localVarReturnType = new TypeReference<SmartAudioResponseWrapper>() {};
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
   * @param smartMusicRequestWrapper  (required)
   * @return SmartMusicResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public SmartMusicResponseWrapper smartMusic(SmartMusicRequestWrapper smartMusicRequestWrapper) throws ApiException {
    Object localVarPostBody = smartMusicRequestWrapper;
    
    // verify the required parameter 'smartMusicRequestWrapper' is set
    if (smartMusicRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'smartMusicRequestWrapper' when calling smartMusic");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/VideoEditerService/smartMusic";

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

    TypeReference<SmartMusicResponseWrapper> localVarReturnType = new TypeReference<SmartMusicResponseWrapper>() {};
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

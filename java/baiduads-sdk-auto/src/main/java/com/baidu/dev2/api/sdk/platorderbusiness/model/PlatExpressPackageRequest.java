/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platorderbusiness.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlatExpressPackageRequest
 */
@JsonPropertyOrder({
  PlatExpressPackageRequest.JSON_PROPERTY_TRACKING_NUMBER,
  PlatExpressPackageRequest.JSON_PROPERTY_EXPRESS_NAME,
  PlatExpressPackageRequest.JSON_PROPERTY_PACKAGE_MEMO,
  PlatExpressPackageRequest.JSON_PROPERTY_PACKAGE_ID,
  PlatExpressPackageRequest.JSON_PROPERTY_SUB_ORDER_IDS
})
@JsonTypeName("PlatExpressPackageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatExpressPackageRequest {
  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  private String trackingNumber;

  public static final String JSON_PROPERTY_EXPRESS_NAME = "expressName";
  private String expressName;

  public static final String JSON_PROPERTY_PACKAGE_MEMO = "packageMemo";
  private String packageMemo;

  public static final String JSON_PROPERTY_PACKAGE_ID = "packageId";
  private Long packageId;

  public static final String JSON_PROPERTY_SUB_ORDER_IDS = "subOrderIds";
  private List<Long> subOrderIds = null;

  public PlatExpressPackageRequest() { 
  }

  public PlatExpressPackageRequest trackingNumber(String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingNumber() {
    return trackingNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  public PlatExpressPackageRequest expressName(String expressName) {
    
    this.expressName = expressName;
    return this;
  }

   /**
   * Get expressName
   * @return expressName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPRESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpressName() {
    return expressName;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpressName(String expressName) {
    this.expressName = expressName;
  }


  public PlatExpressPackageRequest packageMemo(String packageMemo) {
    
    this.packageMemo = packageMemo;
    return this;
  }

   /**
   * Get packageMemo
   * @return packageMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageMemo() {
    return packageMemo;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageMemo(String packageMemo) {
    this.packageMemo = packageMemo;
  }


  public PlatExpressPackageRequest packageId(Long packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPackageId() {
    return packageId;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }


  public PlatExpressPackageRequest subOrderIds(List<Long> subOrderIds) {
    
    this.subOrderIds = subOrderIds;
    return this;
  }

  public PlatExpressPackageRequest addSubOrderIdsItem(Long subOrderIdsItem) {
    if (this.subOrderIds == null) {
      this.subOrderIds = new ArrayList<>();
    }
    this.subOrderIds.add(subOrderIdsItem);
    return this;
  }

   /**
   * Get subOrderIds
   * @return subOrderIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_ORDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSubOrderIds() {
    return subOrderIds;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ORDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubOrderIds(List<Long> subOrderIds) {
    this.subOrderIds = subOrderIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatExpressPackageRequest platExpressPackageRequest = (PlatExpressPackageRequest) o;
    return Objects.equals(this.trackingNumber, platExpressPackageRequest.trackingNumber) &&
        Objects.equals(this.expressName, platExpressPackageRequest.expressName) &&
        Objects.equals(this.packageMemo, platExpressPackageRequest.packageMemo) &&
        Objects.equals(this.packageId, platExpressPackageRequest.packageId) &&
        Objects.equals(this.subOrderIds, platExpressPackageRequest.subOrderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, expressName, packageMemo, packageId, subOrderIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatExpressPackageRequest {\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    expressName: ").append(toIndentedString(expressName)).append("\n");
    sb.append("    packageMemo: ").append(toIndentedString(packageMemo)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    subOrderIds: ").append(toIndentedString(subOrderIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


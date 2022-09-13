/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platbusinessorderrefund.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrderExpressPackageInfo
 */
@JsonPropertyOrder({
  OrderExpressPackageInfo.JSON_PROPERTY_ORDER_ID,
  OrderExpressPackageInfo.JSON_PROPERTY_PASSPORT_ID,
  OrderExpressPackageInfo.JSON_PROPERTY_MEMO,
  OrderExpressPackageInfo.JSON_PROPERTY_TRACKING_NUMBER,
  OrderExpressPackageInfo.JSON_PROPERTY_COM_CODE,
  OrderExpressPackageInfo.JSON_PROPERTY_EXPRESS_NAME,
  OrderExpressPackageInfo.JSON_PROPERTY_STATUS,
  OrderExpressPackageInfo.JSON_PROPERTY_CREATE_TIME,
  OrderExpressPackageInfo.JSON_PROPERTY_UPDATE_TIME,
  OrderExpressPackageInfo.JSON_PROPERTY_CONSIGN_TIME,
  OrderExpressPackageInfo.JSON_PROPERTY_CONFIRM_TIME,
  OrderExpressPackageInfo.JSON_PROPERTY_DATA,
  OrderExpressPackageInfo.JSON_PROPERTY_PACKAGE_ID
})
@JsonTypeName("OrderExpressPackageInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderExpressPackageInfo {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_PASSPORT_ID = "passportId";
  private Long passportId;

  public static final String JSON_PROPERTY_MEMO = "memo";
  private String memo;

  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  private String trackingNumber;

  public static final String JSON_PROPERTY_COM_CODE = "comCode";
  private String comCode;

  public static final String JSON_PROPERTY_EXPRESS_NAME = "expressName";
  private String expressName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private String createTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private String updateTime;

  public static final String JSON_PROPERTY_CONSIGN_TIME = "consignTime";
  private String consignTime;

  public static final String JSON_PROPERTY_CONFIRM_TIME = "confirmTime";
  private String confirmTime;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_PACKAGE_ID = "packageId";
  private Long packageId;

  public OrderExpressPackageInfo() { 
  }

  public OrderExpressPackageInfo orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public OrderExpressPackageInfo passportId(Long passportId) {
    
    this.passportId = passportId;
    return this;
  }

   /**
   * Get passportId
   * @return passportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPassportId() {
    return passportId;
  }


  @JsonProperty(JSON_PROPERTY_PASSPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassportId(Long passportId) {
    this.passportId = passportId;
  }


  public OrderExpressPackageInfo memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemo() {
    return memo;
  }


  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemo(String memo) {
    this.memo = memo;
  }


  public OrderExpressPackageInfo trackingNumber(String trackingNumber) {
    
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


  public OrderExpressPackageInfo comCode(String comCode) {
    
    this.comCode = comCode;
    return this;
  }

   /**
   * Get comCode
   * @return comCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COM_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComCode() {
    return comCode;
  }


  @JsonProperty(JSON_PROPERTY_COM_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComCode(String comCode) {
    this.comCode = comCode;
  }


  public OrderExpressPackageInfo expressName(String expressName) {
    
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


  public OrderExpressPackageInfo status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public OrderExpressPackageInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public OrderExpressPackageInfo updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public OrderExpressPackageInfo consignTime(String consignTime) {
    
    this.consignTime = consignTime;
    return this;
  }

   /**
   * Get consignTime
   * @return consignTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSIGN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConsignTime() {
    return consignTime;
  }


  @JsonProperty(JSON_PROPERTY_CONSIGN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsignTime(String consignTime) {
    this.consignTime = consignTime;
  }


  public OrderExpressPackageInfo confirmTime(String confirmTime) {
    
    this.confirmTime = confirmTime;
    return this;
  }

   /**
   * Get confirmTime
   * @return confirmTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIRM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfirmTime() {
    return confirmTime;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmTime(String confirmTime) {
    this.confirmTime = confirmTime;
  }


  public OrderExpressPackageInfo data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public OrderExpressPackageInfo packageId(Long packageId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExpressPackageInfo orderExpressPackageInfo = (OrderExpressPackageInfo) o;
    return Objects.equals(this.orderId, orderExpressPackageInfo.orderId) &&
        Objects.equals(this.passportId, orderExpressPackageInfo.passportId) &&
        Objects.equals(this.memo, orderExpressPackageInfo.memo) &&
        Objects.equals(this.trackingNumber, orderExpressPackageInfo.trackingNumber) &&
        Objects.equals(this.comCode, orderExpressPackageInfo.comCode) &&
        Objects.equals(this.expressName, orderExpressPackageInfo.expressName) &&
        Objects.equals(this.status, orderExpressPackageInfo.status) &&
        Objects.equals(this.createTime, orderExpressPackageInfo.createTime) &&
        Objects.equals(this.updateTime, orderExpressPackageInfo.updateTime) &&
        Objects.equals(this.consignTime, orderExpressPackageInfo.consignTime) &&
        Objects.equals(this.confirmTime, orderExpressPackageInfo.confirmTime) &&
        Objects.equals(this.data, orderExpressPackageInfo.data) &&
        Objects.equals(this.packageId, orderExpressPackageInfo.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, passportId, memo, trackingNumber, comCode, expressName, status, createTime, updateTime, consignTime, confirmTime, data, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExpressPackageInfo {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    passportId: ").append(toIndentedString(passportId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    comCode: ").append(toIndentedString(comCode)).append("\n");
    sb.append("    expressName: ").append(toIndentedString(expressName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    consignTime: ").append(toIndentedString(consignTime)).append("\n");
    sb.append("    confirmTime: ").append(toIndentedString(confirmTime)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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


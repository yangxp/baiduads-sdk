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
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.PageInfo;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.model.RefundItemVo;
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
 * RefundListVo
 */
@JsonPropertyOrder({
  RefundListVo.JSON_PROPERTY_PAGE_INFO,
  RefundListVo.JSON_PROPERTY_LIST
})
@JsonTypeName("RefundListVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundListVo {
  public static final String JSON_PROPERTY_PAGE_INFO = "pageInfo";
  private PageInfo pageInfo;

  public static final String JSON_PROPERTY_LIST = "list";
  private List<RefundItemVo> list = null;

  public RefundListVo() { 
  }

  public RefundListVo pageInfo(PageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageInfo getPageInfo() {
    return pageInfo;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public RefundListVo list(List<RefundItemVo> list) {
    
    this.list = list;
    return this;
  }

  public RefundListVo addListItem(RefundItemVo listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RefundItemVo> getList() {
    return list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setList(List<RefundItemVo> list) {
    this.list = list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundListVo refundListVo = (RefundListVo) o;
    return Objects.equals(this.pageInfo, refundListVo.pageInfo) &&
        Objects.equals(this.list, refundListVo.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundListVo {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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


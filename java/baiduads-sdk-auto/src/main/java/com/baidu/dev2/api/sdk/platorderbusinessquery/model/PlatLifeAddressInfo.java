/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platorderbusinessquery.model;

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
 * PlatLifeAddressInfo
 */
@JsonPropertyOrder({
  PlatLifeAddressInfo.JSON_PROPERTY_AREA,
  PlatLifeAddressInfo.JSON_PROPERTY_CITY,
  PlatLifeAddressInfo.JSON_PROPERTY_TOWN,
  PlatLifeAddressInfo.JSON_PROPERTY_ADDRESS,
  PlatLifeAddressInfo.JSON_PROPERTY_PROVINCE
})
@JsonTypeName("PlatLifeAddressInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatLifeAddressInfo {
  public static final String JSON_PROPERTY_AREA = "area";
  private String area;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_TOWN = "town";
  private String town;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_PROVINCE = "province";
  private String province;

  public PlatLifeAddressInfo() { 
  }

  public PlatLifeAddressInfo area(String area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArea() {
    return area;
  }


  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArea(String area) {
    this.area = area;
  }


  public PlatLifeAddressInfo city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public PlatLifeAddressInfo town(String town) {
    
    this.town = town;
    return this;
  }

   /**
   * Get town
   * @return town
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTown() {
    return town;
  }


  @JsonProperty(JSON_PROPERTY_TOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTown(String town) {
    this.town = town;
  }


  public PlatLifeAddressInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public PlatLifeAddressInfo province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvince() {
    return province;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvince(String province) {
    this.province = province;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatLifeAddressInfo platLifeAddressInfo = (PlatLifeAddressInfo) o;
    return Objects.equals(this.area, platLifeAddressInfo.area) &&
        Objects.equals(this.city, platLifeAddressInfo.city) &&
        Objects.equals(this.town, platLifeAddressInfo.town) &&
        Objects.equals(this.address, platLifeAddressInfo.address) &&
        Objects.equals(this.province, platLifeAddressInfo.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, city, town, address, province);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatLifeAddressInfo {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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


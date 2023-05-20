/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaignshopping.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.campaignshopping.model.CampaignShoppingType;
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
 * ModCampaignRequest
 */
@JsonPropertyOrder({
  ModCampaignRequest.JSON_PROPERTY_CAMPAIGN_SHOPPING_TYPES
})
@JsonTypeName("ModCampaignRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModCampaignRequest {
  public static final String JSON_PROPERTY_CAMPAIGN_SHOPPING_TYPES = "campaignShoppingTypes";
  private List<CampaignShoppingType> campaignShoppingTypes = null;

  public ModCampaignRequest() { 
  }

  public ModCampaignRequest campaignShoppingTypes(List<CampaignShoppingType> campaignShoppingTypes) {
    
    this.campaignShoppingTypes = campaignShoppingTypes;
    return this;
  }

  public ModCampaignRequest addCampaignShoppingTypesItem(CampaignShoppingType campaignShoppingTypesItem) {
    if (this.campaignShoppingTypes == null) {
      this.campaignShoppingTypes = new ArrayList<>();
    }
    this.campaignShoppingTypes.add(campaignShoppingTypesItem);
    return this;
  }

   /**
   * Get campaignShoppingTypes
   * @return campaignShoppingTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHOPPING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignShoppingType> getCampaignShoppingTypes() {
    return campaignShoppingTypes;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHOPPING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignShoppingTypes(List<CampaignShoppingType> campaignShoppingTypes) {
    this.campaignShoppingTypes = campaignShoppingTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModCampaignRequest modCampaignRequest = (ModCampaignRequest) o;
    return Objects.equals(this.campaignShoppingTypes, modCampaignRequest.campaignShoppingTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignShoppingTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModCampaignRequest {\n");
    sb.append("    campaignShoppingTypes: ").append(toIndentedString(campaignShoppingTypes)).append("\n");
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


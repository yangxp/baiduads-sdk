/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialbrandmod.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialbrandmod.model.BrandImage;
import com.baidu.dev2.api.sdk.materialbrandmod.model.BrandVideo;
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
 * TeslaBrandAddRequest
 */
@JsonPropertyOrder({
  TeslaBrandAddRequest.JSON_PROPERTY_STATUS,
  TeslaBrandAddRequest.JSON_PROPERTY_NAME,
  TeslaBrandAddRequest.JSON_PROPERTY_LOGO,
  TeslaBrandAddRequest.JSON_PROPERTY_SLOGAN,
  TeslaBrandAddRequest.JSON_PROPERTY_SERVICE_SCOPE,
  TeslaBrandAddRequest.JSON_PROPERTY_ADVANTAGE,
  TeslaBrandAddRequest.JSON_PROPERTY_BRAND_STORY,
  TeslaBrandAddRequest.JSON_PROPERTY_VIDEO,
  TeslaBrandAddRequest.JSON_PROPERTY_QUALIFICATION,
  TeslaBrandAddRequest.JSON_PROPERTY_IMAGE
})
@JsonTypeName("TeslaBrandAddRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaBrandAddRequest {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private List<BrandImage> logo = null;

  public static final String JSON_PROPERTY_SLOGAN = "slogan";
  private String slogan;

  public static final String JSON_PROPERTY_SERVICE_SCOPE = "serviceScope";
  private String serviceScope;

  public static final String JSON_PROPERTY_ADVANTAGE = "advantage";
  private List<String> advantage = null;

  public static final String JSON_PROPERTY_BRAND_STORY = "brandStory";
  private String brandStory;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private List<BrandVideo> video = null;

  public static final String JSON_PROPERTY_QUALIFICATION = "qualification";
  private List<BrandImage> qualification = null;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private List<BrandImage> image = null;

  public TeslaBrandAddRequest() { 
  }

  public TeslaBrandAddRequest status(Integer status) {
    
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


  public TeslaBrandAddRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TeslaBrandAddRequest logo(List<BrandImage> logo) {
    
    this.logo = logo;
    return this;
  }

  public TeslaBrandAddRequest addLogoItem(BrandImage logoItem) {
    if (this.logo == null) {
      this.logo = new ArrayList<>();
    }
    this.logo.add(logoItem);
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BrandImage> getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(List<BrandImage> logo) {
    this.logo = logo;
  }


  public TeslaBrandAddRequest slogan(String slogan) {
    
    this.slogan = slogan;
    return this;
  }

   /**
   * Get slogan
   * @return slogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLOGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlogan() {
    return slogan;
  }


  @JsonProperty(JSON_PROPERTY_SLOGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }


  public TeslaBrandAddRequest serviceScope(String serviceScope) {
    
    this.serviceScope = serviceScope;
    return this;
  }

   /**
   * Get serviceScope
   * @return serviceScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceScope() {
    return serviceScope;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceScope(String serviceScope) {
    this.serviceScope = serviceScope;
  }


  public TeslaBrandAddRequest advantage(List<String> advantage) {
    
    this.advantage = advantage;
    return this;
  }

  public TeslaBrandAddRequest addAdvantageItem(String advantageItem) {
    if (this.advantage == null) {
      this.advantage = new ArrayList<>();
    }
    this.advantage.add(advantageItem);
    return this;
  }

   /**
   * Get advantage
   * @return advantage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADVANTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdvantage() {
    return advantage;
  }


  @JsonProperty(JSON_PROPERTY_ADVANTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvantage(List<String> advantage) {
    this.advantage = advantage;
  }


  public TeslaBrandAddRequest brandStory(String brandStory) {
    
    this.brandStory = brandStory;
    return this;
  }

   /**
   * Get brandStory
   * @return brandStory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_STORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandStory() {
    return brandStory;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_STORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandStory(String brandStory) {
    this.brandStory = brandStory;
  }


  public TeslaBrandAddRequest video(List<BrandVideo> video) {
    
    this.video = video;
    return this;
  }

  public TeslaBrandAddRequest addVideoItem(BrandVideo videoItem) {
    if (this.video == null) {
      this.video = new ArrayList<>();
    }
    this.video.add(videoItem);
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BrandVideo> getVideo() {
    return video;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(List<BrandVideo> video) {
    this.video = video;
  }


  public TeslaBrandAddRequest qualification(List<BrandImage> qualification) {
    
    this.qualification = qualification;
    return this;
  }

  public TeslaBrandAddRequest addQualificationItem(BrandImage qualificationItem) {
    if (this.qualification == null) {
      this.qualification = new ArrayList<>();
    }
    this.qualification.add(qualificationItem);
    return this;
  }

   /**
   * Get qualification
   * @return qualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUALIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BrandImage> getQualification() {
    return qualification;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQualification(List<BrandImage> qualification) {
    this.qualification = qualification;
  }


  public TeslaBrandAddRequest image(List<BrandImage> image) {
    
    this.image = image;
    return this;
  }

  public TeslaBrandAddRequest addImageItem(BrandImage imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BrandImage> getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(List<BrandImage> image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaBrandAddRequest teslaBrandAddRequest = (TeslaBrandAddRequest) o;
    return Objects.equals(this.status, teslaBrandAddRequest.status) &&
        Objects.equals(this.name, teslaBrandAddRequest.name) &&
        Objects.equals(this.logo, teslaBrandAddRequest.logo) &&
        Objects.equals(this.slogan, teslaBrandAddRequest.slogan) &&
        Objects.equals(this.serviceScope, teslaBrandAddRequest.serviceScope) &&
        Objects.equals(this.advantage, teslaBrandAddRequest.advantage) &&
        Objects.equals(this.brandStory, teslaBrandAddRequest.brandStory) &&
        Objects.equals(this.video, teslaBrandAddRequest.video) &&
        Objects.equals(this.qualification, teslaBrandAddRequest.qualification) &&
        Objects.equals(this.image, teslaBrandAddRequest.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, name, logo, slogan, serviceScope, advantage, brandStory, video, qualification, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaBrandAddRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    serviceScope: ").append(toIndentedString(serviceScope)).append("\n");
    sb.append("    advantage: ").append(toIndentedString(advantage)).append("\n");
    sb.append("    brandStory: ").append(toIndentedString(brandStory)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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


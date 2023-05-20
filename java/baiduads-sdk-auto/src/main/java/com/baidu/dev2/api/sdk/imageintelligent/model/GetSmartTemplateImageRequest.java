/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imageintelligent.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.imageintelligent.model.ImageSize;
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
 * GetSmartTemplateImageRequest
 */
@JsonPropertyOrder({
  GetSmartTemplateImageRequest.JSON_PROPERTY_MAJOR_WORD,
  GetSmartTemplateImageRequest.JSON_PROPERTY_MINOR_WORD,
  GetSmartTemplateImageRequest.JSON_PROPERTY_GUIDE_WORD,
  GetSmartTemplateImageRequest.JSON_PROPERTY_URL,
  GetSmartTemplateImageRequest.JSON_PROPERTY_LOGO_URL,
  GetSmartTemplateImageRequest.JSON_PROPERTY_LOGO_POSITION,
  GetSmartTemplateImageRequest.JSON_PROPERTY_IMAGE_SIZES,
  GetSmartTemplateImageRequest.JSON_PROPERTY_SAVE_TO_MY_REPOSITORY,
  GetSmartTemplateImageRequest.JSON_PROPERTY_INDUSTRY,
  GetSmartTemplateImageRequest.JSON_PROPERTY_DRAFT_TYPE,
  GetSmartTemplateImageRequest.JSON_PROPERTY_SUPPORT_TRANSPARENT
})
@JsonTypeName("GetSmartTemplateImageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSmartTemplateImageRequest {
  public static final String JSON_PROPERTY_MAJOR_WORD = "majorWord";
  private String majorWord;

  public static final String JSON_PROPERTY_MINOR_WORD = "minorWord";
  private String minorWord;

  public static final String JSON_PROPERTY_GUIDE_WORD = "guideWord";
  private String guideWord;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_LOGO_URL = "logoUrl";
  private String logoUrl;

  public static final String JSON_PROPERTY_LOGO_POSITION = "logoPosition";
  private String logoPosition;

  public static final String JSON_PROPERTY_IMAGE_SIZES = "imageSizes";
  private List<ImageSize> imageSizes = null;

  public static final String JSON_PROPERTY_SAVE_TO_MY_REPOSITORY = "saveToMyRepository";
  private Boolean saveToMyRepository;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private String industry;

  public static final String JSON_PROPERTY_DRAFT_TYPE = "draftType";
  private Integer draftType;

  public static final String JSON_PROPERTY_SUPPORT_TRANSPARENT = "supportTransparent";
  private Integer supportTransparent;

  public GetSmartTemplateImageRequest() { 
  }

  public GetSmartTemplateImageRequest majorWord(String majorWord) {
    
    this.majorWord = majorWord;
    return this;
  }

   /**
   * Get majorWord
   * @return majorWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAJOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMajorWord() {
    return majorWord;
  }


  @JsonProperty(JSON_PROPERTY_MAJOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMajorWord(String majorWord) {
    this.majorWord = majorWord;
  }


  public GetSmartTemplateImageRequest minorWord(String minorWord) {
    
    this.minorWord = minorWord;
    return this;
  }

   /**
   * Get minorWord
   * @return minorWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinorWord() {
    return minorWord;
  }


  @JsonProperty(JSON_PROPERTY_MINOR_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinorWord(String minorWord) {
    this.minorWord = minorWord;
  }


  public GetSmartTemplateImageRequest guideWord(String guideWord) {
    
    this.guideWord = guideWord;
    return this;
  }

   /**
   * Get guideWord
   * @return guideWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GUIDE_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuideWord() {
    return guideWord;
  }


  @JsonProperty(JSON_PROPERTY_GUIDE_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuideWord(String guideWord) {
    this.guideWord = guideWord;
  }


  public GetSmartTemplateImageRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public GetSmartTemplateImageRequest logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public GetSmartTemplateImageRequest logoPosition(String logoPosition) {
    
    this.logoPosition = logoPosition;
    return this;
  }

   /**
   * Get logoPosition
   * @return logoPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoPosition() {
    return logoPosition;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoPosition(String logoPosition) {
    this.logoPosition = logoPosition;
  }


  public GetSmartTemplateImageRequest imageSizes(List<ImageSize> imageSizes) {
    
    this.imageSizes = imageSizes;
    return this;
  }

  public GetSmartTemplateImageRequest addImageSizesItem(ImageSize imageSizesItem) {
    if (this.imageSizes == null) {
      this.imageSizes = new ArrayList<>();
    }
    this.imageSizes.add(imageSizesItem);
    return this;
  }

   /**
   * Get imageSizes
   * @return imageSizes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_SIZES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImageSize> getImageSizes() {
    return imageSizes;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_SIZES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageSizes(List<ImageSize> imageSizes) {
    this.imageSizes = imageSizes;
  }


  public GetSmartTemplateImageRequest saveToMyRepository(Boolean saveToMyRepository) {
    
    this.saveToMyRepository = saveToMyRepository;
    return this;
  }

   /**
   * Get saveToMyRepository
   * @return saveToMyRepository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAVE_TO_MY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSaveToMyRepository() {
    return saveToMyRepository;
  }


  @JsonProperty(JSON_PROPERTY_SAVE_TO_MY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveToMyRepository(Boolean saveToMyRepository) {
    this.saveToMyRepository = saveToMyRepository;
  }


  public GetSmartTemplateImageRequest industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public GetSmartTemplateImageRequest draftType(Integer draftType) {
    
    this.draftType = draftType;
    return this;
  }

   /**
   * Get draftType
   * @return draftType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRAFT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDraftType() {
    return draftType;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDraftType(Integer draftType) {
    this.draftType = draftType;
  }


  public GetSmartTemplateImageRequest supportTransparent(Integer supportTransparent) {
    
    this.supportTransparent = supportTransparent;
    return this;
  }

   /**
   * Get supportTransparent
   * @return supportTransparent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT_TRANSPARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSupportTransparent() {
    return supportTransparent;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_TRANSPARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportTransparent(Integer supportTransparent) {
    this.supportTransparent = supportTransparent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmartTemplateImageRequest getSmartTemplateImageRequest = (GetSmartTemplateImageRequest) o;
    return Objects.equals(this.majorWord, getSmartTemplateImageRequest.majorWord) &&
        Objects.equals(this.minorWord, getSmartTemplateImageRequest.minorWord) &&
        Objects.equals(this.guideWord, getSmartTemplateImageRequest.guideWord) &&
        Objects.equals(this.url, getSmartTemplateImageRequest.url) &&
        Objects.equals(this.logoUrl, getSmartTemplateImageRequest.logoUrl) &&
        Objects.equals(this.logoPosition, getSmartTemplateImageRequest.logoPosition) &&
        Objects.equals(this.imageSizes, getSmartTemplateImageRequest.imageSizes) &&
        Objects.equals(this.saveToMyRepository, getSmartTemplateImageRequest.saveToMyRepository) &&
        Objects.equals(this.industry, getSmartTemplateImageRequest.industry) &&
        Objects.equals(this.draftType, getSmartTemplateImageRequest.draftType) &&
        Objects.equals(this.supportTransparent, getSmartTemplateImageRequest.supportTransparent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(majorWord, minorWord, guideWord, url, logoUrl, logoPosition, imageSizes, saveToMyRepository, industry, draftType, supportTransparent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartTemplateImageRequest {\n");
    sb.append("    majorWord: ").append(toIndentedString(majorWord)).append("\n");
    sb.append("    minorWord: ").append(toIndentedString(minorWord)).append("\n");
    sb.append("    guideWord: ").append(toIndentedString(guideWord)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    logoPosition: ").append(toIndentedString(logoPosition)).append("\n");
    sb.append("    imageSizes: ").append(toIndentedString(imageSizes)).append("\n");
    sb.append("    saveToMyRepository: ").append(toIndentedString(saveToMyRepository)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    draftType: ").append(toIndentedString(draftType)).append("\n");
    sb.append("    supportTransparent: ").append(toIndentedString(supportTransparent)).append("\n");
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


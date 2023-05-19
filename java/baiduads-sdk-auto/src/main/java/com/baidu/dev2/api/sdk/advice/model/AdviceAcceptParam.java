/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.AdgroupAutoTargetingInfo;
import com.baidu.dev2.api.sdk.advice.model.BusinessLabelAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.CampaignEquipmentAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.CampaignEstBudgetAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.CampaignRecBudgetAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.CreativeRecommendAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.FeedAccountBudgetAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.FeedCampaignAutoBidAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.FeedCampaignBudgetAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.FeedCreativeAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.FeedPluginInfo;
import com.baidu.dev2.api.sdk.advice.model.IndustryUrlAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.KeywordAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.KeywordUncorrelatedAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.LandingPageCorrelationInfo;
import com.baidu.dev2.api.sdk.advice.model.LandingPageInfo;
import com.baidu.dev2.api.sdk.advice.model.NgtWordAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.OcpcPriceInfo;
import com.baidu.dev2.api.sdk.advice.model.OcpcTransTypeAcceptInfo;
import com.baidu.dev2.api.sdk.advice.model.ProductSegmentInfo;
import com.baidu.dev2.api.sdk.advice.model.TargetPackageAcceptCampaign;
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
 * AdviceAcceptParam
 */
@JsonPropertyOrder({
  AdviceAcceptParam.JSON_PROPERTY_KEY_WORD,
  AdviceAcceptParam.JSON_PROPERTY_NGT_WORD,
  AdviceAcceptParam.JSON_PROPERTY_INDUSTRY_URL,
  AdviceAcceptParam.JSON_PROPERTY_CAMPAIGN_BUDEGT,
  AdviceAcceptParam.JSON_PROPERTY_LANDING_PAGE_QUALITY,
  AdviceAcceptParam.JSON_PROPERTY_CREATIVE_RECOMMEND,
  AdviceAcceptParam.JSON_PROPERTY_OCPC_PRICE_INFO,
  AdviceAcceptParam.JSON_PROPERTY_BUSINESS_LABEL,
  AdviceAcceptParam.JSON_PROPERTY_FEED_CREATIVE_INFO,
  AdviceAcceptParam.JSON_PROPERTY_FEED_CAMPAIGN_BUDGET,
  AdviceAcceptParam.JSON_PROPERTY_FEED_ACCOUNT_BUDGET,
  AdviceAcceptParam.JSON_PROPERTY_LANDING_PAGE_CORRELATION,
  AdviceAcceptParam.JSON_PROPERTY_FEED_CAMPAIGN_AUTO_BID_INFO,
  AdviceAcceptParam.JSON_PROPERTY_FEED_PLUGIN_INFO,
  AdviceAcceptParam.JSON_PROPERTY_KEYWORD_UNCORRELATED,
  AdviceAcceptParam.JSON_PROPERTY_FC_ADGROUP_AUTO_TARGETING,
  AdviceAcceptParam.JSON_PROPERTY_PRODUCT_SEGMENT_INFO,
  AdviceAcceptParam.JSON_PROPERTY_ECPC_CAMPAIGN_EFFECT,
  AdviceAcceptParam.JSON_PROPERTY_OCPC_TRANS_TYPE_INFO,
  AdviceAcceptParam.JSON_PROPERTY_CAMPAIGN_EST_BUDGET,
  AdviceAcceptParam.JSON_PROPERTY_CAMPAIGN_EQUIPMENT
})
@JsonTypeName("AdviceAcceptParam")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdviceAcceptParam {
  public static final String JSON_PROPERTY_KEY_WORD = "keyWord";
  private KeywordAcceptInfo keyWord;

  public static final String JSON_PROPERTY_NGT_WORD = "ngtWord";
  private NgtWordAcceptInfo ngtWord;

  public static final String JSON_PROPERTY_INDUSTRY_URL = "industryUrl";
  private IndustryUrlAcceptInfo industryUrl;

  public static final String JSON_PROPERTY_CAMPAIGN_BUDEGT = "campaignBudegt";
  private CampaignRecBudgetAcceptInfo campaignBudegt;

  public static final String JSON_PROPERTY_LANDING_PAGE_QUALITY = "landingPageQuality";
  private LandingPageInfo landingPageQuality;

  public static final String JSON_PROPERTY_CREATIVE_RECOMMEND = "creativeRecommend";
  private CreativeRecommendAcceptInfo creativeRecommend;

  public static final String JSON_PROPERTY_OCPC_PRICE_INFO = "ocpcPriceInfo";
  private OcpcPriceInfo ocpcPriceInfo;

  public static final String JSON_PROPERTY_BUSINESS_LABEL = "businessLabel";
  private BusinessLabelAcceptInfo businessLabel;

  public static final String JSON_PROPERTY_FEED_CREATIVE_INFO = "feedCreativeInfo";
  private FeedCreativeAcceptInfo feedCreativeInfo;

  public static final String JSON_PROPERTY_FEED_CAMPAIGN_BUDGET = "feedCampaignBudget";
  private FeedCampaignBudgetAcceptInfo feedCampaignBudget;

  public static final String JSON_PROPERTY_FEED_ACCOUNT_BUDGET = "feedAccountBudget";
  private FeedAccountBudgetAcceptInfo feedAccountBudget;

  public static final String JSON_PROPERTY_LANDING_PAGE_CORRELATION = "landingPageCorrelation";
  private LandingPageCorrelationInfo landingPageCorrelation;

  public static final String JSON_PROPERTY_FEED_CAMPAIGN_AUTO_BID_INFO = "feedCampaignAutoBidInfo";
  private FeedCampaignAutoBidAcceptInfo feedCampaignAutoBidInfo;

  public static final String JSON_PROPERTY_FEED_PLUGIN_INFO = "feedPluginInfo";
  private FeedPluginInfo feedPluginInfo;

  public static final String JSON_PROPERTY_KEYWORD_UNCORRELATED = "keywordUncorrelated";
  private KeywordUncorrelatedAcceptInfo keywordUncorrelated;

  public static final String JSON_PROPERTY_FC_ADGROUP_AUTO_TARGETING = "fcAdgroupAutoTargeting";
  private AdgroupAutoTargetingInfo fcAdgroupAutoTargeting;

  public static final String JSON_PROPERTY_PRODUCT_SEGMENT_INFO = "productSegmentInfo";
  private ProductSegmentInfo productSegmentInfo;

  public static final String JSON_PROPERTY_ECPC_CAMPAIGN_EFFECT = "ecpcCampaignEffect";
  private TargetPackageAcceptCampaign ecpcCampaignEffect;

  public static final String JSON_PROPERTY_OCPC_TRANS_TYPE_INFO = "ocpcTransTypeInfo";
  private OcpcTransTypeAcceptInfo ocpcTransTypeInfo;

  public static final String JSON_PROPERTY_CAMPAIGN_EST_BUDGET = "campaignEstBudget";
  private CampaignEstBudgetAcceptInfo campaignEstBudget;

  public static final String JSON_PROPERTY_CAMPAIGN_EQUIPMENT = "campaignEquipment";
  private CampaignEquipmentAcceptInfo campaignEquipment;

  public AdviceAcceptParam() { 
  }

  public AdviceAcceptParam keyWord(KeywordAcceptInfo keyWord) {
    
    this.keyWord = keyWord;
    return this;
  }

   /**
   * Get keyWord
   * @return keyWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordAcceptInfo getKeyWord() {
    return keyWord;
  }


  @JsonProperty(JSON_PROPERTY_KEY_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyWord(KeywordAcceptInfo keyWord) {
    this.keyWord = keyWord;
  }


  public AdviceAcceptParam ngtWord(NgtWordAcceptInfo ngtWord) {
    
    this.ngtWord = ngtWord;
    return this;
  }

   /**
   * Get ngtWord
   * @return ngtWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NGT_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NgtWordAcceptInfo getNgtWord() {
    return ngtWord;
  }


  @JsonProperty(JSON_PROPERTY_NGT_WORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNgtWord(NgtWordAcceptInfo ngtWord) {
    this.ngtWord = ngtWord;
  }


  public AdviceAcceptParam industryUrl(IndustryUrlAcceptInfo industryUrl) {
    
    this.industryUrl = industryUrl;
    return this;
  }

   /**
   * Get industryUrl
   * @return industryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndustryUrlAcceptInfo getIndustryUrl() {
    return industryUrl;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryUrl(IndustryUrlAcceptInfo industryUrl) {
    this.industryUrl = industryUrl;
  }


  public AdviceAcceptParam campaignBudegt(CampaignRecBudgetAcceptInfo campaignBudegt) {
    
    this.campaignBudegt = campaignBudegt;
    return this;
  }

   /**
   * Get campaignBudegt
   * @return campaignBudegt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUDEGT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignRecBudgetAcceptInfo getCampaignBudegt() {
    return campaignBudegt;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUDEGT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBudegt(CampaignRecBudgetAcceptInfo campaignBudegt) {
    this.campaignBudegt = campaignBudegt;
  }


  public AdviceAcceptParam landingPageQuality(LandingPageInfo landingPageQuality) {
    
    this.landingPageQuality = landingPageQuality;
    return this;
  }

   /**
   * Get landingPageQuality
   * @return landingPageQuality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LandingPageInfo getLandingPageQuality() {
    return landingPageQuality;
  }


  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandingPageQuality(LandingPageInfo landingPageQuality) {
    this.landingPageQuality = landingPageQuality;
  }


  public AdviceAcceptParam creativeRecommend(CreativeRecommendAcceptInfo creativeRecommend) {
    
    this.creativeRecommend = creativeRecommend;
    return this;
  }

   /**
   * Get creativeRecommend
   * @return creativeRecommend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_RECOMMEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreativeRecommendAcceptInfo getCreativeRecommend() {
    return creativeRecommend;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_RECOMMEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeRecommend(CreativeRecommendAcceptInfo creativeRecommend) {
    this.creativeRecommend = creativeRecommend;
  }


  public AdviceAcceptParam ocpcPriceInfo(OcpcPriceInfo ocpcPriceInfo) {
    
    this.ocpcPriceInfo = ocpcPriceInfo;
    return this;
  }

   /**
   * Get ocpcPriceInfo
   * @return ocpcPriceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_PRICE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OcpcPriceInfo getOcpcPriceInfo() {
    return ocpcPriceInfo;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_PRICE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcPriceInfo(OcpcPriceInfo ocpcPriceInfo) {
    this.ocpcPriceInfo = ocpcPriceInfo;
  }


  public AdviceAcceptParam businessLabel(BusinessLabelAcceptInfo businessLabel) {
    
    this.businessLabel = businessLabel;
    return this;
  }

   /**
   * Get businessLabel
   * @return businessLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BusinessLabelAcceptInfo getBusinessLabel() {
    return businessLabel;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLabel(BusinessLabelAcceptInfo businessLabel) {
    this.businessLabel = businessLabel;
  }


  public AdviceAcceptParam feedCreativeInfo(FeedCreativeAcceptInfo feedCreativeInfo) {
    
    this.feedCreativeInfo = feedCreativeInfo;
    return this;
  }

   /**
   * Get feedCreativeInfo
   * @return feedCreativeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_CREATIVE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedCreativeAcceptInfo getFeedCreativeInfo() {
    return feedCreativeInfo;
  }


  @JsonProperty(JSON_PROPERTY_FEED_CREATIVE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedCreativeInfo(FeedCreativeAcceptInfo feedCreativeInfo) {
    this.feedCreativeInfo = feedCreativeInfo;
  }


  public AdviceAcceptParam feedCampaignBudget(FeedCampaignBudgetAcceptInfo feedCampaignBudget) {
    
    this.feedCampaignBudget = feedCampaignBudget;
    return this;
  }

   /**
   * Get feedCampaignBudget
   * @return feedCampaignBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_CAMPAIGN_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedCampaignBudgetAcceptInfo getFeedCampaignBudget() {
    return feedCampaignBudget;
  }


  @JsonProperty(JSON_PROPERTY_FEED_CAMPAIGN_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedCampaignBudget(FeedCampaignBudgetAcceptInfo feedCampaignBudget) {
    this.feedCampaignBudget = feedCampaignBudget;
  }


  public AdviceAcceptParam feedAccountBudget(FeedAccountBudgetAcceptInfo feedAccountBudget) {
    
    this.feedAccountBudget = feedAccountBudget;
    return this;
  }

   /**
   * Get feedAccountBudget
   * @return feedAccountBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_ACCOUNT_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedAccountBudgetAcceptInfo getFeedAccountBudget() {
    return feedAccountBudget;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ACCOUNT_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAccountBudget(FeedAccountBudgetAcceptInfo feedAccountBudget) {
    this.feedAccountBudget = feedAccountBudget;
  }


  public AdviceAcceptParam landingPageCorrelation(LandingPageCorrelationInfo landingPageCorrelation) {
    
    this.landingPageCorrelation = landingPageCorrelation;
    return this;
  }

   /**
   * Get landingPageCorrelation
   * @return landingPageCorrelation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_CORRELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LandingPageCorrelationInfo getLandingPageCorrelation() {
    return landingPageCorrelation;
  }


  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_CORRELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandingPageCorrelation(LandingPageCorrelationInfo landingPageCorrelation) {
    this.landingPageCorrelation = landingPageCorrelation;
  }


  public AdviceAcceptParam feedCampaignAutoBidInfo(FeedCampaignAutoBidAcceptInfo feedCampaignAutoBidInfo) {
    
    this.feedCampaignAutoBidInfo = feedCampaignAutoBidInfo;
    return this;
  }

   /**
   * Get feedCampaignAutoBidInfo
   * @return feedCampaignAutoBidInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_CAMPAIGN_AUTO_BID_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedCampaignAutoBidAcceptInfo getFeedCampaignAutoBidInfo() {
    return feedCampaignAutoBidInfo;
  }


  @JsonProperty(JSON_PROPERTY_FEED_CAMPAIGN_AUTO_BID_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedCampaignAutoBidInfo(FeedCampaignAutoBidAcceptInfo feedCampaignAutoBidInfo) {
    this.feedCampaignAutoBidInfo = feedCampaignAutoBidInfo;
  }


  public AdviceAcceptParam feedPluginInfo(FeedPluginInfo feedPluginInfo) {
    
    this.feedPluginInfo = feedPluginInfo;
    return this;
  }

   /**
   * Get feedPluginInfo
   * @return feedPluginInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_PLUGIN_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedPluginInfo getFeedPluginInfo() {
    return feedPluginInfo;
  }


  @JsonProperty(JSON_PROPERTY_FEED_PLUGIN_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedPluginInfo(FeedPluginInfo feedPluginInfo) {
    this.feedPluginInfo = feedPluginInfo;
  }


  public AdviceAcceptParam keywordUncorrelated(KeywordUncorrelatedAcceptInfo keywordUncorrelated) {
    
    this.keywordUncorrelated = keywordUncorrelated;
    return this;
  }

   /**
   * Get keywordUncorrelated
   * @return keywordUncorrelated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_UNCORRELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordUncorrelatedAcceptInfo getKeywordUncorrelated() {
    return keywordUncorrelated;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_UNCORRELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordUncorrelated(KeywordUncorrelatedAcceptInfo keywordUncorrelated) {
    this.keywordUncorrelated = keywordUncorrelated;
  }


  public AdviceAcceptParam fcAdgroupAutoTargeting(AdgroupAutoTargetingInfo fcAdgroupAutoTargeting) {
    
    this.fcAdgroupAutoTargeting = fcAdgroupAutoTargeting;
    return this;
  }

   /**
   * Get fcAdgroupAutoTargeting
   * @return fcAdgroupAutoTargeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FC_ADGROUP_AUTO_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdgroupAutoTargetingInfo getFcAdgroupAutoTargeting() {
    return fcAdgroupAutoTargeting;
  }


  @JsonProperty(JSON_PROPERTY_FC_ADGROUP_AUTO_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFcAdgroupAutoTargeting(AdgroupAutoTargetingInfo fcAdgroupAutoTargeting) {
    this.fcAdgroupAutoTargeting = fcAdgroupAutoTargeting;
  }


  public AdviceAcceptParam productSegmentInfo(ProductSegmentInfo productSegmentInfo) {
    
    this.productSegmentInfo = productSegmentInfo;
    return this;
  }

   /**
   * Get productSegmentInfo
   * @return productSegmentInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_SEGMENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductSegmentInfo getProductSegmentInfo() {
    return productSegmentInfo;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_SEGMENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductSegmentInfo(ProductSegmentInfo productSegmentInfo) {
    this.productSegmentInfo = productSegmentInfo;
  }


  public AdviceAcceptParam ecpcCampaignEffect(TargetPackageAcceptCampaign ecpcCampaignEffect) {
    
    this.ecpcCampaignEffect = ecpcCampaignEffect;
    return this;
  }

   /**
   * Get ecpcCampaignEffect
   * @return ecpcCampaignEffect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ECPC_CAMPAIGN_EFFECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TargetPackageAcceptCampaign getEcpcCampaignEffect() {
    return ecpcCampaignEffect;
  }


  @JsonProperty(JSON_PROPERTY_ECPC_CAMPAIGN_EFFECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcpcCampaignEffect(TargetPackageAcceptCampaign ecpcCampaignEffect) {
    this.ecpcCampaignEffect = ecpcCampaignEffect;
  }


  public AdviceAcceptParam ocpcTransTypeInfo(OcpcTransTypeAcceptInfo ocpcTransTypeInfo) {
    
    this.ocpcTransTypeInfo = ocpcTransTypeInfo;
    return this;
  }

   /**
   * Get ocpcTransTypeInfo
   * @return ocpcTransTypeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_TRANS_TYPE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OcpcTransTypeAcceptInfo getOcpcTransTypeInfo() {
    return ocpcTransTypeInfo;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_TRANS_TYPE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcTransTypeInfo(OcpcTransTypeAcceptInfo ocpcTransTypeInfo) {
    this.ocpcTransTypeInfo = ocpcTransTypeInfo;
  }


  public AdviceAcceptParam campaignEstBudget(CampaignEstBudgetAcceptInfo campaignEstBudget) {
    
    this.campaignEstBudget = campaignEstBudget;
    return this;
  }

   /**
   * Get campaignEstBudget
   * @return campaignEstBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_EST_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignEstBudgetAcceptInfo getCampaignEstBudget() {
    return campaignEstBudget;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_EST_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignEstBudget(CampaignEstBudgetAcceptInfo campaignEstBudget) {
    this.campaignEstBudget = campaignEstBudget;
  }


  public AdviceAcceptParam campaignEquipment(CampaignEquipmentAcceptInfo campaignEquipment) {
    
    this.campaignEquipment = campaignEquipment;
    return this;
  }

   /**
   * Get campaignEquipment
   * @return campaignEquipment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_EQUIPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignEquipmentAcceptInfo getCampaignEquipment() {
    return campaignEquipment;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_EQUIPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignEquipment(CampaignEquipmentAcceptInfo campaignEquipment) {
    this.campaignEquipment = campaignEquipment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdviceAcceptParam adviceAcceptParam = (AdviceAcceptParam) o;
    return Objects.equals(this.keyWord, adviceAcceptParam.keyWord) &&
        Objects.equals(this.ngtWord, adviceAcceptParam.ngtWord) &&
        Objects.equals(this.industryUrl, adviceAcceptParam.industryUrl) &&
        Objects.equals(this.campaignBudegt, adviceAcceptParam.campaignBudegt) &&
        Objects.equals(this.landingPageQuality, adviceAcceptParam.landingPageQuality) &&
        Objects.equals(this.creativeRecommend, adviceAcceptParam.creativeRecommend) &&
        Objects.equals(this.ocpcPriceInfo, adviceAcceptParam.ocpcPriceInfo) &&
        Objects.equals(this.businessLabel, adviceAcceptParam.businessLabel) &&
        Objects.equals(this.feedCreativeInfo, adviceAcceptParam.feedCreativeInfo) &&
        Objects.equals(this.feedCampaignBudget, adviceAcceptParam.feedCampaignBudget) &&
        Objects.equals(this.feedAccountBudget, adviceAcceptParam.feedAccountBudget) &&
        Objects.equals(this.landingPageCorrelation, adviceAcceptParam.landingPageCorrelation) &&
        Objects.equals(this.feedCampaignAutoBidInfo, adviceAcceptParam.feedCampaignAutoBidInfo) &&
        Objects.equals(this.feedPluginInfo, adviceAcceptParam.feedPluginInfo) &&
        Objects.equals(this.keywordUncorrelated, adviceAcceptParam.keywordUncorrelated) &&
        Objects.equals(this.fcAdgroupAutoTargeting, adviceAcceptParam.fcAdgroupAutoTargeting) &&
        Objects.equals(this.productSegmentInfo, adviceAcceptParam.productSegmentInfo) &&
        Objects.equals(this.ecpcCampaignEffect, adviceAcceptParam.ecpcCampaignEffect) &&
        Objects.equals(this.ocpcTransTypeInfo, adviceAcceptParam.ocpcTransTypeInfo) &&
        Objects.equals(this.campaignEstBudget, adviceAcceptParam.campaignEstBudget) &&
        Objects.equals(this.campaignEquipment, adviceAcceptParam.campaignEquipment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyWord, ngtWord, industryUrl, campaignBudegt, landingPageQuality, creativeRecommend, ocpcPriceInfo, businessLabel, feedCreativeInfo, feedCampaignBudget, feedAccountBudget, landingPageCorrelation, feedCampaignAutoBidInfo, feedPluginInfo, keywordUncorrelated, fcAdgroupAutoTargeting, productSegmentInfo, ecpcCampaignEffect, ocpcTransTypeInfo, campaignEstBudget, campaignEquipment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdviceAcceptParam {\n");
    sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
    sb.append("    ngtWord: ").append(toIndentedString(ngtWord)).append("\n");
    sb.append("    industryUrl: ").append(toIndentedString(industryUrl)).append("\n");
    sb.append("    campaignBudegt: ").append(toIndentedString(campaignBudegt)).append("\n");
    sb.append("    landingPageQuality: ").append(toIndentedString(landingPageQuality)).append("\n");
    sb.append("    creativeRecommend: ").append(toIndentedString(creativeRecommend)).append("\n");
    sb.append("    ocpcPriceInfo: ").append(toIndentedString(ocpcPriceInfo)).append("\n");
    sb.append("    businessLabel: ").append(toIndentedString(businessLabel)).append("\n");
    sb.append("    feedCreativeInfo: ").append(toIndentedString(feedCreativeInfo)).append("\n");
    sb.append("    feedCampaignBudget: ").append(toIndentedString(feedCampaignBudget)).append("\n");
    sb.append("    feedAccountBudget: ").append(toIndentedString(feedAccountBudget)).append("\n");
    sb.append("    landingPageCorrelation: ").append(toIndentedString(landingPageCorrelation)).append("\n");
    sb.append("    feedCampaignAutoBidInfo: ").append(toIndentedString(feedCampaignAutoBidInfo)).append("\n");
    sb.append("    feedPluginInfo: ").append(toIndentedString(feedPluginInfo)).append("\n");
    sb.append("    keywordUncorrelated: ").append(toIndentedString(keywordUncorrelated)).append("\n");
    sb.append("    fcAdgroupAutoTargeting: ").append(toIndentedString(fcAdgroupAutoTargeting)).append("\n");
    sb.append("    productSegmentInfo: ").append(toIndentedString(productSegmentInfo)).append("\n");
    sb.append("    ecpcCampaignEffect: ").append(toIndentedString(ecpcCampaignEffect)).append("\n");
    sb.append("    ocpcTransTypeInfo: ").append(toIndentedString(ocpcTransTypeInfo)).append("\n");
    sb.append("    campaignEstBudget: ").append(toIndentedString(campaignEstBudget)).append("\n");
    sb.append("    campaignEquipment: ").append(toIndentedString(campaignEquipment)).append("\n");
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


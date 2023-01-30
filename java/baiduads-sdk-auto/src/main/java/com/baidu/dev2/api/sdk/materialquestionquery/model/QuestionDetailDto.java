/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialquestionquery.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialquestionquery.model.ContentQualityDetail;
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
 * QuestionDetailDto
 */
@JsonPropertyOrder({
  QuestionDetailDto.JSON_PROPERTY_QUESTION_ID,
  QuestionDetailDto.JSON_PROPERTY_QUESTION,
  QuestionDetailDto.JSON_PROPERTY_ANSWER,
  QuestionDetailDto.JSON_PROPERTY_CATEGORY_ID,
  QuestionDetailDto.JSON_PROPERTY_CATEGORY_NAME,
  QuestionDetailDto.JSON_PROPERTY_STATUS,
  QuestionDetailDto.JSON_PROPERTY_AUDIT_REMARK,
  QuestionDetailDto.JSON_PROPERTY_RANK,
  QuestionDetailDto.JSON_PROPERTY_CREATE_TIME,
  QuestionDetailDto.JSON_PROPERTY_UPDATE_TIME,
  QuestionDetailDto.JSON_PROPERTY_REAUDIT_STATUS,
  QuestionDetailDto.JSON_PROPERTY_CONTENT_QUALITY_STATUS,
  QuestionDetailDto.JSON_PROPERTY_CONTENT_QUALITY_DETAIL,
  QuestionDetailDto.JSON_PROPERTY_TRADE_ID,
  QuestionDetailDto.JSON_PROPERTY_HUMAN_AUDIT
})
@JsonTypeName("QuestionDetailDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuestionDetailDto {
  public static final String JSON_PROPERTY_QUESTION_ID = "questionId";
  private Long questionId;

  public static final String JSON_PROPERTY_QUESTION = "question";
  private String question;

  public static final String JSON_PROPERTY_ANSWER = "answer";
  private String answer;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private Long categoryId;

  public static final String JSON_PROPERTY_CATEGORY_NAME = "categoryName";
  private String categoryName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_AUDIT_REMARK = "auditRemark";
  private String auditRemark;

  public static final String JSON_PROPERTY_RANK = "rank";
  private Integer rank;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private String createTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private String updateTime;

  public static final String JSON_PROPERTY_REAUDIT_STATUS = "reauditStatus";
  private Integer reauditStatus;

  public static final String JSON_PROPERTY_CONTENT_QUALITY_STATUS = "contentQualityStatus";
  private Integer contentQualityStatus;

  public static final String JSON_PROPERTY_CONTENT_QUALITY_DETAIL = "contentQualityDetail";
  private ContentQualityDetail contentQualityDetail;

  public static final String JSON_PROPERTY_TRADE_ID = "tradeId";
  private Long tradeId;

  public static final String JSON_PROPERTY_HUMAN_AUDIT = "humanAudit";
  private Integer humanAudit;

  public QuestionDetailDto() { 
  }

  public QuestionDetailDto questionId(Long questionId) {
    
    this.questionId = questionId;
    return this;
  }

   /**
   * Get questionId
   * @return questionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUESTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuestionId() {
    return questionId;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }


  public QuestionDetailDto question(String question) {
    
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuestion() {
    return question;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestion(String question) {
    this.question = question;
  }


  public QuestionDetailDto answer(String answer) {
    
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANSWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnswer() {
    return answer;
  }


  @JsonProperty(JSON_PROPERTY_ANSWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public QuestionDetailDto categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public QuestionDetailDto categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryName() {
    return categoryName;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public QuestionDetailDto status(Integer status) {
    
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


  public QuestionDetailDto auditRemark(String auditRemark) {
    
    this.auditRemark = auditRemark;
    return this;
  }

   /**
   * Get auditRemark
   * @return auditRemark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIT_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuditRemark() {
    return auditRemark;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditRemark(String auditRemark) {
    this.auditRemark = auditRemark;
  }


  public QuestionDetailDto rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRank() {
    return rank;
  }


  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public QuestionDetailDto createTime(String createTime) {
    
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


  public QuestionDetailDto updateTime(String updateTime) {
    
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


  public QuestionDetailDto reauditStatus(Integer reauditStatus) {
    
    this.reauditStatus = reauditStatus;
    return this;
  }

   /**
   * Get reauditStatus
   * @return reauditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REAUDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReauditStatus() {
    return reauditStatus;
  }


  @JsonProperty(JSON_PROPERTY_REAUDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReauditStatus(Integer reauditStatus) {
    this.reauditStatus = reauditStatus;
  }


  public QuestionDetailDto contentQualityStatus(Integer contentQualityStatus) {
    
    this.contentQualityStatus = contentQualityStatus;
    return this;
  }

   /**
   * Get contentQualityStatus
   * @return contentQualityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_QUALITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContentQualityStatus() {
    return contentQualityStatus;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_QUALITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentQualityStatus(Integer contentQualityStatus) {
    this.contentQualityStatus = contentQualityStatus;
  }


  public QuestionDetailDto contentQualityDetail(ContentQualityDetail contentQualityDetail) {
    
    this.contentQualityDetail = contentQualityDetail;
    return this;
  }

   /**
   * Get contentQualityDetail
   * @return contentQualityDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_QUALITY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentQualityDetail getContentQualityDetail() {
    return contentQualityDetail;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_QUALITY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentQualityDetail(ContentQualityDetail contentQualityDetail) {
    this.contentQualityDetail = contentQualityDetail;
  }


  public QuestionDetailDto tradeId(Long tradeId) {
    
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTradeId() {
    return tradeId;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
  }


  public QuestionDetailDto humanAudit(Integer humanAudit) {
    
    this.humanAudit = humanAudit;
    return this;
  }

   /**
   * Get humanAudit
   * @return humanAudit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HUMAN_AUDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHumanAudit() {
    return humanAudit;
  }


  @JsonProperty(JSON_PROPERTY_HUMAN_AUDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHumanAudit(Integer humanAudit) {
    this.humanAudit = humanAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionDetailDto questionDetailDto = (QuestionDetailDto) o;
    return Objects.equals(this.questionId, questionDetailDto.questionId) &&
        Objects.equals(this.question, questionDetailDto.question) &&
        Objects.equals(this.answer, questionDetailDto.answer) &&
        Objects.equals(this.categoryId, questionDetailDto.categoryId) &&
        Objects.equals(this.categoryName, questionDetailDto.categoryName) &&
        Objects.equals(this.status, questionDetailDto.status) &&
        Objects.equals(this.auditRemark, questionDetailDto.auditRemark) &&
        Objects.equals(this.rank, questionDetailDto.rank) &&
        Objects.equals(this.createTime, questionDetailDto.createTime) &&
        Objects.equals(this.updateTime, questionDetailDto.updateTime) &&
        Objects.equals(this.reauditStatus, questionDetailDto.reauditStatus) &&
        Objects.equals(this.contentQualityStatus, questionDetailDto.contentQualityStatus) &&
        Objects.equals(this.contentQualityDetail, questionDetailDto.contentQualityDetail) &&
        Objects.equals(this.tradeId, questionDetailDto.tradeId) &&
        Objects.equals(this.humanAudit, questionDetailDto.humanAudit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, question, answer, categoryId, categoryName, status, auditRemark, rank, createTime, updateTime, reauditStatus, contentQualityStatus, contentQualityDetail, tradeId, humanAudit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionDetailDto {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    auditRemark: ").append(toIndentedString(auditRemark)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    reauditStatus: ").append(toIndentedString(reauditStatus)).append("\n");
    sb.append("    contentQualityStatus: ").append(toIndentedString(contentQualityStatus)).append("\n");
    sb.append("    contentQualityDetail: ").append(toIndentedString(contentQualityDetail)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    humanAudit: ").append(toIndentedString(humanAudit)).append("\n");
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


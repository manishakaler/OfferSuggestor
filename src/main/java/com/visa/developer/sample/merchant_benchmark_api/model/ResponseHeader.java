/* ----------------------------------------------------------------------------------------------------------------------
* © Copyright 2018 Visa. All Rights Reserved.
*
* NOTICE: The software and accompanying information and documentation (together, the “Software”) remain the property of
* and are proprietary to Visa and its suppliers and affiliates. The Software remains protected by intellectual property
* rights and may be covered by U.S. and foreign patents or patent applications. The Software is licensed and not sold.
*
* By accessing the Software you are agreeing to Visa's terms of use (developer.visa.com/terms) and privacy policy
* (developer.visa.com/privacy). In addition, all permissible uses of the Software must be in support of Visa products,
* programs and services provided through the Visa Developer Program (VDP) platform only (developer.visa.com).
* THE SOFTWARE AND ANY ASSOCIATED INFORMATION OR DOCUMENTATION IS PROVIDED ON AN “AS IS,” “AS AVAILABLE,” “WITH ALL
* FAULTS” BASIS WITHOUT WARRANTY OR CONDITION OF ANY KIND. YOUR USE IS AT YOUR OWN RISK.
---------------------------------------------------------------------------------------------------------------------- */

/*
 * Merchant Benchmark API
 * Deliver Visa’s data insights and other key analytics to our clients through the Visa Developer Platform
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.visa.developer.sample.merchant_benchmark_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ResponseHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:48:57.711+05:30[Asia/Kolkata]")
public class ResponseHeader {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("responseMessageId")
  private String responseMessageId = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("messageDateTime")
  private String messageDateTime = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("numRecordsReturned")
  private Integer numRecordsReturned = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("requestMessageId")
  private String requestMessageId = null;
  
  public ResponseHeader responseMessageId(String responseMessageId) {
    this.responseMessageId = responseMessageId;
    return this;
  }

  
  /**
  * A combination of Service Id, Application Id, an Integer and current Timestamp that uniquely identifies the current request-response processing
  * @return responseMessageId
  **/
  @ApiModelProperty(required = true, value = "A combination of Service Id, Application Id, an Integer and current Timestamp that uniquely identifies the current request-response processing")
  public String getResponseMessageId() {
    return responseMessageId;
  }
  public void setResponseMessageId(String responseMessageId) {
    this.responseMessageId = responseMessageId;
  }
  
  public ResponseHeader messageDateTime(String messageDateTime) {
    this.messageDateTime = messageDateTime;
    return this;
  }

  
  /**
  * Date and time at which Response is sent (up to milliseconds in UTC). Ex: 2008-09-19T00:00:00.000
  * @return messageDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which Response is sent (up to milliseconds in UTC). Ex: 2008-09-19T00:00:00.000")
  public String getMessageDateTime() {
    return messageDateTime;
  }
  public void setMessageDateTime(String messageDateTime) {
    this.messageDateTime = messageDateTime;
  }
  
  public ResponseHeader numRecordsReturned(Integer numRecordsReturned) {
    this.numRecordsReturned = numRecordsReturned;
    return this;
  }

  
  /**
  * Number of records returned. Note: Matched records may differ from returned records if Max Records is defined or system limit is exceeded
  * @return numRecordsReturned
  **/
  @ApiModelProperty(required = true, value = "Number of records returned. Note: Matched records may differ from returned records if Max Records is defined or system limit is exceeded")
  public Integer getNumRecordsReturned() {
    return numRecordsReturned;
  }
  public void setNumRecordsReturned(Integer numRecordsReturned) {
    this.numRecordsReturned = numRecordsReturned;
  }
  
  public ResponseHeader requestMessageId(String requestMessageId) {
    this.requestMessageId = requestMessageId;
    return this;
  }

  
  /**
  * A string uniquely identifies the service request. Response will contain same Message Id as received from requesting application
  * @return requestMessageId
  **/
  @ApiModelProperty(required = true, value = "A string uniquely identifies the service request. Response will contain same Message Id as received from requesting application")
  public String getRequestMessageId() {
    return requestMessageId;
  }
  public void setRequestMessageId(String requestMessageId) {
    this.requestMessageId = requestMessageId;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeader responseHeader = (ResponseHeader) o;
    return Objects.equals(this.responseMessageId, responseHeader.responseMessageId) &&
        Objects.equals(this.messageDateTime, responseHeader.messageDateTime) &&
        Objects.equals(this.numRecordsReturned, responseHeader.numRecordsReturned) &&
        Objects.equals(this.requestMessageId, responseHeader.requestMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseMessageId, messageDateTime, numRecordsReturned, requestMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeader {\n");

    sb.append("    responseMessageId: ").append(toIndentedString(responseMessageId)).append("\n");
    sb.append("    messageDateTime: ").append(toIndentedString(messageDateTime)).append("\n");
    sb.append("    numRecordsReturned: ").append(toIndentedString(numRecordsReturned)).append("\n");
    sb.append("    requestMessageId: ").append(toIndentedString(requestMessageId)).append("\n");
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



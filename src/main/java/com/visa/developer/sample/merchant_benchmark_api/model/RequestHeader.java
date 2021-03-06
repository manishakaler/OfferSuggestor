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
 * RequestHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:48:57.711+05:30[Asia/Kolkata]")
public class RequestHeader {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("messageDateTime")
  private String messageDateTime = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("requestMessageId")
  private String requestMessageId = null;
  
  public RequestHeader messageDateTime(String messageDateTime) {
    this.messageDateTime = messageDateTime;
    return this;
  }

  
  /**
  * Date and time at which Request is sent (up to milliseconds in UTC). Ex: 2008-09-19T00:00:00.000
  * @return messageDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which Request is sent (up to milliseconds in UTC). Ex: 2008-09-19T00:00:00.000")
  public String getMessageDateTime() {
    return messageDateTime;
  }
  public void setMessageDateTime(String messageDateTime) {
    this.messageDateTime = messageDateTime;
  }
  
  public RequestHeader requestMessageId(String requestMessageId) {
    this.requestMessageId = requestMessageId;
    return this;
  }

  
  /**
  * A string which uniquely identifies the service request. Requesting application need to create this unique message Id
  * @return requestMessageId
  **/
  @ApiModelProperty(required = true, value = "A string which uniquely identifies the service request. Requesting application need to create this unique message Id")
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
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.messageDateTime, requestHeader.messageDateTime) &&
        Objects.equals(this.requestMessageId, requestHeader.requestMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageDateTime, requestMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");

    sb.append("    messageDateTime: ").append(toIndentedString(messageDateTime)).append("\n");
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




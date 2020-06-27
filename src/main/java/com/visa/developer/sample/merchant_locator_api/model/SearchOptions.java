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
 * Merchant Locator API
 * Find Visa accepting merchants around by geolocation
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.visa.developer.sample.merchant_locator_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SearchOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:49:03.812+05:30[Asia/Kolkata]")
public class SearchOptions {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("wildcard")
  private String wildcard = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("matchScore")
  private Boolean matchScore = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("maxRecords")
  private Integer maxRecords = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("proximity")
  private String proximity = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("matchIndicators")
  private Boolean matchIndicators = null;
  
  public SearchOptions wildcard(String wildcard) {
    this.wildcard = wildcard;
    return this;
  }

  
  /**
  * Allows user to search on Merchant Name using wildcards
  * @return wildcard
  **/
  @ApiModelProperty(required = true, value = "Allows user to search on Merchant Name using wildcards")
  public String getWildcard() {
    return wildcard;
  }
  public void setWildcard(String wildcard) {
    this.wildcard = wildcard;
  }
  
  public SearchOptions matchScore(Boolean matchScore) {
    this.matchScore = matchScore;
    return this;
  }

  
  /**
  * Allows user to define if they would like to see the matchScore and receive the response in order of MatchScore
  * @return matchScore
  **/
  @ApiModelProperty(required = true, value = "Allows user to define if they would like to see the matchScore and receive the response in order of MatchScore")
  public Boolean isMatchScore() {
    return matchScore;
  }
  public void setMatchScore(Boolean matchScore) {
    this.matchScore = matchScore;
  }
  
  public SearchOptions maxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
    return this;
  }

  
  /**
  * Allows user to define maximum number of records to be sent in the response. If the User doesn’t set the maxRecords the value will be set by default to 25. Note: Response records will be unique and sent in order of highest to lowest Match Score
  * @return maxRecords
  **/
  @ApiModelProperty(required = true, value = "Allows user to define maximum number of records to be sent in the response. If the User doesn’t set the maxRecords the value will be set by default to 25. Note: Response records will be unique and sent in order of highest to lowest Match Score")
  public Integer getMaxRecords() {
    return maxRecords;
  }
  public void setMaxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
  }
  
  public SearchOptions proximity(String proximity) {
    this.proximity = proximity;
    return this;
  }

  
  /**
  * Allows user to do a proximity search on Merchant Name (upto 1 spaces). Note: Proximity Search cannot be combined with Wildcard. If wildcards are used proximity will be ignored.
  * @return proximity
  **/
  @ApiModelProperty(required = true, value = "Allows user to do a proximity search on Merchant Name (upto 1 spaces). Note: Proximity Search cannot be combined with Wildcard. If wildcards are used proximity will be ignored.")
  public String getProximity() {
    return proximity;
  }
  public void setProximity(String proximity) {
    this.proximity = proximity;
  }
  
  public SearchOptions matchIndicators(Boolean matchIndicators) {
    this.matchIndicators = matchIndicators;
    return this;
  }

  
  /**
  * Allows user to define if they would like to see which request attributes found a matching record
  * @return matchIndicators
  **/
  @ApiModelProperty(required = true, value = "Allows user to define if they would like to see which request attributes found a matching record")
  public Boolean isMatchIndicators() {
    return matchIndicators;
  }
  public void setMatchIndicators(Boolean matchIndicators) {
    this.matchIndicators = matchIndicators;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOptions searchOptions = (SearchOptions) o;
    return Objects.equals(this.wildcard, searchOptions.wildcard) &&
        Objects.equals(this.matchScore, searchOptions.matchScore) &&
        Objects.equals(this.maxRecords, searchOptions.maxRecords) &&
        Objects.equals(this.proximity, searchOptions.proximity) &&
        Objects.equals(this.matchIndicators, searchOptions.matchIndicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wildcard, matchScore, maxRecords, proximity, matchIndicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOptions {\n");

    sb.append("    wildcard: ").append(toIndentedString(wildcard)).append("\n");
    sb.append("    matchScore: ").append(toIndentedString(matchScore)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
    sb.append("    proximity: ").append(toIndentedString(proximity)).append("\n");
    sb.append("    matchIndicators: ").append(toIndentedString(matchIndicators)).append("\n");
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



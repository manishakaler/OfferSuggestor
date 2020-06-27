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
 * Merchant Search API
 * Search for merchant identification data using the acquirer provide name and card acceptor identifiers
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.visa.developer.sample.merchant_search_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Objects;

/**
 * MerchantSearchpostPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:49:06.818+05:30[Asia/Kolkata]")
public class MerchantSearchpostPayload {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("responseAttrList")
  private List<String> responseAttrList = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("header")
  private Header header = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("searchAttrList")
  private SearchAttrList searchAttrList = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("searchOptions")
  private SearchOptions searchOptions = null;
  
  public MerchantSearchpostPayload responseAttrList(List<String> responseAttrList) {
    this.responseAttrList = responseAttrList;
    return this;
  }

  
  /**
  * oner or more of the Group Names assigned to the partner. Group Names define the attributes partners will receive in the response
  * @return responseAttrList
  **/
  @ApiModelProperty(required = true, value = "oner or more of the Group Names assigned to the partner. Group Names define the attributes partners will receive in the response")
  public List<String> getResponseAttrList() {
    return responseAttrList;
  }
  public void setResponseAttrList(List<String> responseAttrList) {
    this.responseAttrList = responseAttrList;
  }
  
  public MerchantSearchpostPayload header(Header header) {
    this.header = header;
    return this;
  }

  
  /**
  * Get header
  * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  public Header getHeader() {
    return header;
  }
  public void setHeader(Header header) {
    this.header = header;
  }
  
  public MerchantSearchpostPayload searchAttrList(SearchAttrList searchAttrList) {
    this.searchAttrList = searchAttrList;
    return this;
  }

  
  /**
  * Get searchAttrList
  * @return searchAttrList
  **/
  @ApiModelProperty(required = true, value = "")
  public SearchAttrList getSearchAttrList() {
    return searchAttrList;
  }
  public void setSearchAttrList(SearchAttrList searchAttrList) {
    this.searchAttrList = searchAttrList;
  }
  
  public MerchantSearchpostPayload searchOptions(SearchOptions searchOptions) {
    this.searchOptions = searchOptions;
    return this;
  }

  
  /**
  * Get searchOptions
  * @return searchOptions
  **/
  @ApiModelProperty(required = true, value = "")
  public SearchOptions getSearchOptions() {
    return searchOptions;
  }
  public void setSearchOptions(SearchOptions searchOptions) {
    this.searchOptions = searchOptions;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantSearchpostPayload merchantSearchpostPayload = (MerchantSearchpostPayload) o;
    return Objects.equals(this.responseAttrList, merchantSearchpostPayload.responseAttrList) &&
        Objects.equals(this.header, merchantSearchpostPayload.header) &&
        Objects.equals(this.searchAttrList, merchantSearchpostPayload.searchAttrList) &&
        Objects.equals(this.searchOptions, merchantSearchpostPayload.searchOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseAttrList, header, searchAttrList, searchOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSearchpostPayload {\n");

    sb.append("    responseAttrList: ").append(toIndentedString(responseAttrList)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    searchAttrList: ").append(toIndentedString(searchAttrList)).append("\n");
    sb.append("    searchOptions: ").append(toIndentedString(searchOptions)).append("\n");
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




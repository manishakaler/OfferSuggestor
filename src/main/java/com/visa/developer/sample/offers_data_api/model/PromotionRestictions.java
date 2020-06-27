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
 * Offers Data API
 * The Offers Data API provides developers a quick and easy way to retrieve offer information from VMORC. The API allows you to retrieve all your available offers or retrieve specific offers. In an offer-specific request, you may choose to filter your accessible offers by certain offer attributes or you may request for offers by its identifiers.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.visa.developer.sample.offers_data_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * PromotionRestictions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:49:33.222+05:30[Asia/Kolkata]")
public class PromotionRestictions {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("text")
  private String text = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("richText")
  private String richText = null;
  
  public PromotionRestictions text(String text) {
    this.text = text;
    return this;
  }

  
  /**
  * the text without styled tags. Max length: 2GB
  * @return text
  **/
  @ApiModelProperty(value = "the text without styled tags. Max length: 2GB")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  
  public PromotionRestictions richText(String richText) {
    this.richText = richText;
    return this;
  }

  
  /**
  * the text inputted with styled tags. Max length: 2GB
  * @return richText
  **/
  @ApiModelProperty(value = "the text inputted with styled tags. Max length: 2GB")
  public String getRichText() {
    return richText;
  }
  public void setRichText(String richText) {
    this.richText = richText;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionRestictions promotionRestictions = (PromotionRestictions) o;
    return Objects.equals(this.text, promotionRestictions.text) &&
        Objects.equals(this.richText, promotionRestictions.richText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, richText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionRestictions {\n");

    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    richText: ").append(toIndentedString(richText)).append("\n");
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




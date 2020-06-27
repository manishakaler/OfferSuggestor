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

import java.util.List;
import java.util.Objects;

/**
 * ImageListInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:49:33.222+05:30[Asia/Kolkata]")
public class ImageListInner {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("offerImagePromotionChannelIds")
  private List<Integer> offerImagePromotionChannelIds = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("imageFileWidth")
  private String imageFileWidth = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("imageResolution")
  private String imageResolution = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("imageFileHeight")
  private String imageFileHeight = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("description")
  private String description = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("offerImagePromotionChannels")
  private List<String> offerImagePromotionChannels = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("imageFileSize")
  private String imageFileSize = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("key")
  private Integer key = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("fileLocation")
  private String fileLocation = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("imageAltTag")
  private String imageAltTag = null;
  
  public ImageListInner offerImagePromotionChannelIds(List<Integer> offerImagePromotionChannelIds) {
    this.offerImagePromotionChannelIds = offerImagePromotionChannelIds;
    return this;
  }

  
  /**
  * the promotion channel ids associated to the offer image Only applicable for Offer Images; Not applicable for QR Codes or Barcodes
  * @return offerImagePromotionChannelIds
  **/
  @ApiModelProperty(value = "the promotion channel ids associated to the offer image Only applicable for Offer Images; Not applicable for QR Codes or Barcodes")
  public List<Integer> getOfferImagePromotionChannelIds() {
    return offerImagePromotionChannelIds;
  }
  public void setOfferImagePromotionChannelIds(List<Integer> offerImagePromotionChannelIds) {
    this.offerImagePromotionChannelIds = offerImagePromotionChannelIds;
  }
  
  public ImageListInner imageFileWidth(String imageFileWidth) {
    this.imageFileWidth = imageFileWidth;
    return this;
  }

  
  /**
  * the pixel width of the image Non-browser supported image (EPS, TIF) will return an empty String for this field.
  * @return imageFileWidth
  **/
  @ApiModelProperty(value = "the pixel width of the image Non-browser supported image (EPS, TIF) will return an empty String for this field.")
  public String getImageFileWidth() {
    return imageFileWidth;
  }
  public void setImageFileWidth(String imageFileWidth) {
    this.imageFileWidth = imageFileWidth;
  }
  
  public ImageListInner imageResolution(String imageResolution) {
    this.imageResolution = imageResolution;
    return this;
  }

  
  /**
  * the resolution of the image. Only applicable for Offer Images; Not applicable for QR Codes or Barcodes. Max length:6 characters
  * @return imageResolution
  **/
  @ApiModelProperty(value = "the resolution of the image. Only applicable for Offer Images; Not applicable for QR Codes or Barcodes. Max length:6 characters")
  public String getImageResolution() {
    return imageResolution;
  }
  public void setImageResolution(String imageResolution) {
    this.imageResolution = imageResolution;
  }
  
  public ImageListInner imageFileHeight(String imageFileHeight) {
    this.imageFileHeight = imageFileHeight;
    return this;
  }

  
  /**
  * the pixel height of the image Non-browser supported image (EPS, TIF) will return an empty String for this field.
  * @return imageFileHeight
  **/
  @ApiModelProperty(value = "the pixel height of the image Non-browser supported image (EPS, TIF) will return an empty String for this field.")
  public String getImageFileHeight() {
    return imageFileHeight;
  }
  public void setImageFileHeight(String imageFileHeight) {
    this.imageFileHeight = imageFileHeight;
  }
  
  public ImageListInner description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * the description of the image. May return an empty String. Only applicable for Offer Images; Not applicable for QR Codes or Barcodes. Max length: 1024 characters
  * @return description
  **/
  @ApiModelProperty(value = "the description of the image. May return an empty String. Only applicable for Offer Images; Not applicable for QR Codes or Barcodes. Max length: 1024 characters")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public ImageListInner offerImagePromotionChannels(List<String> offerImagePromotionChannels) {
    this.offerImagePromotionChannels = offerImagePromotionChannels;
    return this;
  }

  
  /**
  * the promotion channels associated to the offer image Only applicable for Offer Images; Not applicable for QR Codes or Barcodes
  * @return offerImagePromotionChannels
  **/
  @ApiModelProperty(value = "the promotion channels associated to the offer image Only applicable for Offer Images; Not applicable for QR Codes or Barcodes")
  public List<String> getOfferImagePromotionChannels() {
    return offerImagePromotionChannels;
  }
  public void setOfferImagePromotionChannels(List<String> offerImagePromotionChannels) {
    this.offerImagePromotionChannels = offerImagePromotionChannels;
  }
  
  public ImageListInner imageFileSize(String imageFileSize) {
    this.imageFileSize = imageFileSize;
    return this;
  }

  
  /**
  * the size of the image file (in KB)
  * @return imageFileSize
  **/
  @ApiModelProperty(value = "the size of the image file (in KB)")
  public String getImageFileSize() {
    return imageFileSize;
  }
  public void setImageFileSize(String imageFileSize) {
    this.imageFileSize = imageFileSize;
  }
  
  public ImageListInner key(Integer key) {
    this.key = key;
    return this;
  }

  
  /**
  * an identifier for the image
  * @return key
  **/
  @ApiModelProperty(value = "an identifier for the image")
  public Integer getKey() {
    return key;
  }
  public void setKey(Integer key) {
    this.key = key;
  }
  
  public ImageListInner fileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

  
  /**
  * the external location for the merchant image file. Max length: File path should be less than 1024 characters
  * @return fileLocation
  **/
  @ApiModelProperty(value = "the external location for the merchant image file. Max length: File path should be less than 1024 characters")
  public String getFileLocation() {
    return fileLocation;
  }
  public void setFileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
  }
  
  public ImageListInner imageAltTag(String imageAltTag) {
    this.imageAltTag = imageAltTag;
    return this;
  }

  
  /**
  * the alt tag for the image Only applicable for Offer Images; Not applicable for QR Codes or Barcodes
  * @return imageAltTag
  **/
  @ApiModelProperty(value = "the alt tag for the image Only applicable for Offer Images; Not applicable for QR Codes or Barcodes")
  public String getImageAltTag() {
    return imageAltTag;
  }
  public void setImageAltTag(String imageAltTag) {
    this.imageAltTag = imageAltTag;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageListInner imageListInner = (ImageListInner) o;
    return Objects.equals(this.offerImagePromotionChannelIds, imageListInner.offerImagePromotionChannelIds) &&
        Objects.equals(this.imageFileWidth, imageListInner.imageFileWidth) &&
        Objects.equals(this.imageResolution, imageListInner.imageResolution) &&
        Objects.equals(this.imageFileHeight, imageListInner.imageFileHeight) &&
        Objects.equals(this.description, imageListInner.description) &&
        Objects.equals(this.offerImagePromotionChannels, imageListInner.offerImagePromotionChannels) &&
        Objects.equals(this.imageFileSize, imageListInner.imageFileSize) &&
        Objects.equals(this.key, imageListInner.key) &&
        Objects.equals(this.fileLocation, imageListInner.fileLocation) &&
        Objects.equals(this.imageAltTag, imageListInner.imageAltTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerImagePromotionChannelIds, imageFileWidth, imageResolution, imageFileHeight, description, offerImagePromotionChannels, imageFileSize, key, fileLocation, imageAltTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageListInner {\n");

    sb.append("    offerImagePromotionChannelIds: ").append(toIndentedString(offerImagePromotionChannelIds)).append("\n");
    sb.append("    imageFileWidth: ").append(toIndentedString(imageFileWidth)).append("\n");
    sb.append("    imageResolution: ").append(toIndentedString(imageResolution)).append("\n");
    sb.append("    imageFileHeight: ").append(toIndentedString(imageFileHeight)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    offerImagePromotionChannels: ").append(toIndentedString(offerImagePromotionChannels)).append("\n");
    sb.append("    imageFileSize: ").append(toIndentedString(imageFileSize)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
    sb.append("    imageAltTag: ").append(toIndentedString(imageAltTag)).append("\n");
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




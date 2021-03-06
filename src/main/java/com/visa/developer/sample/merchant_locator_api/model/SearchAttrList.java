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

import java.util.List;
import java.util.Objects;

/**
 * SearchAttrList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:49:03.812+05:30[Asia/Kolkata]")
public class SearchAttrList {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("distance")
  private Integer distance = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantStreetAddress")
  private String merchantStreetAddress = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantCategoryCode")
  private List<String> merchantCategoryCode = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantName")
  private String merchantName = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantCity")
  private String merchantCity = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantState")
  private String merchantState = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("longitude")
  private String longitude = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("latitude")
  private String latitude = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantPhoneNumber")
  private Double merchantPhoneNumber = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantCountryCode")
  private Integer merchantCountryCode = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("distanceUnit")
  private String distanceUnit = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("merchantPostalCode")
  private String merchantPostalCode = null;
  
  public SearchAttrList distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  
  /**
  * Distance value should be in between 0 to 100
  * @return distance
  **/
  @ApiModelProperty(required = true, value = "Distance value should be in between 0 to 100")
  public Integer getDistance() {
    return distance;
  }
  public void setDistance(Integer distance) {
    this.distance = distance;
  }
  
  public SearchAttrList merchantStreetAddress(String merchantStreetAddress) {
    this.merchantStreetAddress = merchantStreetAddress;
    return this;
  }

  
  /**
  * Address of the registered Merchant
  * @return merchantStreetAddress
  **/
  @ApiModelProperty(required = true, value = "Address of the registered Merchant")
  public String getMerchantStreetAddress() {
    return merchantStreetAddress;
  }
  public void setMerchantStreetAddress(String merchantStreetAddress) {
    this.merchantStreetAddress = merchantStreetAddress;
  }
  
  public SearchAttrList merchantCategoryCode(List<String> merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  
  /**
  * Category Code Array of the registered Merchant. Note: Merchant Name or Merchant Category Code is Mandatory, cannot have both. Merchant Category Code can be more than one with a comma separation
  * @return merchantCategoryCode
  **/
  @ApiModelProperty(required = true, value = "Category Code Array of the registered Merchant. Note: Merchant Name or Merchant Category Code is Mandatory, cannot have both. Merchant Category Code can be more than one with a comma separation")
  public List<String> getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(List<String> merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }
  
  public SearchAttrList merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  
  /**
  * Name of the Merchant or Supplier Name. Note: Optional when any one of VisaMerchantId or VisaStoreId or BusinessRegistrationId or MerchantUrl or AcquirerCardAcceptorId is provided.
  * @return merchantName
  **/
  @ApiModelProperty(required = true, value = "Name of the Merchant or Supplier Name. Note: Optional when any one of VisaMerchantId or VisaStoreId or BusinessRegistrationId or MerchantUrl or AcquirerCardAcceptorId is provided.")
  public String getMerchantName() {
    return merchantName;
  }
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }
  
  public SearchAttrList merchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
    return this;
  }

  
  /**
  * City of the registered Merchant
  * @return merchantCity
  **/
  @ApiModelProperty(required = true, value = "City of the registered Merchant")
  public String getMerchantCity() {
    return merchantCity;
  }
  public void setMerchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
  }
  
  public SearchAttrList merchantState(String merchantState) {
    this.merchantState = merchantState;
    return this;
  }

  
  /**
  * State of the registered Merchant. Ex: US
  * @return merchantState
  **/
  @ApiModelProperty(required = true, value = "State of the registered Merchant. Ex: US")
  public String getMerchantState() {
    return merchantState;
  }
  public void setMerchantState(String merchantState) {
    this.merchantState = merchantState;
  }
  
  public SearchAttrList longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  /**
  * Longitude value should be  between -180 to +180. Note: Postal Code or (Latitude and Longitude) is mandatory, cannot have both
  * @return longitude
  **/
  @ApiModelProperty(required = true, value = "Longitude value should be  between -180 to +180. Note: Postal Code or (Latitude and Longitude) is mandatory, cannot have both")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
  
  public SearchAttrList latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  /**
  * Latitude value should be between -90 to +90. Note: Postal Code or (Latitude and Longitude) is mandatory, cannot have both
  * @return latitude
  **/
  @ApiModelProperty(required = true, value = "Latitude value should be between -90 to +90. Note: Postal Code or (Latitude and Longitude) is mandatory, cannot have both")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }
  
  public SearchAttrList merchantPhoneNumber(Double merchantPhoneNumber) {
    this.merchantPhoneNumber = merchantPhoneNumber;
    return this;
  }

  
  /**
  * Phone number of the registered Merchant. MerchantPhoneNumber is optional field with MerchantName or Merchant Category Code. Useful in narrowing down the results
  * @return merchantPhoneNumber
  **/
  @ApiModelProperty(required = true, value = "Phone number of the registered Merchant. MerchantPhoneNumber is optional field with MerchantName or Merchant Category Code. Useful in narrowing down the results")
  public Double getMerchantPhoneNumber() {
    return merchantPhoneNumber;
  }
  public void setMerchantPhoneNumber(Double merchantPhoneNumber) {
    this.merchantPhoneNumber = merchantPhoneNumber;
  }
  
  public SearchAttrList merchantCountryCode(Integer merchantCountryCode) {
    this.merchantCountryCode = merchantCountryCode;
    return this;
  }

  
  /**
  * Country Code of the registered Merchant. Merchant Country code is mandatory with MerchantName. Note: Optional when Merchant Category Code is provided and Postal code is not provided
  * @return merchantCountryCode
  **/
  @ApiModelProperty(required = true, value = "Country Code of the registered Merchant. Merchant Country code is mandatory with MerchantName. Note: Optional when Merchant Category Code is provided and Postal code is not provided")
  public Integer getMerchantCountryCode() {
    return merchantCountryCode;
  }
  public void setMerchantCountryCode(Integer merchantCountryCode) {
    this.merchantCountryCode = merchantCountryCode;
  }
  
  public SearchAttrList distanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
    return this;
  }

  
  /**
  * Distance Unit should be either KM/M
  * @return distanceUnit
  **/
  @ApiModelProperty(required = true, value = "Distance Unit should be either KM/M")
  public String getDistanceUnit() {
    return distanceUnit;
  }
  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }
  
  public SearchAttrList merchantPostalCode(String merchantPostalCode) {
    this.merchantPostalCode = merchantPostalCode;
    return this;
  }

  
  /**
  * Postal Code of the registered Merchant. Note: Postal Code or (Latitude and Longitude) is mandatory, cannot have both. Merchant Country Code is mandatory with Postal Code.
  * @return merchantPostalCode
  **/
  @ApiModelProperty(required = true, value = "Postal Code of the registered Merchant. Note: Postal Code or (Latitude and Longitude) is mandatory, cannot have both. Merchant Country Code is mandatory with Postal Code.")
  public String getMerchantPostalCode() {
    return merchantPostalCode;
  }
  public void setMerchantPostalCode(String merchantPostalCode) {
    this.merchantPostalCode = merchantPostalCode;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAttrList searchAttrList = (SearchAttrList) o;
    return Objects.equals(this.distance, searchAttrList.distance) &&
        Objects.equals(this.merchantStreetAddress, searchAttrList.merchantStreetAddress) &&
        Objects.equals(this.merchantCategoryCode, searchAttrList.merchantCategoryCode) &&
        Objects.equals(this.merchantName, searchAttrList.merchantName) &&
        Objects.equals(this.merchantCity, searchAttrList.merchantCity) &&
        Objects.equals(this.merchantState, searchAttrList.merchantState) &&
        Objects.equals(this.longitude, searchAttrList.longitude) &&
        Objects.equals(this.latitude, searchAttrList.latitude) &&
        Objects.equals(this.merchantPhoneNumber, searchAttrList.merchantPhoneNumber) &&
        Objects.equals(this.merchantCountryCode, searchAttrList.merchantCountryCode) &&
        Objects.equals(this.distanceUnit, searchAttrList.distanceUnit) &&
        Objects.equals(this.merchantPostalCode, searchAttrList.merchantPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, merchantStreetAddress, merchantCategoryCode, merchantName, merchantCity, merchantState, longitude, latitude, merchantPhoneNumber, merchantCountryCode, distanceUnit, merchantPostalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAttrList {\n");

    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    merchantStreetAddress: ").append(toIndentedString(merchantStreetAddress)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCity: ").append(toIndentedString(merchantCity)).append("\n");
    sb.append("    merchantState: ").append(toIndentedString(merchantState)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    merchantPhoneNumber: ").append(toIndentedString(merchantPhoneNumber)).append("\n");
    sb.append("    merchantCountryCode: ").append(toIndentedString(merchantCountryCode)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    merchantPostalCode: ").append(toIndentedString(merchantPostalCode)).append("\n");
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




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
 * DateLocationsInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-12-19T10:49:33.222+05:30[Asia/Kolkata]")
public class DateLocationsInner {

  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("startDate")
  private String startDate = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("dateLocationId")
  private Integer dateLocationId = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("city")
  private String city = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("address1")
  private String address1 = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("address2")
  private String address2 = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("isSoldOut")
  private Boolean isSoldOut = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("longitude")
  private String longitude = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("countryName")
  private String countryName = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("latitude")
  private String latitude = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("state")
  private String state = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("postalCode")
  private String postalCode = null;
  
  
  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("endDate")
  private String endDate = null;
  
  public DateLocationsInner startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  /**
  * the start date (in GMT). Formatted as Mon DD, YYYY
  * @return startDate
  **/
  @ApiModelProperty(value = "the start date (in GMT). Formatted as Mon DD, YYYY")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }
  
  public DateLocationsInner dateLocationId(Integer dateLocationId) {
    this.dateLocationId = dateLocationId;
    return this;
  }

  
  /**
  * a date location identifier
  * @return dateLocationId
  **/
  @ApiModelProperty(value = "a date location identifier")
  public Integer getDateLocationId() {
    return dateLocationId;
  }
  public void setDateLocationId(Integer dateLocationId) {
    this.dateLocationId = dateLocationId;
  }
  
  public DateLocationsInner city(String city) {
    this.city = city;
    return this;
  }

  
  /**
  * the city of the location
  * @return city
  **/
  @ApiModelProperty(value = "the city of the location")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  
  public DateLocationsInner address1(String address1) {
    this.address1 = address1;
    return this;
  }

  
  /**
  * the first line of the location
  * @return address1
  **/
  @ApiModelProperty(value = "the first line of the location")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }
  
  public DateLocationsInner address2(String address2) {
    this.address2 = address2;
    return this;
  }

  
  /**
  * the second line of the location. May return an empty String
  * @return address2
  **/
  @ApiModelProperty(value = "the second line of the location. May return an empty String")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }
  
  public DateLocationsInner isSoldOut(Boolean isSoldOut) {
    this.isSoldOut = isSoldOut;
    return this;
  }

  
  /**
  * the sold out indicator
  * @return isSoldOut
  **/
  @ApiModelProperty(value = "the sold out indicator")
  public Boolean isIsSoldOut() {
    return isSoldOut;
  }
  public void setIsSoldOut(Boolean isSoldOut) {
    this.isSoldOut = isSoldOut;
  }
  
  public DateLocationsInner longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  /**
  * the longitude of the location. May return an empty String
  * @return longitude
  **/
  @ApiModelProperty(value = "the longitude of the location. May return an empty String")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
  
  public DateLocationsInner countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  
  /**
  * the country name
  * @return countryName
  **/
  @ApiModelProperty(value = "the country name")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }
  
  public DateLocationsInner latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  /**
  * the latitude of the location. May return an empty String
  * @return latitude
  **/
  @ApiModelProperty(value = "the latitude of the location. May return an empty String")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }
  
  public DateLocationsInner state(String state) {
    this.state = state;
    return this;
  }

  
  /**
  * the state/province/territory of the location
  * @return state
  **/
  @ApiModelProperty(value = "the state/province/territory of the location")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  
  public DateLocationsInner postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  /**
  * the postal code/zip code
  * @return postalCode
  **/
  @ApiModelProperty(value = "the postal code/zip code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  
  public DateLocationsInner endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  /**
  * the end date (in GMT). Formatted as Mon DD, YYYY
  * @return endDate
  **/
  @ApiModelProperty(value = "the end date (in GMT). Formatted as Mon DD, YYYY")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateLocationsInner dateLocationsInner = (DateLocationsInner) o;
    return Objects.equals(this.startDate, dateLocationsInner.startDate) &&
        Objects.equals(this.dateLocationId, dateLocationsInner.dateLocationId) &&
        Objects.equals(this.city, dateLocationsInner.city) &&
        Objects.equals(this.address1, dateLocationsInner.address1) &&
        Objects.equals(this.address2, dateLocationsInner.address2) &&
        Objects.equals(this.isSoldOut, dateLocationsInner.isSoldOut) &&
        Objects.equals(this.longitude, dateLocationsInner.longitude) &&
        Objects.equals(this.countryName, dateLocationsInner.countryName) &&
        Objects.equals(this.latitude, dateLocationsInner.latitude) &&
        Objects.equals(this.state, dateLocationsInner.state) &&
        Objects.equals(this.postalCode, dateLocationsInner.postalCode) &&
        Objects.equals(this.endDate, dateLocationsInner.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, dateLocationId, city, address1, address2, isSoldOut, longitude, countryName, latitude, state, postalCode, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateLocationsInner {\n");

    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    dateLocationId: ").append(toIndentedString(dateLocationId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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




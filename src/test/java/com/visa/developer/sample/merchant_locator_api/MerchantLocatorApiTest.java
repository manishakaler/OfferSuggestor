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


package com.visa.developer.sample.merchant_locator_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.visa.developer.sample.merchant_locator_api.api.MerchantLocatorApi;
import com.visa.developer.sample.merchant_locator_api.model.MerchantLocatorpostPayload;
import com.visa.developer.sample.merchant_locator_api.model.ModelResponse;
import org.junit.Test;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.ChronoUnit;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

/**
 * API tests for MerchantLocatorApi
 */
public class MerchantLocatorApiTest {

    private final MerchantLocatorApi api;

    public MerchantLocatorApiTest(){
        System.out.println("\nProduct Name: Merchant Locator\nApi Name: Merchant Locator API");
        ApiClient apiClient = new ApiClient();
        // Configure HTTP basic authorization: basicAuth
        apiClient.setUsername("LLT3CK0NZYQT1M9DIOBJ21o-cByoaU-GqBdx2aQm_RFXrBNj0");
        apiClient.setPassword("o2iEIyXC6op8tB7B");
        apiClient.setKeystorePath("/home/nilesh015/Desktop/VDP/security/myProject_keyAndCertBundle.jks");
        apiClient.setKeystorePassword("password");
        apiClient.setPrivateKeyPassword("password");
        
        // To set proxy uncomment the below lines
        // apiClient.setProxyHostName("proxy.address@example.com");
        // apiClient.setProxyPortNumber(0000);
        api = new MerchantLocatorApi(apiClient);
    }

    
    /**
     * 
     *
     * TBD
     *
     *          if the Api call fails
     */
    @Test
    public void postmerchantLocatorTest() throws IOException {

        String jsonPayload = "{\"header\":{\"messageDateTime\":\"2020-06-19T14:59:24.903\",\"requestMessageId\":\"Request_001\",\"startIndex\":\""+ 1 +"\"},\"searchAttrList\":{\"merchantCategoryCode\":[\"5814\"],\"merchantCountryCode\":\"840\",\"merchantPostalCode\":\"94102-4801\",\"distance\":\"2\",\"distanceUnit\":\"KM\"},\"responseAttrList\":[\"GNLOCATOR\"],\"searchOptions\":{\"maxRecords\":\"15\",\"matchIndicators\":\"true\",\"matchScore\":\"true\"}}";
        ObjectMapper mapper = new ObjectMapper();
        MerchantLocatorpostPayload body = mapper.readValue(jsonPayload, MerchantLocatorpostPayload.class);
        
        ModelResponse response = api.postmerchantLocator(body);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
        System.out.println(json);
    }
    

    public String transformPayload(String payload){
        payload = editLocalTime(payload);
        payload = addRandomValue(payload);
        return payload;
    }

    public String editLocalTime(String payload){
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime localDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        ZonedDateTime laDateTime = ZonedDateTime.of(localDateTime,zoneId);
        payload = payload.replaceAll("\"localTransactionDateTime\":\\s+\".{19}\"",
                    "\"localTransactionDateTime\": \""+DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(laDateTime)+"\"");
        payload = payload.replaceAll("\"dateTimeLocal\":\\s+\".{10}\"",
                    "\"dateTimeLocal\": \""+DateTimeFormatter.ofPattern("MMddHHmmss").format(laDateTime)+"\"");
        return payload;
    }

    public String addRandomValue(String payload){
        String randomAlphaNumericValue = UUID.randomUUID().toString().replaceAll("-","").substring(0,8);
        Random rand = new Random();
        Integer randomNumber = rand.nextInt(90000) + 10000;
        payload = payload.replaceAll("random_string", randomAlphaNumericValue);
        payload = payload.replaceAll("random_integer", randomNumber.toString());
        payload = payload.replaceAll("random", randomAlphaNumericValue);
        return payload;
    }
}

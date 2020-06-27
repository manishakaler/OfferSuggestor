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


package com.visa.developer.sample.merchant_benchmark_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.visa.developer.sample.merchant_benchmark_api.api.MerchantBenchmarkApi;
import com.visa.developer.sample.merchant_benchmark_api.model.MerchantBenchmarkpostPayload;
import com.visa.developer.sample.merchant_benchmark_api.model.MerchantBenchmarkpostResponse;
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
 * API tests for MerchantBenchmarkApi
 */
public class MerchantBenchmarkApiTest {

    private final MerchantBenchmarkApi api;

    public MerchantBenchmarkApiTest(){
        System.out.println("\nProduct Name: Merchant Measurement\nApi Name: Merchant Benchmark API");
        ApiClient apiClient = new ApiClient();
        // Configure HTTP basic authorization: basicAuth
        apiClient.setUsername("YOUR USERNAME");
        apiClient.setPassword("YOUR PASSWORD");
        apiClient.setKeystorePath("YOUR KEYSTORE PATH");
        apiClient.setKeystorePassword("YOUR KEYSTORE PASSWORD");
        apiClient.setPrivateKeyPassword("YOUR PRIVATEKEY PASSWORD");

        // To set proxy uncomment the below lines
        // apiClient.setProxyHostName("proxy.address@example.com");
        // apiClient.setProxyPortNumber(0000);
        api = new MerchantBenchmarkApi(apiClient);
    }

    
    /**
     * 
     *
     * Merchant Benchmark
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postmerchantBenchmarkTest() throws IOException {
        
        String jsonPayload = "{\"requestHeader\":{\"messageDateTime\":\"2020-06-25T15:38:31.327Z\",\"requestMessageId\":\"6da60e1b8b024532a2e0eacb1af58581\"},\"requestData\":{\"naicsCodeList\":[\"\"],\"merchantCategoryCodeList\":[\"5812\"],\"merchantCategoryGroupsCodeList\":[\"\"],\"postalCodeList\":[\"\"],\"msaList\":[\"7362\"],\"countrySubdivisionList\":[\"\"],\"merchantCountry\":\"840\",\"monthList\":[\"201706\"],\"accountFundingSourceList\":[\"ALl\"],\"eciIndicatorList\":[\"All\"],\"platformIDList\":[\"All\"],\"posEntryModeList\":[\"All\"],\"cardPresentIndicator\":\"CARDPRESENT\",\"groupList\":[\"STANDARD\"]}}";
        ObjectMapper mapper = new ObjectMapper();
        MerchantBenchmarkpostPayload body = mapper.readValue(jsonPayload, MerchantBenchmarkpostPayload.class);
        
        MerchantBenchmarkpostResponse response = api.postmerchantBenchmark(body);
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

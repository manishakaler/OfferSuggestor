package basics;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.visa.developer.sample.offers_data_api.ApiClient;
import com.visa.developer.sample.offers_data_api.api.OffersDataApiApi;
import com.visa.developer.sample.offers_data_api.model.*;

import java.io.IOException;
import java.util.*;

public class OffersDataApiCall {
    private final OffersDataApiApi api;

    public OffersDataApiCall(){
        System.out.println("\nProduct Name: Visa Merchant Offers Resource Center\nApi Name: Offers Data API");
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
        api = new OffersDataApiApi(apiClient);
    }


    /**
     *
     *
     * Request for all offers
     *
     *          if the Api call fails
     */
    public String getBestOfferParameters(ArrayList<ArrayList<String>> PostalCodesMerchantIDs, ArrayList<Double> MerchantPercentages, String searchPCode, String searchCity) throws IOException {
        /*
        * Since we have dummy offers with dummy merchant ids,
        * we map each dummy merchant to a real merchant id obtained from Merchant Locator
        */
        HashMap<Integer,Integer> ID = new HashMap<Integer, Integer>();
        ID.put(80310667, 101456);
        ID.put(29992901, 101457);
        ID.put(25837910, 101458);
        ID.put(14220138, 101459);
        ID.put(14786696, 101460);

        for(int i = 0; i < (PostalCodesMerchantIDs.get(0)).size();i++){
            int key = Integer.parseInt(PostalCodesMerchantIDs.get(1).get(i));
            System.out.println(key);
            if(ID.containsKey(key)){
                PostalCodesMerchantIDs.get(1).set(i,"" + ID.get(key));
            }
        }

        ArrayList<String> postalCodes = new ArrayList<String>();
        ArrayList<String> merchantIDs = new ArrayList<String>();

        postalCodes = PostalCodesMerchantIDs.get(0);
        merchantIDs = PostalCodesMerchantIDs.get(1);

        System.out.println(merchantIDs);

        String merchantIDQuery = "";
        for(int i = 0; i < merchantIDs.size(); i++)
        {
            if(i == merchantIDs.size() - 1)
                merchantIDQuery += merchantIDs.get(i);
            else
                merchantIDQuery += merchantIDs.get(i) + ",";
        }

        System.out.println(merchantIDQuery);
        ObjectMapper mapper = new ObjectMapper();

        //Initial Response filtered by nearby merchants only.
        RetrieveOffersByFiltergetResponse response = api.getretrieveOffersByFilter( null,  null,  null,  null,  null,  merchantIDQuery,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);

        //Storing offerID list of nearby offers
        ArrayList<Integer> offerIdList = new ArrayList<Integer>();

        HashMap<Integer,ArrayList<String>> mapToDesc = new HashMap<Integer,ArrayList<String>>();

        int numOffers = response.getTotalFoundResults();
        System.out.println(numOffers);
        int offerId;
        for(int i = 0; i < numOffers;i++) {
            offerId = response.getOffers().get(i).getOfferId();

            String desc = response.getOffers().get(i).getOfferShortDescription().getText();
            String title = response.getOffers().get(i).getOfferTitle();
            String validityFrom = response.getOffers().get(i).getValidityFromDate();
            String validityTo = response.getOffers().get(i).getValidityToDate();

            ArrayList<String> offerDetails = new ArrayList<String>();
            offerDetails.add(title);
            offerDetails.add(desc);
            offerDetails.add(validityFrom);
            offerDetails.add(validityTo);

            offerIdList.add(offerId);
            mapToDesc.put(offerId,offerDetails);
        }

        //Passing this offer id list for next call, to get list of all merchants, near and far, and their counts

        String offerQuery = "";
        for(int i = 0; i < offerIdList.size(); i++)
        {
            if(i == offerIdList.size() - 1)
                offerQuery += "" + offerIdList.get(i);
            else
                offerQuery += "" + offerIdList.get(i) + ",";
        }
        //System.out.println(offerQuery);
        //For getting counts involving all merchants
        RetrieveOffersByOfferIdgetResponse offerBasedResponse = api.getretrieveOffersByOfferId(offerQuery,  null,  null,  null,  null);

        /*
        * The default vmorc results have only 1 merchant enrolled per offer
        * Our algorithm relies on this enrolled merchant count in each offer
        * So, we add some extra merchants to the existing offers returned by querying vmorc
         */
        HashMap<Integer,ArrayList<String>> additionalMerchants = new HashMap<Integer,ArrayList<String>>();
        additionalMerchants = populate(offerIdList,numOffers);

        //Get best offer parameters
        String bestPromotionChannel = getBestPromotionChannel(response,numOffers);
        String bestCardProduct = getBestCardProduct(response,numOffers);
        String bestOfferType = getBestOfferType(response,numOffers);

        OfferSuggestorResponse new_res = new OfferSuggestorResponse();
        new_res.setBestPromotionChannel(bestPromotionChannel);
        new_res.setBestCardProduct(bestCardProduct);
        new_res.setBestOfferType(bestOfferType);

        HashMap<Integer, ArrayList<Integer>> merchantCounts = new HashMap<Integer, ArrayList<Integer>>();
        merchantCounts = getMerchantCount(offerBasedResponse,offerIdList,PostalCodesMerchantIDs,additionalMerchants,searchPCode,searchCity,numOffers);

        ArrayList<Integer> sortedOfferIdList = calculateOfferPoints(MerchantPercentages,merchantCounts,offerIdList);

        //Return top 3 offer details
        List<OfferItem> oList = new ArrayList<OfferItem>();
        for(int i = 0; i < sortedOfferIdList.size(); i++){
            ArrayList<String> responseOfferDetails = mapToDesc.get(sortedOfferIdList.get(i));
            OfferItem offerItem = new OfferItem();
            offerItem.setOfferId("" + sortedOfferIdList.get(i));
            offerItem.setOfferTitle(responseOfferDetails.get(0));
            offerItem.setOfferDesc(responseOfferDetails.get(1));
            offerItem.setValidFrom(responseOfferDetails.get(2));
            offerItem.setValidTo(responseOfferDetails.get(3));

            oList.add(offerItem);
            if(i == 2)
                break;
        }

        new_res.setOfferList(oList);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new_res);
        return json;
    }

    public ArrayList<Integer> calculateOfferPoints(ArrayList<Double> MerchantPercentages, HashMap<Integer, ArrayList<Integer>> merchantCounts, ArrayList<Integer> offerIdList){
        Random rand = new Random();
        ArrayList<Double> ScorePoints = new ArrayList<Double>();
        /*
        * Assigned Priority Points for our algorithm
        * Priority for:
        * Same Postal Code - 0.9
        * Nearby Postal Code - 0.7
        * Same City - 0.5
        * Same Country - 0.2
        */
        for(int i=0;i< offerIdList.size();i++) {
            ScorePoints.add(0.0);
        }
        double[] PriorityPoints = {0.9,0.7,0.5,0.2};
        for(int i=0;i< offerIdList.size();i++){
            for(int j=0;j<4;j++){
                ScorePoints.set(i, ScorePoints.get(i) + merchantCounts.get(offerIdList.get(i)).get(j) * PriorityPoints[j] * (1 + (MerchantPercentages.get(j)/25)));
            }
        }
        HashMap<Integer,Double> H = new HashMap<Integer, Double>();
        for(int i = 0; i < offerIdList.size();i++){
            H.put(offerIdList.get(i),ScorePoints.get(i));
        }

        H = sortByValue(H);
        System.out.println(H);
        ArrayList<Integer> sortedOfferIdList = new ArrayList<Integer>();
        for (Map.Entry<Integer,Double> entry : H.entrySet()){
            sortedOfferIdList.add(entry.getKey());
        }
        return sortedOfferIdList;
    }

    public HashMap<Integer, ArrayList<Integer>> getMerchantCount(RetrieveOffersByOfferIdgetResponse response, ArrayList<Integer> offerIdList, ArrayList<ArrayList<String>> PostalCodesMerchantIDs, HashMap<Integer,ArrayList<String>> additionalMerchants, String postalCode, String city, int numOffers) throws IOException{
        HashMap<String,String> dataList = new HashMap<String,String>();
        for(int i = 0; i < PostalCodesMerchantIDs.get(0).size();i++){
            String mID = PostalCodesMerchantIDs.get(1).get(i);
            String pCode = PostalCodesMerchantIDs.get(0).get(i);

            if(!dataList.containsKey(mID))
                dataList.put(mID,pCode);
        }
        //System.out.println(response);
        HashMap<Integer,ArrayList<Integer>> merchantListCount= new HashMap<Integer,ArrayList<Integer>>();
        HashMap<String,Integer> addMerchData = new HashMap<String,Integer>();
        for(int i = 0; i < numOffers;i++){
            MerchantList mList = response.getOffers().get(i).getMerchantList();
            int key = offerIdList.get(i);
            ArrayList<Integer> counts = new ArrayList<Integer>();
            int pCodeCount = 0,pListCount = 0,cityCount = 0,countryCount = mList.size();
            for(int j = 0;j < mList.size(); j++){
                String mID = "" + mList.get(j).getMerchantId();
                if(dataList.containsKey(mID)){
                    String pCode = dataList.get(mID);
                    if(pCode.equals(postalCode))
                        pCodeCount++;
                    if(PostalCodesMerchantIDs.get(0).contains(pCode))
                        pListCount++;
                    cityCount++;
                }
            }

            //Call merchant search for additional merchants
            ArrayList<String> addList = new ArrayList<String>();
            addList = additionalMerchants.get(offerIdList.get(i));
            for(int k = 0; k < addList.size();k++){
                int result = 0;
                if(addMerchData.containsKey(addList.get(k)))
                    result = addMerchData.get(addList.get(k));
                else{
                    MerchantSearchCall mCall = new MerchantSearchCall();
                    result = mCall.checkCity(addList.get(k),city,postalCode,PostalCodesMerchantIDs.get(0));
                    addMerchData.put(addList.get(k),result);
                }
                if(result == 1)
                {
                    pCodeCount++;
                    pListCount++;
                    cityCount++;
                }
                else if(result == 2){
                    pListCount++;
                    cityCount++;
                }
                else if(result == 3){
                    cityCount++;
                }
                countryCount++;
            }

            counts.add(pCodeCount);
            counts.add(pListCount);
            counts.add(cityCount);
            counts.add(countryCount);

            merchantListCount.put(key,counts);
        }
        System.out.println(merchantListCount);
        return merchantListCount;
    }
    public String getBestPromotionChannel(RetrieveOffersByFiltergetResponse response,int numOffers) throws IOException{
        HashMap<String,Integer> promotionChannelCount= new HashMap<String,Integer>();
        int max_count = 0,count = 0;
        String best_key = "";
        for(int i = 0; i < numOffers;i++){
            PromotionChannelList pList = response.getOffers().get(i).getPromotionChannelList();
            for(int j = 0; j < pList.size();j++){
                String key = pList.get(j).getValue();
                if(promotionChannelCount.containsKey(key)){
                    count = promotionChannelCount.get(key);
                    promotionChannelCount.put(key,count + 1);
                    if(count > max_count)
                    {
                        max_count = count;
                        best_key = key;
                    }
                }
                else {
                    promotionChannelCount.put(key, 1);
                    if(max_count == 0)
                    {
                        max_count = 1;
                        best_key = key;
                    }
                }
            }
        }
        System.out.println(promotionChannelCount);
        return best_key;
    }

    public String getBestCardProduct(RetrieveOffersByFiltergetResponse response,int numOffers) throws IOException{
        HashMap<String,Integer> cardProductCount= new HashMap<String,Integer>();
        int max_count = 0,count = 0;
        String best_key = "";
        for(int i = 0; i < numOffers;i++){
            CardProductList cList = response.getOffers().get(i).getCardProductList();
            for(int j = 0; j < cList.size();j++){
                String key = cList.get(j).getValue();
                if(cardProductCount.containsKey(key)){
                    count = cardProductCount.get(key);
                    cardProductCount.put(key,count + 1);
                    if(count > max_count)
                    {
                        max_count = count;
                        best_key = key;
                    }
                }
                else {
                    cardProductCount.put(key, 1);
                    if(max_count == 0)
                    {
                        max_count = 1;
                        best_key = key;
                    }
                }
            }
        }
        System.out.println(cardProductCount);
        return best_key;
    }

    public String getBestOfferType(RetrieveOffersByFiltergetResponse response, int numOffers) throws IOException{
        HashMap<String,Integer> offerTypeCount= new HashMap<String,Integer>();
        int max_count = 0,count = 0;
        String best_key = "";
        for(int i = 0; i < numOffers;i++){
            OfferType oList= response.getOffers().get(i).getOfferType();
            for(int j = 0; j < oList.size();j++){
                String key = oList.get(j).getValue();
                if(offerTypeCount.containsKey(key)){
                    count = offerTypeCount.get(key);
                    offerTypeCount.put(key,count + 1);
                    if(count > max_count)
                    {
                        max_count = count;
                        best_key = key;
                    }
                }
                else {
                    offerTypeCount.put(key, 1);
                    if(max_count == 0)
                    {
                        max_count = 1;
                        best_key = key;
                    }
                }
            }
        }
        System.out.println(offerTypeCount);
        return best_key;
    }

    HashMap<Integer,ArrayList<String>>  populate(ArrayList<Integer> offerIDList,int numOffers){
        HashMap<Integer,ArrayList<String>> additionalMerchants = new HashMap<Integer,ArrayList<String>>();
        ArrayList<String> newMerchants = new ArrayList<String>();
        newMerchants.add("28495735");
        newMerchants.add("26410561");
        newMerchants.add("11455106");
        //newMerchants.add("23667699");
        newMerchants.add("32732413");
        newMerchants.add("16919626");

        ArrayList<ArrayList<String>> mList = new ArrayList<ArrayList<String>>();

        for(int k = 0; k < numOffers;k++){
            Random rand = new Random();
            int num = rand.nextInt(newMerchants.size());
            if(num == 0)
                num = 2;
            ArrayList<String> M = new ArrayList<String>();
            for(int i = 0; i < num; i++){
                int num2 = rand.nextInt(newMerchants.size());
                if(num2 == newMerchants.size())
                    num2 = newMerchants.size() - 1;
                if(!M.contains(newMerchants.get(num2)))
                    M.add(newMerchants.get(num2));
            }
            mList.add(M);
        }

        for(int i = 0; i < numOffers; i++){
            additionalMerchants.put(offerIDList.get(i),mList.get(i));
        }
        System.out.println(additionalMerchants);
        return additionalMerchants;
    }

    public HashMap<Integer, Double> sortByValue(HashMap<Integer, Double> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Double> > list =
                new LinkedList<Map.Entry<Integer, Double> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double> >() {
            public int compare(Map.Entry<Integer, Double> o1,
                               Map.Entry<Integer, Double> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Double> temp = new LinkedHashMap<Integer, Double>();
        for (Map.Entry<Integer, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    /**
     *
     *
     * Request for offers by content id
     *
     *          if the Api call fails
     */
    public String getRetrieveOffersByContentIdHandler() throws IOException {
        String contentid = Arrays.asList("contentid_example").get(0);
        ObjectMapper mapper = new ObjectMapper();
        RetrieveOffersByContentIdgetResponse response = api.getretrieveOffersByContentId(contentid,  null,  null,  null,  null);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
        return json;
    }

    /**
     *
     *
     * Request for offers by filter
     *
     *          if the Api call fails
     */
    public String getRetrieveOffersByFilterHandler() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        RetrieveOffersByFiltergetResponse response = api.getretrieveOffersByFilter( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  3,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
        return json;
    }

    /**
     *
     *
     * Request for offers by an offer id
     *
     *          if the Api call fails
     */
    public void getretrieveOffersByOfferIdTest() throws IOException {
        String offerid = Arrays.asList("102355").get(0);

        ObjectMapper mapper = new ObjectMapper();
        RetrieveOffersByOfferIdgetResponse response = api.getretrieveOffersByOfferId(offerid,  null,  null,  null,  null);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
        System.out.println(json);
    }
}

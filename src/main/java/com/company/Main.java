package com.company;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Api.callApi();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String vatJson = Api.textToParse;
            JsonNode jsonNode = objectMapper.readTree(vatJson);
            //Vats vat = new Vats();
            JSONArray tmp = new JSONArray();

            JSONObject  json = new JSONObject(vatJson);
            JSONArray test = json.getJSONObject("rates").names();
            //List jsonStream = (List)test.stream();

            System.out.println(test);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Root root = objectMapper.readValue(vatJson, Root.class);
            int i =0;
//            vat.setCountry(jsonNode.get("rates").get("BE").get("country").textValue());
//            vat.setStandard_rate(jsonNode.get("rates").get("BE").get("standard_rate").asDouble());
//            vat.setReduced_rate(jsonNode.get("rates").get("BE").get("reduced_rate").asDouble());
//            vat.setReduced_rate_alt(jsonNode.get("rates").get("BE").get("reduced_rate_alt").asDouble());
//            vat.setSuper_reduced_rate(jsonNode.get("rates").get("BE").get("super_reduced_rate").asBoolean());
//            vat.setParking_rate(jsonNode.get("rates").get("BE").get("parking_rate").asBoolean());
//            System.out.println(vat.getCountry());
//            JSONObject objects = new JSONObject ();
//            JSONArray key = objects.names ();
//            for (int i = 0; i < key.length (); ++i) {
//                String keys = key.getString (i);
//                String value = objects.getString (keys);
//            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
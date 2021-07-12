package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MyHttpConnection {
    private HttpURLConnection connection;
    BufferedReader reader;
    String line;
    StringBuffer responseContent;
    URL url;

    public void printInformations(String addressValue) {

        prepareURL(addressValue);
        prepareResponseContent();
        responseContent = readFromConnection();
        parse(responseContent.toString());
    }

    void prepareURL(String addressValue) {
        try {
            url = new URL("http://ip-api.com/json/" + addressValue);

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    StringBuffer readFromConnection() {

        try {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
                responseContent.append("]");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseContent;
    }

    void prepareResponseContent() {
        responseContent = new StringBuffer();
        responseContent.append("[");
    }

    public String parse(String responseBody) {

        JSONArray jsonArray = new JSONArray(responseBody);
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject json = jsonArray.getJSONObject(i);

            String ip = json.getString("query");
            float latitude = json.getFloat("lat");
            float longitude = json.getFloat("lon");
            String country = json.getString("country");

            printValues(ip, latitude, longitude, country);
        }
        return null;
    }

    void printValues(String ip, float latitude, float longitude, String country) {
        System.out.println("ip        :" + ip);
        System.out.println("latitude  :" + latitude);
        System.out.println("longitude :" + longitude);
        System.out.println("country   :" + country);
        System.out.println("\n");
    }

}

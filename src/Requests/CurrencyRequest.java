package Requests;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyRequest {

    public JsonObject AskCurrencies(String principalCurrency) throws IOException {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/6d2e7c8bcf51b8b8e9d0f265/latest/"+ principalCurrency;
        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request;
        request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        InputStreamReader toExtract = new InputStreamReader((InputStream) request.getContent());
        JsonElement root = jp.parse(toExtract);
        JsonObject jsonobj = root.getAsJsonObject();
        // Accessing object
        return jsonobj.get("conversion_rates").getAsJsonObject();
    }

}

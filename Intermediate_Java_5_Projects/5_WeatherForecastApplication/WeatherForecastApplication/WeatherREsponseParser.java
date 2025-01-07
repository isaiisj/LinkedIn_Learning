package com.isai.weather;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherResponseParser {
    public void parseAndPrint(String response) {
        JSONObject jsonObject = new JSONObject(response);

        // Check if the response is succesful
        if(jsonObject.getInt("cod") == 200){

            System.out.println("Weather forecast for city: ");

            // Get the forecast list
            JSONArray forecasts = jsonObject.getJSONArray("list");

            // Loop through each forecast in the array
            for (int i = 0; i <forecasts.length() ; i++) {
                // Get the forecast object at index i
                JSONObject forecast = forecasts.getJSONObject(i);

                // Extract the timestamp and convert it to a date string
                long timestamp = forecast.getLong("dt");
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(timestamp * 1000));

                // Get the temperature from the "main" object within the forecast
                double temperature = forecast.getJSONObject("main").getDouble("temp");

                // Get the weather description from the first item in the "weather" array
                String description = forecast.getJSONArray("weather").getJSONObject(0).getString("description");

                // Print the formatted forecast information
                System.out.println(date + ": " + temperature + "C, " + description);

            }

        } else{
            System.out.println("Request contains an error" + jsonObject.getInt("cod"));
        }
    }
}

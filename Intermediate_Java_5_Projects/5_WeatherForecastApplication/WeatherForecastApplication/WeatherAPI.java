package com.isai.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class WeatherAPI {
    // API key declared as constant (here goes your own API key)
    private static final String API_KEY = "XXXXXXXXXXXXXXXXXXXXXXX";

    // Base URL
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/forecast";


    /**
     * Retrieves the weather forecast for a specified city.
     *
     * This method constructs a URL using the OpenWeatherMap API, sends a GET request,
     * and returns the response as a String. The forecast is requested in metric units.
     *
     * @param city The name of the city for which to fetch the weather forecast.
     * @return A String containing the JSON response from the OpenWeatherMap API.
     * @throws IOException If there's an error in making the HTTP request or reading the response.
     */
    public String getForeCast(String city) throws IOException {
        // Construct the API URL with the city name, API key, and metric units
        String apiurl = BASE_URL + "?q=" + URLEncoder.encode(city, StandardCharsets.UTF_8.toString())  + "&appid=" + API_KEY + "&units=metric";

        // Create a URL object from the constructed API URL string
        URL url = new URL(apiurl);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Create a BufferedReader to read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        // Use a StringBuilder to efficiently build the response string
        StringBuilder response = new StringBuilder();
        String line;

        // Read the response line by line
        while ((line = reader.readLine()) != null){
            response.append(line);
        }
        reader.close();

        return response.toString();
    }
}

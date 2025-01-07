package com.isai.weather;

import java.io.IOException;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) throws IOException {
        WeatherAPI api = new WeatherAPI();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What city would you like to see the weather forecast for?: ");
        String city = scanner.nextLine();

        //System.out.println(api.getForeCast("london")); //prints the JSON
        String forecastString = api.getForeCast(city);

        WeatherResponseParser parser = new WeatherResponseParser();
        parser.parseAndPrint(forecastString);
    }
}

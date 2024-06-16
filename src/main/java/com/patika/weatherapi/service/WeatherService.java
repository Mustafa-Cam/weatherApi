package com.patika.weatherapi.service;


import com.patika.weatherapi.model.WeatherRequest;
import com.patika.weatherapi.model.WeatherResponse;
import com.patika.weatherapi.model.dto.WeatherForecast;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public WeatherForecast getWeatherForecast(WeatherRequest request) {
        WeatherForecast weatherForecast = new WeatherForecast();

        weatherForecast.setDailyForecast(getWeatherforDaily(request));
        weatherForecast.setWeeklyForecast(getWeatherforWeekly(request));
//        weatherForecast.setMonthlyForecast(getWeatherforMountly(request));

        return weatherForecast;
    }

    public WeatherResponse getWeatherforDaily(WeatherRequest request) {
        String url = String.format("%s/history.json?q=%s&dt=%s&&hour=%s&key=%s", apiUrl, request.getCity(),LocalDate.now(),request.getHour(), apiKey);
        // period parametresine göre günlük, haftalık veya aylık rapor alabilirsiniz
        // Bu örnekte sadece günlük rapor alacağız.
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

    public WeatherResponse getWeatherforWeekly(WeatherRequest request) {

        // Bugünün tarihini al
        LocalDate today = LocalDate.now();
        // 7 gün önceki tarihi al
        LocalDate oneWeekAgo = today.minusDays(7);


        String url = String.format("%s/history.json?q=%s&dt=%s&end_dt=%s&hour=%s&key=%s", apiUrl, request.getCity(), oneWeekAgo, today,request.getHour(), apiKey);
        // period parametresine göre günlük, haftalık veya aylık rapor alabilirsiniz
        // Bu örnekte sadece günlük rapor alacağız.

        return restTemplate.getForObject(url, WeatherResponse.class);

    }
//    public WeatherResponse getWeatherforMountly(WeatherRequest request) {
//
//        LocalDate today = LocalDate.now();
//        LocalDate oneMountAgo = today.minusDays(30);
//
//        String url = String.format("%s/history.json?q=%s&dt=%s&end_dt=%s&hour=%s&key=%s", apiUrl, request.getCity(), oneMountAgo,today,request.getHour(), apiKey);
//        // period parametresine göre günlük, haftalık veya aylık rapor alabilirsiniz
//        // Bu örnekte sadece günlük rapor alacağız.
//        return restTemplate.getForObject(url, WeatherResponse.class);
//    }
}

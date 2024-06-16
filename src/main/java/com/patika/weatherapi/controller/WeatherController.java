package com.patika.weatherapi.controller;

import com.patika.weatherapi.model.WeatherRequest;
import com.patika.weatherapi.model.WeatherResponse;
import com.patika.weatherapi.model.dto.WeatherForecast;
import com.patika.weatherapi.service.WeatherService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

   @GetMapping
    public ResponseEntity<WeatherForecast> getWeather(@Valid @RequestBody WeatherRequest request) {
        WeatherForecast response = weatherService.getWeatherForecast(request);
        return ResponseEntity.ok(response);
    }


//    @GetMapping
//    public ResponseEntity<WeatherResponse> getWeatherForDaily(@Valid @RequestBody WeatherRequest request) {
//        WeatherResponse response = weatherService.getWeatherforDaily(request);
//        return ResponseEntity.ok(response);
//    }
}

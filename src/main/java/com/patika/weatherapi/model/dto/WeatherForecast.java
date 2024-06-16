package com.patika.weatherapi.model.dto;


import com.patika.weatherapi.model.WeatherResponse;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeatherForecast {
    private WeatherResponse dailyForecast;
    private WeatherResponse weeklyForecast;
    private WeatherResponse monthlyForecast;

    public WeatherForecast() {}
}


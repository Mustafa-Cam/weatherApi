package com.patika.weatherapi.model;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class WeatherRequest {

    @NotBlank(message = "City is mandatory")
    private String city;
    private int hour;

}


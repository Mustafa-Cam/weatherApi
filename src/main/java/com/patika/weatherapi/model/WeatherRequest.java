package com.patika.weatherapi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
public class WeatherRequest {

    @NotBlank(message = "City is mandatory")
    private String city;

    private int hour;

}


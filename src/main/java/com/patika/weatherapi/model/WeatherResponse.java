package com.patika.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {
    private Location location;
    private Forecast forecast;

    @Getter
    @Setter
    public static class Location {
        @JsonProperty("name")
        private String name;
        @JsonProperty("region")
        private String region;
        @JsonProperty("country")
        private String country;
        @JsonProperty("localtime")
        private String localtime;
    }

    @Getter
    @Setter
    public static class Forecast {
        @JsonProperty("forecastday")
        private List<ForecastDay> forecastday;
    }

    @Getter
    @Setter
    public static class ForecastDay {
        @JsonProperty("date")
        private String date;
        @JsonProperty("day")
        private Day day;
        @JsonProperty("hour")
        private List<Hour> hour;
    }

    @Getter
    @Setter
    public static class Day {
        @JsonProperty("daily_will_it_rain")
        private int dailyWillItRain;
        @JsonProperty("daily_chance_of_rain")
        private int dailyChanceOfRain;
        @JsonProperty("daily_will_it_snow")
        private int dailyWillItSnow;
        @JsonProperty("daily_chance_of_snow")
        private int dailyChanceOfSnow;
        @JsonProperty("condition")
        private Condition condition;
        @JsonProperty("uv")
        private int uv;
    }

    @Getter
    @Setter
    public static class Condition {
        @JsonProperty("text")
        private String text;
        @JsonProperty("icon")
        private String icon;
        @JsonProperty("code")
        private int code;
    }

    @Getter
    @Setter
    public static class Hour {
        @JsonProperty("time")
        private String time;
        @JsonProperty("is_day")
        private int isDay;
        @JsonProperty("condition")
        private Condition condition;
    }
}

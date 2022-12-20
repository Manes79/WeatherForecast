package pl.manes.weatherrestapi.webclient.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenWeatherDto {

    @JsonProperty(value = "main")
    private String main;

    @JsonProperty(value = "description")
    private String description;


}

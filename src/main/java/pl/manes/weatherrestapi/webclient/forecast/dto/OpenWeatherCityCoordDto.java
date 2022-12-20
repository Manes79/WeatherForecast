package pl.manes.weatherrestapi.webclient.forecast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenWeatherCityCoordDto {

    @JsonProperty(value = "lat")
    private int lat;

    @JsonProperty(value = "lon")
    private int lon;
}

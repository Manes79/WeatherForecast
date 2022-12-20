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
public class OpenWeatherCityDto {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "country")
    private String country;

    @JsonProperty(value = "population")
    private String population;

    @JsonProperty(value = "timezone")
    private int timezone;

    @JsonProperty(value = "sunrise")
    private int sunrise;

    @JsonProperty(value = "sunset")
    private int sunset;

    @JsonProperty(value = "coord")
    private OpenWeatherCityCoordDto coord;

}

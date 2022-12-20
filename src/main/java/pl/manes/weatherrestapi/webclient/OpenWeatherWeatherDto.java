package pl.manes.weatherrestapi.webclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.manes.weatherrestapi.webclient.forecast.dto.OpenWeatherCityDto;
import pl.manes.weatherrestapi.webclient.weather.dto.OpenWeatherDto;
import pl.manes.weatherrestapi.webclient.weather.dto.OpenWeatherMainDto;
import pl.manes.weatherrestapi.webclient.weather.dto.OpenWeatherWindDto;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenWeatherWeatherDto {

    @JsonProperty(value = "weather")
    private List<OpenWeatherDto> weather;

    @JsonProperty(value = "main")
    private OpenWeatherMainDto main;

    @JsonProperty(value = "wind")
    private OpenWeatherWindDto wind;

    @JsonProperty(value = "city")
    private OpenWeatherCityDto city;

}

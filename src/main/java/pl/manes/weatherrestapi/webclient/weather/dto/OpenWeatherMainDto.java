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
public class OpenWeatherMainDto {

    @JsonProperty(value = "temp")
    private float temp;

    @JsonProperty(value = "feels_like")
    private float feels_like;

    @JsonProperty(value = "pressure")
    private int pressure;

    @JsonProperty(value = "humidity")
    private int humidity;

}

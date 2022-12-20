package pl.manes.weatherrestapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
@Builder
public class WeatherDto {

    @JsonProperty(value = "Pogoda")
    private String main;

    @JsonProperty(value = "Opis pogody")
    private String description;

    @JsonProperty(value = "Temperatura")
    private float temperature;

    @JsonProperty(value = "Temperatura odczuwalna")
    private float feels_like;

    @JsonProperty(value = "Ciśnienie")
    private int pressure;

    @JsonProperty(value = "Wilgotność")
    private int humidity;

    @JsonProperty(value = "Prędkość wiatru")
    private float windSpeed;
}

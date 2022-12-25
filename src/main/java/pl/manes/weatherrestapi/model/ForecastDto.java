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
public class ForecastDto {

    @JsonProperty(value = "Województwo")
    private String name;

    @JsonProperty(value = "Kraj")
    private String country;

    @JsonProperty(value = "Populacja województwa")
    private String population;

    @JsonProperty(value = "Strefa czasowa")
    private int timezone;

    @JsonProperty(value = "Wschód słońca")
    private int sunrise;

    @JsonProperty(value = "Zachód słońca")
    private int sunset;

    @JsonProperty(value = "Szerokość geograficzna")
    private float lat;

    @JsonProperty(value = "Długość geograficzna")
    private float lon;

}

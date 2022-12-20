package pl.manes.weatherrestapi.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ForecastDto {

    private String name;

    private String country;

    private String population;

    private int timezone;

    private int sunrise;

    private int sunset;

    private int lat;

    private int lon;

}

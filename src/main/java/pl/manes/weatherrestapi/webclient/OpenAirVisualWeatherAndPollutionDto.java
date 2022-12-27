package pl.manes.weatherrestapi.webclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.manes.weatherrestapi.webclient.airvisual.dto.OpenDataDto;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenAirVisualWeatherAndPollutionDto {

    @JsonProperty(value = "data")
    private OpenDataDto data;

}

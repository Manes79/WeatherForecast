package pl.manes.weatherrestapi.webclient.airvisual.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenPollutionDto {

    @JsonProperty(value = "ts")
    private String ts;

    @JsonProperty(value = "aqicn")
    private int aqicn;

}

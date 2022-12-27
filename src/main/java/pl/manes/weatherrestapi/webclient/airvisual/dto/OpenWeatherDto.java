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
public class OpenWeatherDto {

    @JsonProperty(value = "ts")
    private String ts;

    @JsonProperty(value = "tp")
    private int tp;

    @JsonProperty(value = "pr")
    private int pr;

    @JsonProperty(value = "hu")
    private int hu;

    @JsonProperty(value = "ws")
    private float ws;

}

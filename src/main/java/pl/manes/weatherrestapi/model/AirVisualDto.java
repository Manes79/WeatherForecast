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
public class AirVisualDto {

    @JsonProperty(value = "Kraj")
    private String country;

    @JsonProperty(value = "Nazwa województwa")
    private String state;

}

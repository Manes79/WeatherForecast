package pl.manes.weatherrestapi.domain.Dto;

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

    @JsonProperty(value = "Miasto")
    private String city;

    @JsonProperty(value = "Województwo")
    private String state;

    @JsonProperty(value = "Kraj")
    private String country;

    @JsonProperty(value = "Lokalna data i godzina pomiaru")
    private String ts;

    @JsonProperty(value = "Wskaźnik jakości powietrza")
    private int aqicn;

    @JsonProperty(value = "Temperatura")
    private int tp;

    @JsonProperty(value = "Ciśnienie")
    private int pr;

    @JsonProperty(value = "Wilgotność")
    private int hu;

    @JsonProperty(value = "Wiatr")
    private float ws;

}

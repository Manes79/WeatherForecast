package pl.manes.weatherrestapi.webclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.manes.weatherrestapi.webclient.airvisual.dto.OpenProvinceNameDto;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenAirVisualProvincesDto {

    @JsonProperty(value = "data")
    private List<OpenProvinceNameDto> data;

}

package pl.manes.weatherrestapi.webclient.airvisual;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.weatherrestapi.model.AirVisualDto;
import pl.manes.weatherrestapi.webclient.OpenAirVisualCountriesDto;
import pl.manes.weatherrestapi.webclient.OpenAirVisualProvincesDto;

@Component
public class AirVisualClient {

    public static final String AIR_VISUAL_API = "https://api.airvisual.com/v2/";

    public static final String API_KEY = "e136b058-f44a-48ed-8858-c87e65991d0f";

    private final RestTemplate restTemplate = new RestTemplate();

    public AirVisualDto getCountryName(String country) {

        OpenAirVisualCountriesDto openAirVisualCountriesDto = callGetMethodCountryName("countries?key=e136b058-f44a-48ed-8858-c87e65991d0f", OpenAirVisualCountriesDto.class, country, API_KEY);
        return AirVisualDto.builder()
                .country(openAirVisualCountriesDto.getData().iterator().next().getCountry())
                .build();
    }

    public AirVisualDto getProvinceName(String state) {

        OpenAirVisualProvincesDto openAirVisualProvincesDto = callGetMethodProvinceName("states?country=Poland&key=e136b058-f44a-48ed-8858-c87e65991d0f",OpenAirVisualProvincesDto.class, state, API_KEY);
        return AirVisualDto.builder()
                .state(openAirVisualProvincesDto.getData().iterator().next().getState())
                .state(openAirVisualProvincesDto.getData().iterator().next().getState())
                .build();
    }

    private <T> T callGetMethodCountryName(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(AIR_VISUAL_API + url, responseType, objects);
    }

    private <T> T callGetMethodProvinceName(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(AIR_VISUAL_API + url, responseType, objects);
    }
}

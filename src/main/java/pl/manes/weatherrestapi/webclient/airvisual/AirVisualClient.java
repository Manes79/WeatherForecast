package pl.manes.weatherrestapi.webclient.airvisual;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.weatherrestapi.model.AirVisualDto;
import pl.manes.weatherrestapi.webclient.OpenAirVisualWeatherAndPollutionDto;

@Component
public class AirVisualClient {

    public static final String AIR_VISUAL_API = "https://api.airvisual.com/v2/";
    public static final String KEY = "e136b058-f44a-48ed-8858-c87e65991d0f";

    private final RestTemplate restTemplate = new RestTemplate();

    public AirVisualDto getWeatherAndPollutionForCity(String city, String state, String country) {

        OpenAirVisualWeatherAndPollutionDto openAirVisualWeatherAndPollutionDto = callGetMethodWeatherAndPollution
                ("city?city={city}&state={state}&country={country}&key={key}",
                        OpenAirVisualWeatherAndPollutionDto.class,
                        city,
                        state,
                        country,
                        KEY);

        return AirVisualDto.builder()
                .country(openAirVisualWeatherAndPollutionDto.getData().getCountry())
                .state(openAirVisualWeatherAndPollutionDto.getData().getState())
                .city(openAirVisualWeatherAndPollutionDto.getData().getCity())
                .aqicn(openAirVisualWeatherAndPollutionDto.getData().getCurrent().getPollution().getAqicn())
                .ts(openAirVisualWeatherAndPollutionDto.getData().getCurrent().getPollution().getTs())
                .tp(openAirVisualWeatherAndPollutionDto.getData().getCurrent().getWeather().getTp())
                .pr(openAirVisualWeatherAndPollutionDto.getData().getCurrent().getWeather().getPr())
                .hu(openAirVisualWeatherAndPollutionDto.getData().getCurrent().getWeather().getHu())
                .ws(openAirVisualWeatherAndPollutionDto.getData().getCurrent().getWeather().getWs())
                .build();
    }

    private <T> T callGetMethodWeatherAndPollution(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(AIR_VISUAL_API + url, responseType, objects);
    }
}

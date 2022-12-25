package pl.manes.weatherrestapi.webclient.airvisual;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.weatherrestapi.model.ForecastDto;
import pl.manes.weatherrestapi.webclient.OpenWeatherWeatherDto;

@Component
public class AirVisualClient {

    public static final String AIR_VISUAL_WEATHER_API = "https://api.airvisual.com/v2/states?country=Poland&key=e136b058-f44a-48ed-8858-c87e65991d0f";

    public static final String AIR_VISUAL_KEY = "e136b058-f44a-48ed-8858-c87e65991d0f";

//    public static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
//    public static final String API_KEY = "b61e0eb367cdc262ab184dc6f202d50d";
    private final RestTemplate restTemplate = new RestTemplate();

    public AirVisualWeaterDto getProvinceName(String state) {

        OpenWeatherWeatherDto openWeatherWeatherDto = callGetMethodProvinceName("states?country={state}&key={key}", OpenWeatherWeatherDto.class, state, AIR_VISUAL_KEY);

        return AirVisualWeaterDto.builder()
                .name(openWeatherWeatherDto.getCity().getName())
                .country(openWeatherWeatherDto.getCity().getCountry())
                .population(openWeatherWeatherDto.getCity().getPopulation())
                .timezone(openWeatherWeatherDto.getCity().getTimezone())
                .sunrise(openWeatherWeatherDto.getCity().getSunrise())
                .sunset(openWeatherWeatherDto.getCity().getSunset())
                .lat(openWeatherWeatherDto.getCity().getCoord().getLat())
                .lon(openWeatherWeatherDto.getCity().getCoord().getLon())
                .build();
    }

    private <T> T callGetMethodProvinceName(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(AIR_VISUAL_WEATHER_API + url, responseType, objects);
    }
}

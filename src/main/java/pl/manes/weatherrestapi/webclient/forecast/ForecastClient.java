package pl.manes.weatherrestapi.webclient.forecast;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.weatherrestapi.model.ForecastDto;
import pl.manes.weatherrestapi.webclient.OpenWeatherWeatherDto;

@Component
public class ForecastClient {

    public static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
    public static final String API_KEY = "b61e0eb367cdc262ab184dc6f202d50d";
    private final RestTemplate restTemplate = new RestTemplate();

    public ForecastDto getForecastForProvince(double lat, double lon) {
        OpenWeatherWeatherDto openWeatherWeatherDto = callGetMethod("forecast?lat={lat}&lon={lon}&appid={apiKey}&units=metric&lang=pl", OpenWeatherWeatherDto.class, lat, lon, API_KEY);

        return ForecastDto.builder()
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

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(WEATHER_URL + url, responseType, objects);
    }
}

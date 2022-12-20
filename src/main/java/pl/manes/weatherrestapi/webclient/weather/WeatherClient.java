package pl.manes.weatherrestapi.webclient.weather;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.weatherrestapi.model.WeatherDto;
import pl.manes.weatherrestapi.webclient.OpenWeatherWeatherDto;

@Component
public class WeatherClient {

    public static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
    public static final String API_KEY = "b61e0eb367cdc262ab184dc6f202d50d";
    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeatherForCity(String city) {
        OpenWeatherWeatherDto openWeatherWeatherDto = callGetMethod("weather?q={city}&appid={apiKey}&units=metric&lang=pl", OpenWeatherWeatherDto.class, city, API_KEY);

        return WeatherDto.builder()
                .main(openWeatherWeatherDto.getWeather().iterator().next().getMain())
                .description(openWeatherWeatherDto.getWeather().iterator().next().getDescription())
                .temperature(openWeatherWeatherDto.getMain().getTemp())
                .feels_like(openWeatherWeatherDto.getMain().getFeels_like())
                .pressure(openWeatherWeatherDto.getMain().getPressure())
                .humidity(openWeatherWeatherDto.getMain().getHumidity())
                .windSpeed(openWeatherWeatherDto.getWind().getSpeed())
                .build();
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(WEATHER_URL + url, responseType, objects);
    }
}

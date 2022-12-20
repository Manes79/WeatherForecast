package pl.manes.weatherrestapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.manes.weatherrestapi.model.WeatherDto;
import pl.manes.weatherrestapi.webclient.weather.WeatherClient;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherDto getWeatherForCityLublin() {
        return weatherClient.getWeatherForCity("lublin");
    }

    public WeatherDto getWeatherForCityWarsaw() {
        return weatherClient.getWeatherForCity("warszawa");
    }
}

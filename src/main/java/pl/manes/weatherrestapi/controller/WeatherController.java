package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.manes.weatherrestapi.model.WeatherDto;
import pl.manes.weatherrestapi.service.WeatherService;

@RestController
@RequiredArgsConstructor
@RequestMapping("weather")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/lublin")
    public WeatherDto getWeatherForLublin() {
        return weatherService.getWeatherForCityLublin();
    }

    @GetMapping("/warszawa")
    public WeatherDto getWeatherForWarszawa() {
        return weatherService.getWeatherForCityWarsaw();
    }
}

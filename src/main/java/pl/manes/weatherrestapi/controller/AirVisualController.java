package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.manes.weatherrestapi.model.AirVisualDto;
import pl.manes.weatherrestapi.service.AirVisualService;

@RestController
@RequiredArgsConstructor
@RequestMapping("cities")
public class AirVisualController {

    private final AirVisualService airVisualService;

    @GetMapping("/lublin")
    public AirVisualDto getWeatherAndPollutionForCity() {
        return airVisualService.getWeatherAndPollutionForCityLublin();
    }

}

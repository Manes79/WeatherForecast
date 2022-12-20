package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.manes.weatherrestapi.model.ForecastDto;
import pl.manes.weatherrestapi.service.ForecastService;

@RestController
@RequiredArgsConstructor
@RequestMapping("forecast")
public class ForecastController {

    private final ForecastService forecastService;

    @GetMapping("/lubelskie")
    public ForecastDto getForecastForProvinceLubelskie() {
        return forecastService.getForecastForProvinceLubelskie();
    }
}

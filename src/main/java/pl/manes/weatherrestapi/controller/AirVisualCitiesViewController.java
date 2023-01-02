package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.manes.weatherrestapi.service.AirVisualService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cities")
public class AirVisualCitiesViewController {

    private final AirVisualService airVisualService;

    @GetMapping("/warszawa")
    public String viewWeatherAndPollutionForBiggestCityInMazoviaState(Model model) {

        model.addAttribute("city", airVisualService.getWeatherAndPollutionForBiggestCityInStateMazovia());


        return "cities/warsaw";
    }
}

package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/weather")
public class AirVisualViewController {

    @GetMapping
    public String viewHomeSite(Model model) {


        return "weather/index";
    }
}

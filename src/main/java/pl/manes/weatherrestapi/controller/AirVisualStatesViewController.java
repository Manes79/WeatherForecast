package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/states")
public class AirVisualStatesViewController {

    @GetMapping("/lubelskie")
    public String viewLubelskieSiteMap() {

        return "states/lubelskie";
    }
}

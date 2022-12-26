package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.manes.weatherrestapi.model.AirVisualDto;
import pl.manes.weatherrestapi.service.AirVisualService;

@RestController
@RequiredArgsConstructor
@RequestMapping("countries")
public class AirVisualController {

    private final AirVisualService airVisualService;

    @GetMapping("/polska")
    public AirVisualDto getCountryNamePoland(){
        return airVisualService.getCountryNamePoland();
    }

    @GetMapping("/province/wielkopolska")
    public AirVisualDto getProvinceNameGreaterPoland(){
        return airVisualService.getProvinceNameGreaterPoland();
    }

    @GetMapping("/province/malopolska")
    public AirVisualDto getProvinceNameLesserPolandVoivodeship(){
        return airVisualService.getProvinceNameGreaterPoland();
    }
}

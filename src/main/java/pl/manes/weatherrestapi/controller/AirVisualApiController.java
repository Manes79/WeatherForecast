package pl.manes.weatherrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.manes.weatherrestapi.domain.Dto.AirVisualDto;
import pl.manes.weatherrestapi.service.AirVisualService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/cities")
public class AirVisualApiController {

    private final AirVisualService airVisualService;

    @GetMapping("/lublin")
    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateLublin() {
        return airVisualService.getWeatherAndPollutionForBiggestCityInStateLublin();
    }

    @GetMapping("/lubelskie/bialapodlaska")
    public AirVisualDto getWeatherAndPollutionForCityBialaPodlaskaInStateLublin() {
        return airVisualService.getWeatherAndPollutionForCityBialaPodlaskaInStateLublin();
    }

    @GetMapping("/lubelskie/chelm")
    public AirVisualDto getWeatherAndPollutionForCityChelmInStateLublin() {
        return airVisualService.getWeatherAndPollutionForCityChelmInStateLublin();
    }

    @GetMapping("/lubelskie/janowlubelski")
    public AirVisualDto getWeatherAndPollutionForCityJanowLubelskiInStateLublin() {
        return airVisualService.getWeatherAndPollutionForCityJanowLubelskiInStateLublin();
    }

    @GetMapping("/lubelskie/radzynpodlaski")
    public AirVisualDto getWeatherAndPollutionForCityRadzynPodlaskiInStateLublin() {
        return airVisualService.getWeatherAndPollutionForCityRadzynPodlaskiInStateLublin();
    }

    @GetMapping("/lubelskie/zamosc")
    public AirVisualDto getWeatherAndPollutionForCityZamoscInStateLublin() {
        return airVisualService.getWeatherAndPollutionForCityZamoscInStateLublin();
    }

    @GetMapping("/warszawa")
    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateMazovia() {
        return airVisualService.getWeatherAndPollutionForBiggestCityInStateMazovia();
    }

    @GetMapping("/krakow")
    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateLesserPolandVoivodeship() {
        return airVisualService.getWeatherAndPollutionForBiggestCityInStateLesserPolandVoivodeship();
    }

}

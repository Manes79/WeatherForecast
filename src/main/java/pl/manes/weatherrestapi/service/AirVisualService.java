package pl.manes.weatherrestapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.manes.weatherrestapi.domain.Dto.AirVisualDto;
import pl.manes.weatherrestapi.webclient.airvisual.AirVisualClient;

@Service
@RequiredArgsConstructor
public class AirVisualService {

    private final AirVisualClient airVisualClient;


    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateLublin() {
        return airVisualClient.getWeatherAndPollutionForCity("Lublin", "Lublin", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForCityBialaPodlaskaInStateLublin() {
        return airVisualClient.getWeatherAndPollutionForCity("Biala Podlaska", "Lublin", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForCityChelmInStateLublin() {
        return airVisualClient.getWeatherAndPollutionForCity("Chelm", "Lublin", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForCityJanowLubelskiInStateLublin() {
        return airVisualClient.getWeatherAndPollutionForCity("Janow Lubelski", "Lublin", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForCityRadzynPodlaskiInStateLublin() {
        return airVisualClient.getWeatherAndPollutionForCity("Radzyn Podlaski", "Lublin", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForCityZamoscInStateLublin() {
        return airVisualClient.getWeatherAndPollutionForCity("Zamosc", "Lublin", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateMazovia() {
        return airVisualClient.getWeatherAndPollutionForCity("Warsaw", "Mazovia", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateLesserPolandVoivodeship() {
        return airVisualClient.getWeatherAndPollutionForCity("Krakow", "Lesser Poland Voivodeship", "Poland");
    }
}

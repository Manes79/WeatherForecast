package pl.manes.weatherrestapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.manes.weatherrestapi.model.AirVisualDto;
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

    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateWarszawa() {
        return airVisualClient.getWeatherAndPollutionForCity("Warsaw", "Mazovia", "Poland");
    }

    public AirVisualDto getWeatherAndPollutionForBiggestCityInStateKrakow() {
        return airVisualClient.getWeatherAndPollutionForCity("Krakow", "Lesser Poland Voivodeship", "Poland");
    }
}

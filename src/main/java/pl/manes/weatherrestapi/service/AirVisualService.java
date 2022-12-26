package pl.manes.weatherrestapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.manes.weatherrestapi.model.AirVisualDto;
import pl.manes.weatherrestapi.webclient.airvisual.AirVisualClient;

@Service
@RequiredArgsConstructor
public class AirVisualService {

    private final AirVisualClient airVisualClient;

    public AirVisualDto getCountryNamePoland() {
        return airVisualClient.getCountryName("Poland");
    }

    public AirVisualDto getProvinceNameGreaterPoland() {
        return airVisualClient.getProvinceName("Greater Poland");
    }

    public AirVisualDto getProvinceNameLesserPolandVoivodeship() {
        return airVisualClient.getProvinceName("Lesser Poland Voivodeship");
    }
}

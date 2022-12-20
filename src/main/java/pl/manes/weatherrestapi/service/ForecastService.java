package pl.manes.weatherrestapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.manes.weatherrestapi.model.ForecastDto;
import pl.manes.weatherrestapi.webclient.forecast.ForecastClient;

@Service
@RequiredArgsConstructor
public class ForecastService {

    private final ForecastClient forecastClient;

    public ForecastDto getForecastForProvinceLubelskie() {
        return forecastClient.getForecastForProvince(51, 23);
    }
}

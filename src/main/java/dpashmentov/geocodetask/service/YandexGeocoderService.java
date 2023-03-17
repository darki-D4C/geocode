package dpashmentov.geocodetask.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import dpashmentov.geocodetask.client.YandexGeocoderClient;
import dpashmentov.geocodetask.entity.geocoding.YandexGeocoderResponse;
import dpashmentov.geocodetask.repository.ResponseRepository;

@Service
@RequiredArgsConstructor
public class YandexGeocoderService {

    private final YandexGeocoderClient yandexGeocoderClient;

    private final ResponseRepository repository;

    public YandexGeocoderResponse convertAddress(String format, String apiKey, String geocode) {
        YandexGeocoderResponse response = yandexGeocoderClient.geocode(format, apiKey, geocode);
        repository.save(response);
        return response;
    }
}

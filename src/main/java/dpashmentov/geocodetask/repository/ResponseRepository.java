package dpashmentov.geocodetask.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dpashmentov.geocodetask.entity.geocoding.YandexGeocoderResponse;

public interface ResponseRepository extends MongoRepository<YandexGeocoderResponse,String> {
}

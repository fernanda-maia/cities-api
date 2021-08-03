package one.digitalinnovation.citiesapi.city.service;

import one.digitalinnovation.citiesapi.city.model.entity.City;
import one.digitalinnovation.citiesapi.city.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistanceService {

    @Autowired
    private CityRepository repository;

    public Double calculateByPoints(Long city1, Long city2) {
        return repository.calculateByPoints(city1, city2);
    }

    public Double calculateByCube(Long idCity1, Long idCity2) {
        City city1 = repository.getById(idCity1);
        City city2 = repository.getById(idCity2);

        Double lat1 = city1.getGeolocation().getX();
        Double lon1 = city1.getGeolocation().getY();

        Double lat2 = city2.getGeolocation().getX();
        Double lon2 = city2.getGeolocation().getY();

        return repository.calculateByCube(lat1, lon1, lat2, lon2);
    }
}

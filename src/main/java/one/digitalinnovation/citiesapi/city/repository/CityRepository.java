package one.digitalinnovation.citiesapi.city.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import one.digitalinnovation.citiesapi.city.model.entity.City;


public interface CityRepository extends JpaRepository<City, Long> {
}

package one.digitalinnovation.citiesapi.country.repository;

import one.digitalinnovation.citiesapi.country.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {
}

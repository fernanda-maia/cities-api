package one.digitalinnovation.citiesapi.city.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.citiesapi.city.model.entity.City;


public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> "
            + "(SELECT lat_lon FROM cidade WHERE id=?2)) AS distance",
            nativeQuery = true)
    Double calculateByPoints(Long city1, Long city2);

    @Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), "
            + "ll_to_earth(?3,?4)) as distance",
            nativeQuery = true)
    Double calculateByCube(Double lat1, Double lon1,
                           Double lat2, Double lon2);
}

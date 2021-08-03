package one.digitalinnovation.citiesapi.city;

import one.digitalinnovation.citiesapi.city.model.entity.City;
import one.digitalinnovation.citiesapi.city.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/cities")
public class CityController {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<City> getAll(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<City> optional = repository.findById(id);

        return optional.isEmpty()
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok().body(optional.get());
    }
}

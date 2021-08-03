package one.digitalinnovation.citiesapi.country;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import one.digitalinnovation.citiesapi.country.model.entity.Country;
import one.digitalinnovation.citiesapi.country.repository.CountryRepository;


@RestController
@RequestMapping(path = "/countries")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> getAll(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Country> optionalCountry = repository.findById(id);

        return optionalCountry.isEmpty() ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok().body(optionalCountry.get());
    }
}

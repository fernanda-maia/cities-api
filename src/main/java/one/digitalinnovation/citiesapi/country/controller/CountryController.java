package one.digitalinnovation.citiesapi.country.controller;

import org.springframework.http.MediaType;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.citiesapi.country.model.dto.CountryDTO;
import one.digitalinnovation.citiesapi.country.service.CountryService;

import java.util.List;


@RestController
@RequestMapping(path = "/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CountryDTO>> getAll(Pageable page) {

        return ResponseEntity.ok()
                .body(countryService.getAll(page));
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CountryDTO> getById(@PathVariable Long id) {

        return ResponseEntity.ok()
                .body(countryService.getById(id));
    }
}

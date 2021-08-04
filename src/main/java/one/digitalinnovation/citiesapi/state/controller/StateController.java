package one.digitalinnovation.citiesapi.state.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import one.digitalinnovation.citiesapi.state.model.dto.StateDTO;
import one.digitalinnovation.citiesapi.state.service.StateService;


@RestController
@RequestMapping(path = "/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StateDTO>> getAll(Pageable page) {

        return ResponseEntity.ok().body(stateService.getAll(page));
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StateDTO> getById(@PathVariable Long id) {

        return ResponseEntity.ok().body(stateService.getById(id));

    }
}

package one.digitalinnovation.citiesapi.state;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.citiesapi.state.model.entity.State;
import one.digitalinnovation.citiesapi.state.repository.StateRepository;

import java.util.Optional;


@RestController
@RequestMapping(path = "/states")
public class StateController {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public Page<State> getAll(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<State> optional = repository.findById(id);

        return optional.isEmpty()
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok().body(optional.get());

    }
}

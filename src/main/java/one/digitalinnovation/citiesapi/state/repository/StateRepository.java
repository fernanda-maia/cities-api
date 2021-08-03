package one.digitalinnovation.citiesapi.state.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import one.digitalinnovation.citiesapi.state.model.entity.State;


public interface StateRepository extends JpaRepository<State, Long> {
}

package one.digitalinnovation.citiesapi.state.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.digitalinnovation.citiesapi.state.model.entity.State;
import one.digitalinnovation.citiesapi.state.model.dto.StateDTO;

import java.util.List;


@Mapper
public interface StateMapper {

    StateMapper INSTANCE = Mappers.getMapper(StateMapper.class);

    State toModel(StateDTO stateDTO);
    StateDTO toDTO(State state);

    List<StateDTO> toDTO(List<State> states);
}

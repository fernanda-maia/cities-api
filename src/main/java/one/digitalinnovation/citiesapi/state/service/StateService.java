package one.digitalinnovation.citiesapi.state.service;

import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import one.digitalinnovation.citiesapi.util.ErrorMessageUtil;
import one.digitalinnovation.citiesapi.state.model.dto.StateDTO;
import one.digitalinnovation.citiesapi.state.model.entity.State;
import one.digitalinnovation.citiesapi.state.mapper.StateMapper;
import one.digitalinnovation.citiesapi.exception.NotFoudException;
import one.digitalinnovation.citiesapi.state.repository.StateRepository;


@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    private final StateMapper stateMapper = StateMapper.INSTANCE;

    @Transactional(readOnly = true)
    public List<StateDTO> getAll(Pageable page) {
        return stateRepository.findAll(page)
                .map(stateMapper::toDTO).toList();
    }

    @Transactional(readOnly = true)
    public StateDTO getById(Long id) {
        Optional<State> optional = stateRepository.findById(id);

        if(optional.isEmpty()) {
            throw new NotFoudException(ErrorMessageUtil.STATE_NOT_FOUND);
        }

        return stateMapper.toDTO(optional.get());
    }
}

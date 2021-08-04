package one.digitalinnovation.citiesapi.country.service;

import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import one.digitalinnovation.citiesapi.util.ErrorMessageUtil;
import one.digitalinnovation.citiesapi.exception.NotFoudException;
import one.digitalinnovation.citiesapi.country.model.dto.CountryDTO;
import one.digitalinnovation.citiesapi.country.mapper.CountryMapper;
import one.digitalinnovation.citiesapi.country.model.entity.Country;
import one.digitalinnovation.citiesapi.country.repository.CountryRepository;


@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    private final CountryMapper countryMapper = CountryMapper.INSTANCE;

    @Transactional(readOnly = true)
    public List<CountryDTO> getAll(Pageable page) {
        return countryRepository.findAll(page)
                .map(countryMapper::toDTO).toList();
    }

    @Transactional(readOnly = true)
    public CountryDTO getById(Long id) {
        Optional<Country> optional = countryRepository.findById(id);

        if(optional.isEmpty()) {
            throw new NotFoudException(ErrorMessageUtil.COUNTRY_NOT_FOUND);
        }

        return countryMapper.toDTO(optional.get());
    }
}

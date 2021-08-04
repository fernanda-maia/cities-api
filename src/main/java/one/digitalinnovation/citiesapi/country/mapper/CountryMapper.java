package one.digitalinnovation.citiesapi.country.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

import one.digitalinnovation.citiesapi.country.model.dto.CountryDTO;
import one.digitalinnovation.citiesapi.country.model.entity.Country;


@Mapper
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    Country toModel(CountryDTO countryDTO);
    CountryDTO toDTO(Country country);

    List<CountryDTO> toDTO(List<Country> countries);
}

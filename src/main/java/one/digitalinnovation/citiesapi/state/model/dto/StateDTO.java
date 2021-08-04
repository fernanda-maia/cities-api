package one.digitalinnovation.citiesapi.state.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import java.util.List;

import one.digitalinnovation.citiesapi.country.model.entity.Country;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StateDTO {

    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String uf;

    @NotNull
    private Integer ibge;

    @NotNull
    private Country country;

    @NotNull
    private List<Integer> ddd;
}

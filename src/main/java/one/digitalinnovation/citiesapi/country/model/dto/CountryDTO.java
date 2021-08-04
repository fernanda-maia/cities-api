package one.digitalinnovation.citiesapi.country.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryDTO {

    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String ptName;

    @Max(2)
    @NotEmpty
    private String code;

    @NotNull
    private Integer bacen;
}

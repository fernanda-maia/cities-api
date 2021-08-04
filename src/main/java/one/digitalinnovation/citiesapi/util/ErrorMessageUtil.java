package one.digitalinnovation.citiesapi.util;

import lombok.Getter;
import lombok.AllArgsConstructor;


@Getter
@AllArgsConstructor
public enum ErrorMessageUtil {

    COUNTRY_NOT_FOUND("Country not found"),
    STATE_NOT_FOUND("State not found"),
    CITY_NOT_FOUND("City not found");

    private final String description;
}

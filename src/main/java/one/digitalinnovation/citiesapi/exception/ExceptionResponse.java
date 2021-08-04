package one.digitalinnovation.citiesapi.exception;

import lombok.Data;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;


@Data
@AllArgsConstructor
public class ExceptionResponse {
    private String message;
    private HttpStatus httpStatus;
}

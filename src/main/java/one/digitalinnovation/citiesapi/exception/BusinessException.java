package one.digitalinnovation.citiesapi.exception;

import lombok.Getter;

import one.digitalinnovation.citiesapi.util.ErrorMessageUtil;
import org.springframework.http.HttpStatus;


@Getter
public class BusinessException extends RuntimeException {

    private final HttpStatus httpStatus;

    public BusinessException(ErrorMessageUtil e, HttpStatus status) {
        super(e.getDescription());
        this.httpStatus = status;
    }
}

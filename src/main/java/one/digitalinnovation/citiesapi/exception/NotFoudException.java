package one.digitalinnovation.citiesapi.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import one.digitalinnovation.citiesapi.util.ErrorMessageUtil;


@Getter
public class NotFoudException extends RuntimeException {
    final HttpStatus httpStatus = HttpStatus.NOT_FOUND;

    public NotFoudException(ErrorMessageUtil e) {
        super(e.getDescription());
    }


}

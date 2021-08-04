package one.digitalinnovation.citiesapi.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ExceptionResponse> handleSecurity(BusinessException e) {
        ExceptionResponse response = new ExceptionResponse(e.getMessage(),
                e.getHttpStatus());

        return ResponseEntity.status(e.getHttpStatus()).body(response);
    }

    @ExceptionHandler(NotFoudException.class)
    protected ResponseEntity<ExceptionResponse> handleNotFound(NotFoudException e) {
        ExceptionResponse response = new ExceptionResponse(e.getMessage(),
                e.getHttpStatus());

        return ResponseEntity.status(e.getHttpStatus()).body(response);
    }
}

package in.sdqali.spring.jwt.demo.web.advices;

import in.sdqali.spring.jwt.demo.exceptions.ProfileNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(ProfileNotFoundException.class)
    public void profileNotFound() {
    }
}

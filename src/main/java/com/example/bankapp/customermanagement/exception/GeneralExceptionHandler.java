package com.example.bankapp.customermanagement.exception;

import com.example.bankapp.customermanagement.response.GeneralErrorResponse;
import org.hibernate.PropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class GeneralExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public GeneralErrorResponse handlerConstraintViolationException(ConstraintViolationException exception){
        return new GeneralErrorResponse(exception.getMessage());
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PropertyValueException.class)
    public GeneralErrorResponse PropertyValueException(PropertyValueException exception){
        return new GeneralErrorResponse(exception.getMessage());
    }

}

package com.example.bankapp.customermanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerCannotBeDeleted extends GeneralException{
    public CustomerCannotBeDeleted(String message){
        super(message);
    }

}

package com.example.bankapp.accountmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AccountDeletionException extends RuntimeException{
    public AccountDeletionException(String message){
        super(message);
    }
}

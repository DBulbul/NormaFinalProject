package com.example.bankapp.customermanagement.exception;


import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;


public class GeneralException extends RuntimeException{
    private String message;
    private HttpStatus statusCode;

    public GeneralException(String message,HttpStatus statusCode){
        super(message);
        this.statusCode=statusCode;
    }
    public  GeneralException(String message){
        super(message);
    }
    public GeneralException(){};
}
package com.example.bankapp.cardmanagement.service;

import com.example.bankapp.cardmanagement.requests.CreateCreditCardRequest;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface CreditCardService {
    public ResponseEntity<Object> createCreditCard(CreateCreditCardRequest request);
    ResponseEntity<Object> deleteCreditCardByCardNumber(long cardNumber) throws IOException;
}


package com.example.bankapp.cardmanagement.service;

import com.example.bankapp.cardmanagement.entities.CreditCard;
import com.example.bankapp.cardmanagement.entities.DebitCard;
import com.example.bankapp.cardmanagement.requests.CreateCreditCardRequest;
import com.example.bankapp.cardmanagement.requests.CreateDebitCardRequest;
import org.springframework.http.ResponseEntity;

public interface CardService {
    public ResponseEntity<Object> createCreditCard(CreditCard creditCard, CreateCreditCardRequest request);
    public ResponseEntity<Object> createDebitCard(DebitCard debitCard, CreateDebitCardRequest request);
}

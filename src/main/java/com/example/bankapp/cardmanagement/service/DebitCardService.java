package com.example.bankapp.cardmanagement.service;

import com.example.bankapp.cardmanagement.requests.CreateDebitCardRequest;
import com.example.bankapp.transactionmanagement.controller.TransactionFromDebitCardController;
import com.example.bankapp.transactionmanagement.entities.TransactionFromCard;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface DebitCardService {
    ResponseEntity<Object> createDebitCard(CreateDebitCardRequest request);
    ResponseEntity<Object> deleteDebitCardByCardNumber(long cardNumber) throws IOException;

}

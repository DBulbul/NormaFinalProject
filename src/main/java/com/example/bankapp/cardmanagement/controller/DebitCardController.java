package com.example.bankapp.cardmanagement.controller;

import com.example.bankapp.cardmanagement.requests.CreateDebitCardRequest;
import com.example.bankapp.cardmanagement.service.DebitCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@RestController
@RequiredArgsConstructor
@RequestMapping("/account/debitCards")
public class DebitCardController {
    private final DebitCardService debitCardService;
    @PostMapping("/create/debit-card")
    public ResponseEntity<Object> create(@RequestBody CreateDebitCardRequest createDebitCardRequest) throws IOException {
        return debitCardService.createDebitCard(createDebitCardRequest);
}
    @DeleteMapping("/delete/{cardNumber}")
    private ResponseEntity<Object> delete(@PathVariable long cardNumber)throws IOException {

        return debitCardService.deleteDebitCardByCardNumber(cardNumber);

    }
}

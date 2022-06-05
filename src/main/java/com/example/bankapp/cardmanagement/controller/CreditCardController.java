package com.example.bankapp.cardmanagement.controller;

import com.example.bankapp.cardmanagement.requests.CreateCreditCardRequest;
import com.example.bankapp.cardmanagement.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@RequiredArgsConstructor
@RestController
@RequestMapping("/customer/cards")
public class CreditCardController {
    private final CreditCardService creditCardService;


    @PostMapping("/create/credit-card")
    public ResponseEntity<Object> create(@RequestBody CreateCreditCardRequest createCreditCardRequest) throws IOException {
        return creditCardService.createCreditCard(createCreditCardRequest);
    }
    @DeleteMapping("/delete/{cardNumber}")
    private ResponseEntity<Object> delete(@PathVariable long cardNumber)throws IOException {

        return creditCardService.deleteCreditCardByCardNumber(cardNumber);

    }

}

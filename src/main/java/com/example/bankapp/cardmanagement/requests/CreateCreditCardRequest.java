package com.example.bankapp.cardmanagement.requests;

import com.example.bankapp.cardmanagement.entities.CreditCard;
import com.example.bankapp.cardmanagement.service.CreditCardService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCreditCardRequest {
    private long customer_id;
    private long cardNumber;
    private double cardLimit;
}

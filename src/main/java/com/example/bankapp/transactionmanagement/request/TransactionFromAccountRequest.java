package com.example.bankapp.transactionmanagement.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionFromAccountRequest {
    private String sendingIBAN;
    private String receivingIBAN;
    private double amount;
    private String description;

}

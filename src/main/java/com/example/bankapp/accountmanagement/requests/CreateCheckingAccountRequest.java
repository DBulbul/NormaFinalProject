package com.example.bankapp.accountmanagement.requests;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.accountmanagement.repositories.AccountRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCheckingAccountRequest {
    private CurrencyType currencyType;
    private long customerId;
    private String IBAN;
    private long accountNumber;
    private double balance;
}

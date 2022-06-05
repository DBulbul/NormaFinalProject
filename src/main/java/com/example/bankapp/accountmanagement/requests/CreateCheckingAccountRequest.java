package com.example.bankapp.accountmanagement.requests;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CreateCheckingAccountRequest {
    private CurrencyType currencyType;
    private long customerId;
    @NotNull(message="IBAN cannot be null")
    @Pattern(regexp="^TR\\d{7}[0-9A-Z]{17}$")
    private String IBAN;
    private long accountNumber;
    private float balance;
}

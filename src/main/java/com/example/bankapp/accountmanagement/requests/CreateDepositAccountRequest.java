package com.example.bankapp.accountmanagement.requests;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.accountmanagement.enums.DayEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDepositAccountRequest {

    private CurrencyType currencyType;
    private long customerId;
    private float balance;
    private DayEnum day;
}

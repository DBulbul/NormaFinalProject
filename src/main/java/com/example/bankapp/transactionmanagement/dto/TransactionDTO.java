package com.example.bankapp.transactionmanagement.dto;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class TransactionDTO {
    private double price;
    private CurrencyType currencyType;
    private LocalDate transactionDate;
    }

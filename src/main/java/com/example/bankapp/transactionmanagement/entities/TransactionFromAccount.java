package com.example.bankapp.transactionmanagement.entities;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.transactionmanagement.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionFromAccount extends Transaction{

    @Enumerated(EnumType.ORDINAL)
    private TransactionType transactionType;

    private String sendingIBAN;
    private String receivingIBAN;

    @Enumerated(EnumType.ORDINAL)
    private CurrencyType sendingCurrencyType;

    @Enumerated(EnumType.ORDINAL)
    private CurrencyType receivingCurrencyType;
}

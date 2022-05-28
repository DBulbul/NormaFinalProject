package com.example.bankapp.transactionmanagement.entities;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.cardmanagement.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionFromCard extends Transaction{
    private String cardNumber;
    private CardType transactionCardType;
    private CurrencyType currencyType;
}

package com.example.bankapp.accountmanagement.entities;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Getter
@Setter
public class Currency {

    @Enumerated(EnumType.ORDINAL)
    private CurrencyType currencyType;


}

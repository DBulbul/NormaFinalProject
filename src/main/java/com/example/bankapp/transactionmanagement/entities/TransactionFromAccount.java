package com.example.bankapp.transactionmanagement.entities;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.transactionmanagement.dto.TransactionFromAccountDTO;
import com.example.bankapp.transactionmanagement.enums.TransactionType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionFromAccount extends Transaction{

    @Enumerated(EnumType.ORDINAL)
    private TransactionType transactionType;

    private String sendingIBAN;
    private String receivingIBAN;

    @Enumerated(EnumType.ORDINAL)
    private CurrencyType sendingCurrencyType;

    @Enumerated(EnumType.ORDINAL)
    private CurrencyType receivingCurrencyType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    public TransactionFromAccountDTO toTransactionFromAccountDTO(){
        return TransactionFromAccountDTO.builder()
                .sendingIBAN(this.sendingIBAN)
                .receivingIBAN(this.receivingIBAN)
                .sendingCurrencyType(this.sendingCurrencyType)
                .receivingCurrencyType(this.receivingCurrencyType)
                .transactionDate(this.transactionDate).build();
    }
}

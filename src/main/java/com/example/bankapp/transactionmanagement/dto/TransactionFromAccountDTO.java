package com.example.bankapp.transactionmanagement.dto;

import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.transactionmanagement.entities.TransactionFromAccount;
import com.example.bankapp.transactionmanagement.enums.TransactionType;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionFromAccountDTO {

    private String sendingIBAN;
    private String receivingIBAN;
    private CurrencyType sendingCurrencyType;
    private CurrencyType receivingCurrencyType;
    private double amount;
    private String description;
    private Date transactionDate;

    public TransactionFromAccountDTO toTransactionDTO() {
        return TransactionFromAccountDTO.builder().sendingIBAN(this.sendingIBAN)
                .receivingIBAN(this.receivingIBAN)
                .sendingCurrencyType(this.sendingCurrencyType)
                .receivingCurrencyType(this.receivingCurrencyType)
                .transactionDate(this.transactionDate)
                .build();

    }
}




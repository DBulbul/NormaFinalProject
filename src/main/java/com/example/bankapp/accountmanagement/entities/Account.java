package com.example.bankapp.accountmanagement.entities;


import com.example.bankapp.accountmanagement.enums.AccountType;
import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.customermanagement.entities.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountNumber;

    @Pattern(regexp="^[a-zA-Z]+$")
    private String branchName;

    private long branchCode;


    private String IBAN;


    private float balance;

    private boolean isActive;

    private boolean isBlocked;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date blockedDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date canBeActiveAt;

    @Enumerated(EnumType.ORDINAL)
    private AccountType accountType=AccountType.CheckingAccount;


    @Enumerated(EnumType.ORDINAL)
    private CurrencyType currencyType;


    @ManyToOne
    private Customer customer;

}

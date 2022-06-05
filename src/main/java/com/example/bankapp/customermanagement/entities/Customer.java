package com.example.bankapp.customermanagement.entities;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.customermanagement.enums.CompanyType;
import com.example.bankapp.cardmanagement.entities.CreditCard;
import com.example.bankapp.transactionmanagement.entities.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Long identityNumber;

    private Long taxIdentificationNumber;

    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private Date birthdate;

    @Enumerated(EnumType.ORDINAL)
    private CompanyType companyType;

    private double balance;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Account> accounts;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CreditCard> creditCards;

    @OneToOne(mappedBy="customer",cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(mappedBy ="customer",cascade= CascadeType.ALL)
    private ContactInfo contactInfo;

    @JsonIgnore
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Transaction> transactions;
}

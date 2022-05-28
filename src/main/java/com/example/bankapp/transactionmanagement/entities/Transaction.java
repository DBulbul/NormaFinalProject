package com.example.bankapp.transactionmanagement.entities;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.customermanagement.entities.Customer;
import com.example.bankapp.transactionmanagement.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private Long id;


    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Account account;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionDate=" + transactionDate +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", Account=" + account +
                '}';
    }

}
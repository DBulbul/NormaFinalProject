package com.example.bankapp.cardmanagement.entities;

import com.example.bankapp.customermanagement.entities.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard extends Card {

    private double cardLimit;
    private double cardBalance;

    @ManyToOne
    @JsonIgnore
    private Customer customer;
}

package com.example.bankapp.cardmanagement.entities;

import com.example.bankapp.accountmanagement.entities.CheckingAccount;
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
public class DebitCard extends Card{
    @ManyToOne
    private CheckingAccount checkingAccount;
}

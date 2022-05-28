package com.example.bankapp.accountmanagement.entities;

import com.example.bankapp.accountmanagement.enums.AccountType;
import com.example.bankapp.accountmanagement.enums.CurrencyType;
import com.example.bankapp.cardmanagement.entities.DebitCard;
import com.example.bankapp.customermanagement.entities.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
@Getter
@Setter
public class CheckingAccount extends Account{

    @OneToMany(mappedBy = "checkingAccount", cascade = CascadeType.ALL)
    private List<DebitCard> debitCards;


    public CheckingAccount() {
    }


}

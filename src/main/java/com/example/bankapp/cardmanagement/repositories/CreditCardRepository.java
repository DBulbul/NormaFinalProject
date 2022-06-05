package com.example.bankapp.cardmanagement.repositories;

import com.example.bankapp.cardmanagement.entities.CreditCard;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CardRepository {

    CreditCard findByCardNumber(long cardNumber);

}
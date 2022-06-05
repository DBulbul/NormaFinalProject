package com.example.bankapp.cardmanagement.repositories;

import com.example.bankapp.cardmanagement.entities.DebitCard;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardRepository extends CardRepository {

    DebitCard findByCardNumber(long cardNumber);
}
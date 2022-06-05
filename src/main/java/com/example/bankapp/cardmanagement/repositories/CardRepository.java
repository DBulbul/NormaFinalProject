package com.example.bankapp.cardmanagement.repositories;

import com.example.bankapp.cardmanagement.entities.Card;
import com.example.bankapp.cardmanagement.entities.CreditCard;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface CardRepository extends JpaRepository<Card,Long> {
    Card findByCardNumber(long cardNumber);
}
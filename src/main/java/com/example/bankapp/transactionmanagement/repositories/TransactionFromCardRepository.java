package com.example.bankapp.transactionmanagement.repositories;

import com.example.bankapp.transactionmanagement.entities.TransactionFromCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionFromCardRepository extends JpaRepository<TransactionFromCard,Long> {
    /*List<TransactionFromCard> findByCardNumber(long cardNumber);
    List<TransactionFromCard> findByTransactionDateBetween(Date start, Date end, long cardNumber);
    */

}

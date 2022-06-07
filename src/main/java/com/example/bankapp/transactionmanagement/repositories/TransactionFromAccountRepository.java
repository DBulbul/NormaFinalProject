package com.example.bankapp.transactionmanagement.repositories;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.transactionmanagement.entities.TransactionFromAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionFromAccountRepository extends JpaRepository<TransactionFromAccount,Long> {

}

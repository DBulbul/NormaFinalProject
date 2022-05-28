package com.example.bankapp.accountmanagement.repositories;

import com.example.bankapp.accountmanagement.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByAccountNumber(long accountNumber);
}
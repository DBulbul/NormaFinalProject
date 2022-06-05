package com.example.bankapp.accountmanagement.repositories;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.entities.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount,Long> {
    CheckingAccount findByAccountNumber(long accountNumber);
    }
package com.example.bankapp.accountmanagement.repositories;

import com.example.bankapp.accountmanagement.entities.Account;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Primary
public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByAccountNumber(long accountNumber);
 }
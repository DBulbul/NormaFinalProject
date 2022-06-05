package com.example.bankapp.accountmanagement.service;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.requests.CreateCheckingAccountRequest;
import com.example.bankapp.accountmanagement.requests.CreateDepositAccountRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface AccountService {
    ResponseEntity<Object> create(CreateCheckingAccountRequest request) throws IOException;
    ResponseEntity<Object> create(CreateDepositAccountRequest request) throws IOException;
    ResponseEntity<Object> deleteAccount(long accountNumber);
    Page<Account> listPageAccount(Pageable pageable);
  }

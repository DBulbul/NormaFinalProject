package com.example.bankapp.accountmanagement.service;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.repositories.AccountRepository;
import com.example.bankapp.accountmanagement.requests.CreateCheckingAccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;


    @Override
    public ResponseEntity<Object> create(CreateCheckingAccountRequest request){
        Account account = new Account();
        account.setCurrencyType(request.getCurrencyType());
        account.setAccountNumber(request.getCustomerId());
        account.setIBAN(request.getIBAN());

        accountRepository.save(account);
        return ResponseEntity.status(HttpStatus.OK).body("Account is created");
    }

    @Override
    public ResponseEntity<Object> deleteAccount(long accountNumber) throws IOException {

        Account account = accountRepository.findByAccountNumber(accountNumber);

        if (accountNumber==0L) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Account is not found");
        }
        if (account.getBalance() != 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Account have a balance.Delete operation is not allowed.");
        }
        accountRepository.delete(account);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Account is deleted.");
    }
    @Override
    public Page<Account> listPageAccount(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

}





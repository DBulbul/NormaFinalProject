package com.example.bankapp.accountmanagement.service;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.repositories.AccountRepository;
import com.example.bankapp.accountmanagement.requests.CreateCheckingAccountRequest;
import com.example.bankapp.accountmanagement.requests.CreateDepositAccountRequest;
import com.example.bankapp.customermanagement.entities.Customer;
import com.example.bankapp.customermanagement.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;


    @Override
    public ResponseEntity<Object> create(CreateCheckingAccountRequest request) {
        Customer customer = customerRepository.findById(request.getCustomerId());


        Account account = new Account();
        account.setCurrencyType(request.getCurrencyType());
        account.setAccountNumber(request.getAccountNumber());


        account.setCustomer(customer);
        account.setIBAN(request.getIBAN());
        customer.setAccounts(List.of(account));
        accountRepository.save(account);
        return ResponseEntity.status(HttpStatus.OK).body("Checking account is created");
    }
    @Override
    public ResponseEntity<Object> create(CreateDepositAccountRequest depositAccountRequest) {
        Customer customer = customerRepository.findById(depositAccountRequest.getCustomerId());
        Account account = new Account();
        account.setCurrencyType(depositAccountRequest.getCurrencyType());
        account.setCustomer(customer);
        customer.setAccounts(List.of(account));
        accountRepository.save(account);
        return ResponseEntity.status(HttpStatus.OK).body("Deposit account is created");
    }
    @Override
    public ResponseEntity<Object> deleteAccount(long accountNumber) {

        Account account = accountRepository.findByAccountNumber(accountNumber);
        if (account == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Account is not found");
        }
        return isDeletable(account);
    }

    ResponseEntity<Object> isDeletable(Account account) {
        if (account.getAccountNumber() == 0L) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Account number is not found");
        }
        if (account.getBalance()!=0F) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Account have a balance.Delete operation is not allowed.");
        }
        accountRepository.delete(account);
        return ResponseEntity.status(HttpStatus.OK).body("Account is deleted.");
    }

    @Override
    public Page<Account> listPageAccount(Pageable pageable) {

        return accountRepository.findAll(pageable);
    }

}





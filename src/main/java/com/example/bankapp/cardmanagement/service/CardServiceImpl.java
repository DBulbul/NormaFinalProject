package com.example.bankapp.cardmanagement.service;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.entities.CheckingAccount;
import com.example.bankapp.accountmanagement.repositories.AccountRepository;
import com.example.bankapp.accountmanagement.repositories.CheckingAccountRepository;
import com.example.bankapp.cardmanagement.entities.CreditCard;
import com.example.bankapp.cardmanagement.entities.DebitCard;
import com.example.bankapp.cardmanagement.repositories.CreditCardRepository;
import com.example.bankapp.cardmanagement.repositories.DebitCardRepository;
import com.example.bankapp.cardmanagement.requests.CreateCreditCardRequest;
import com.example.bankapp.cardmanagement.requests.CreateDebitCardRequest;
import com.example.bankapp.customermanagement.entities.Customer;
import com.example.bankapp.customermanagement.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CardServiceImpl implements CardService {
    private final AccountRepository accountRepository;
    private final CreditCardRepository creditCardRepository;
    private final CustomerRepository customerRepository;
    private final CheckingAccountRepository checkingAccountRepository;
    private final DebitCardRepository debitCardRepository;

    @Override
    public ResponseEntity<Object> createCreditCard(CreditCard creditCard, CreateCreditCardRequest request) {
        Customer customer=customerRepository.findById(request.getCustomer_id());


        CreditCard creditCard1=new CreditCard();
        creditCard1.setCardLimit(request.getCardLimit());
        creditCard1.setActive(true);
        creditCard1.setCustomer(customer);
        customer.setCreditCards(List.of(creditCard));

        creditCardRepository.save(creditCard1);


        return ResponseEntity.status(HttpStatus.OK).body("Credit Card is created successfully");

    }

    @Override
    public ResponseEntity<Object> createDebitCard(DebitCard debitCard, CreateDebitCardRequest request) {
        CheckingAccount checkingAccount = checkingAccountRepository.findByAccountNumber(request.getAccountNumber());

        DebitCard debitCard1=new DebitCard();
        debitCard1.setActive(true);

        checkingAccount.setAccountNumber(request.getAccountNumber());
        checkingAccount.setDebitCards(List.of(debitCard));
        debitCardRepository.save(debitCard1);

        return ResponseEntity.status(HttpStatus.OK).body("Debit Card is created successfully");
    }

}

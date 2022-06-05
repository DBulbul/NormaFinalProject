package com.example.bankapp.transactionmanagement.service;
import com.example.bankapp.accountmanagement.dto.CheckingAccountDTO;
import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.repositories.AccountRepository;
import com.example.bankapp.transactionmanagement.dto.TransactionFromAccountDTO;
import com.example.bankapp.transactionmanagement.entities.TransactionFromAccount;
import com.example.bankapp.transactionmanagement.repositories.TransactionFromAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionFromAccountServiceImpl implements TransactionFromAccountService {

    private final TransactionFromAccountRepository transactionFromAccountRepository;
    private final AccountRepository accountRepository;
    @Override
    public <T extends Account> List<TransactionFromAccount>moneyTransferBetweenAccounts(String sendingIBAN, String receivingIBAN, double amount) {

        return null;

    }
}

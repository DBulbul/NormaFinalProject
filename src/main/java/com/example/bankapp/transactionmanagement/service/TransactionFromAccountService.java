package com.example.bankapp.transactionmanagement.service;

import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.transactionmanagement.entities.TransactionFromAccount;

import java.util.List;

public interface TransactionFromAccountService {

 public <T extends Account> List<TransactionFromAccount>moneyTransferBetweenAccounts(String depositAccountIBAN, String checkingAccountIBAN, double amount);


}

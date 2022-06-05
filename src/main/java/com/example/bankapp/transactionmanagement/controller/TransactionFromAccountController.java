package com.example.bankapp.transactionmanagement.controller;

import com.example.bankapp.accountmanagement.dto.CheckingAccountDTO;
import com.example.bankapp.accountmanagement.dto.DepositAccountDTO;
import com.example.bankapp.transactionmanagement.dto.TransactionFromAccountDTO;
import com.example.bankapp.transactionmanagement.entities.TransactionFromAccount;
import com.example.bankapp.transactionmanagement.service.TransactionFromAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.stream.Collectors;
@RequiredArgsConstructor
@RestController
@RequestMapping(path="/api/transaction-account")
public class TransactionFromAccountController {

    private final TransactionFromAccountService transactionFromAccountService;


    @PutMapping("/{sendingIBAN}/betweenAccountMoneyTransfer/{receivingIBAN}")
    @ResponseStatus(HttpStatus.CREATED)
    public TransactionFromAccountDTO getBetweenAccountTransferMoney(@PathVariable("sendingIBAN") String  sendingIBAN,
                                                             @PathVariable("receivingIBAN") String receivingIBAN,
                                                             @Min(value = 0) @RequestParam("transfer") double amount) {
        return (TransactionFromAccountDTO) transactionFromAccountService.moneyTransferBetweenAccounts(sendingIBAN, receivingIBAN, amount);
    }
}

/*
    @GetMapping(value = "/all-transactions", params = {"page", "size"})
    @ResponseStatus(HttpStatus.OK)
    public List<TransactionFromAccountDTO> getAllTransactions(@Min(value = 0) @RequestParam("page") int page, @Min(value = 1) @RequestParam("size") int size) {
        try {
            return transactionFromAccountService.listPageTransactions(PageRequest.of(page, size)).stream()
                    .map(TransactionFromAccount::toTransactionFromAccountDTO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The account has no transactions");
        }
    }
}

}

*/



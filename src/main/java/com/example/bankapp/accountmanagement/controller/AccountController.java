package com.example.bankapp.accountmanagement.controller;


import com.example.bankapp.accountmanagement.entities.Account;
import com.example.bankapp.accountmanagement.exception.AccountDeletionException;
import com.example.bankapp.accountmanagement.requests.CreateCheckingAccountRequest;
import com.example.bankapp.accountmanagement.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

    @RestController
    @RequiredArgsConstructor
    @RequestMapping(path="/api/accounts")
    public class AccountController{

        private final AccountService accountService;

        @PostMapping("/create")
        public ResponseEntity<Object> create(@RequestBody CreateCheckingAccountRequest request) throws IOException{
            return accountService.create(request);
        }

        @GetMapping(params = {"page","size"})
        @ResponseStatus(HttpStatus.OK)
        public List<Long> list(@RequestParam("page") int page, @RequestParam("size") int size){
            try {
                return accountService.listPageAccount(PageRequest.of(page, size)).stream()
                        .map(Account::getAccountNumber)
                        .collect(Collectors.toList());
            }catch (Exception e){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The customer has not any Account");
            }

        }
        @DeleteMapping("/delete/{accountNumber}")
        private ResponseEntity<Object> deleteAccount(@PathVariable long accountNumber)throws IOException {

            return accountService.deleteAccount(accountNumber);

        }

}

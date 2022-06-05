package com.example.bankapp.accountmanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CheckingAccountDTO {
    private long accountNumber;
    private String checkingAccountIBAN;
    private float balance;
    private boolean isActive;
    private boolean isBlocked;
}

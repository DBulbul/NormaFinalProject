package com.example.bankapp.cardmanagement.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDebitCardRequest {
  private long accountNumber;
}

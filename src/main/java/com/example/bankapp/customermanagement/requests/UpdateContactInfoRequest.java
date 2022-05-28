package com.example.bankapp.customermanagement.requests;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class UpdateContactInfoRequest {

    private String primaryEmail;

    private String secondaryEmail;

    private String primaryPhoneNumber;

    private String secondaryPhoneNumber;
}

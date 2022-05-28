package com.example.bankapp.customermanagement.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter
@Setter
public class ContactInfoDTO {


    @Column(nullable=false)
    private String primaryEmail;

    private String secondaryEmail;

    @Column(nullable=false)
    private String primaryPhoneNumber;

    private String secondaryPhoneNumber;
}

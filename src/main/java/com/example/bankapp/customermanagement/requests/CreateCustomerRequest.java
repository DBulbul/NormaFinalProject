package com.example.bankapp.customermanagement.requests;

import com.example.bankapp.customermanagement.dto.AddressDTO;
import com.example.bankapp.customermanagement.dto.ContactInfoDTO;
import com.example.bankapp.customermanagement.enums.CompanyType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateCustomerRequest {

    private long identityNumber;
    private String name;
    private String lastname;
    private CompanyType gender;
    private Date birthdate;
    private ContactInfoDTO contactInfo;
    private AddressDTO address;
    private float balance;



}

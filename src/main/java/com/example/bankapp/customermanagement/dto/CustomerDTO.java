package com.example.bankapp.customermanagement.dto;

import com.example.bankapp.customermanagement.enums.CompanyType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CustomerDTO {

    private Long id;

    private String name;

    private String lastName;

    private Long identityNumber;

    private Long taxIdentificationNumber;

    private Date birthdate;

    private CompanyType companyType;

}

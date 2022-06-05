package com.example.bankapp.customermanagement.requests;

import com.example.bankapp.customermanagement.dto.AddressDTO;
import com.example.bankapp.customermanagement.dto.ContactInfoDTO;
import com.example.bankapp.customermanagement.enums.CompanyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class CreateCustomerRequest {


    @NotNull(message="Please enter name the column cannot be null")
    private String name;


    @NotNull(message="Please enter lastname,last name cannot be null")
    private String lastname;
    @NotNull(message="Identity Number cannot be null")
    @Size(message="Identity must to have 11 digits",min=11,max=11)
    private long identityNumber;
    private CompanyType companyType;
    private Date birthdate;
    @Valid
    private ContactInfoDTO contactInfo;
    @Valid
    private AddressDTO address;






}

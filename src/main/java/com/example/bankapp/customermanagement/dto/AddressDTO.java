package com.example.bankapp.customermanagement.dto;

import com.example.bankapp.customermanagement.enums.AddressType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Getter
@Setter

public class AddressDTO {
    private String city;
    private String country;
    private String street;
    private String detailedAddress;

    @Enumerated(EnumType.ORDINAL)
    private AddressType addressType;


}

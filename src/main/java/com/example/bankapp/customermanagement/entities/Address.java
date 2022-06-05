package com.example.bankapp.customermanagement.entities;

import com.example.bankapp.customermanagement.enums.AddressType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String country;
    private String street;
    private String detailedAddress;

    @Enumerated(EnumType.ORDINAL)
    private AddressType addressType;

    @OneToOne
    private Customer customer;
}

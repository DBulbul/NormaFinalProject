package com.example.bankapp.customermanagement.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    @Email(message="Invalid email format")
    private String primaryEmail;

    private String secondaryEmail;

    @Column(nullable = false)
    @Pattern(regexp="^\\d{10}$",message="Phone number has ten digits and nothing else")
    private String primaryPhoneNumber;
    private String secondaryPhoneNumber;

    @OneToOne
    private Customer customer;
}

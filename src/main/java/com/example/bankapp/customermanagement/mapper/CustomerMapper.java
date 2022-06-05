package com.example.bankapp.customermanagement.mapper;

import com.example.bankapp.customermanagement.dto.CustomerDTO;
import com.example.bankapp.customermanagement.entities.Customer;

public interface CustomerMapper {
    CustomerDTO toDto(Customer customer);

}

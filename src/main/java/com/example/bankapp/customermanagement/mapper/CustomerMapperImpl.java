package com.example.bankapp.customermanagement.mapper;

import com.example.bankapp.customermanagement.dto.CustomerDTO;
import com.example.bankapp.customermanagement.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapperImpl implements CustomerMapper {
    @Override
    public CustomerDTO toDto(Customer customer) {
        CustomerDTO dto=new CustomerDTO();
        dto.setBirthdate(customer.getBirthdate());
        dto.setCompanyType(customer.getCompanyType());
        dto.setLastName(customer.getLastName());
        dto.setName(customer.getName());
        dto.setIdentityNumber(customer.getIdentityNumber());
        dto.setId(customer.getId());
        return dto;
    }
}

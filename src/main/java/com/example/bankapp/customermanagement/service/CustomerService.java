package com.example.bankapp.customermanagement.service;

import com.example.bankapp.customermanagement.dto.CustomerDTO;
import com.example.bankapp.customermanagement.exception.CustomerCannotBeDeleted;
import com.example.bankapp.customermanagement.exception.GeneralException;
import com.example.bankapp.customermanagement.requests.CreateCustomerRequest;
import com.example.bankapp.customermanagement.requests.UpdateAddressRequest;
import com.example.bankapp.customermanagement.requests.UpdateContactInfoRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    ResponseEntity<Object> create(CreateCustomerRequest request) throws GeneralException;
    List<CustomerDTO> findAll();
    ResponseEntity<Object> deleteCustomer(long id) throws CustomerCannotBeDeleted;
    ResponseEntity<Object> updateAddress(UpdateAddressRequest address, long id);
    ResponseEntity<Object> updateContactInfo(UpdateContactInfoRequest contactInfo, long id);
}

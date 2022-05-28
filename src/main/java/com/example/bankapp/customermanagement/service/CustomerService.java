package com.example.bankapp.customermanagement.service;

import com.example.bankapp.customermanagement.entities.Customer;
import com.example.bankapp.customermanagement.requests.CreateCustomerRequest;
import com.example.bankapp.customermanagement.requests.UpdateAddressRequest;
import com.example.bankapp.customermanagement.requests.UpdateContactInfoRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    ResponseEntity<Object> create(CreateCustomerRequest request) throws Exception;
    List<Customer> findAll();
    ResponseEntity<Object> deleteCustomer(long id);
    ResponseEntity<Object> updateAddress(UpdateAddressRequest address, long id);
    ResponseEntity<Object> updateContactInfo(UpdateContactInfoRequest contactInfo, long id);
}

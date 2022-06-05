package com.example.bankapp.customermanagement.controller;

import com.example.bankapp.customermanagement.dto.CustomerDTO;
import com.example.bankapp.customermanagement.exception.CustomerCannotBeDeleted;
import com.example.bankapp.customermanagement.exception.GeneralException;
import com.example.bankapp.customermanagement.requests.CreateCustomerRequest;
import com.example.bankapp.customermanagement.requests.UpdateAddressRequest;
import com.example.bankapp.customermanagement.requests.UpdateContactInfoRequest;
import com.example.bankapp.customermanagement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/api/customers")
@Validated
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody @Valid CreateCustomerRequest request) throws GeneralException {
        return customerService.create(request);
    }
    @GetMapping("/all-customers")
    public List<CustomerDTO> getAllCustomers(){

        return customerService.findAll();
    }
    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Object> deleteById(@PathVariable long id) throws CustomerCannotBeDeleted {
        return customerService.deleteCustomer(id);
    }

    @PutMapping("/update/contactinfo/{id}")
    private ResponseEntity<Object> updatePhoneNumber(@RequestBody UpdateContactInfoRequest contactInfo, @PathVariable long id){
        return customerService.updateContactInfo(contactInfo,id);
    }
    @PutMapping("/update/address/{id}")
    private ResponseEntity<Object> updateAddress(@RequestBody UpdateAddressRequest address, @PathVariable long id){
        return customerService.updateAddress(address,id);
    }
}

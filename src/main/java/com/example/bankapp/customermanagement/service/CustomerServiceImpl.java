package com.example.bankapp.customermanagement.service;

import com.example.bankapp.customermanagement.entities.Address;
import com.example.bankapp.customermanagement.entities.ContactInfo;
import com.example.bankapp.customermanagement.entities.Customer;
import com.example.bankapp.customermanagement.repositories.CustomerRepository;
import com.example.bankapp.customermanagement.requests.CreateCustomerRequest;
import com.example.bankapp.customermanagement.requests.UpdateAddressRequest;
import com.example.bankapp.customermanagement.requests.UpdateContactInfoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public ResponseEntity<Object> create(CreateCustomerRequest request) throws Exception {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setLastName((request.getLastname()));
        customer.setIdentityNumber(request.getIdentityNumber());
        customer.setBalance(request.getBalance());

        Address address = new Address();
        address.setAddressType(request.getAddress().getAddressType());
        address.setCity(request.getAddress().getCity());
        address.setCountry(request.getAddress().getCountry());

        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setPrimaryEmail((request.getContactInfo().getPrimaryEmail()));
        contactInfo.setSecondaryEmail(request.getContactInfo().getSecondaryEmail());
        contactInfo.setPrimaryPhoneNumber(request.getContactInfo().getPrimaryPhoneNumber());
        contactInfo.setSecondaryPhoneNumber(request.getContactInfo().getSecondaryPhoneNumber());


        address.setCustomer(customer);
        customer.setAddress(address);
        contactInfo.setCustomer(customer);
        customer.setContactInfo(contactInfo);

        customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.OK).body("Customer is created successfully");
    }

    @Override
    public List<Customer> findAll() {

        return customerRepository.findAll();
    }
    @Override
    public ResponseEntity<Object> updateAddress (UpdateAddressRequest address,long id){
        Customer customer = customerRepository.findById(id);

        if(customer==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer is not found");
        }

        Address updated_address = customer.getAddress();

        updated_address.setCountry(address.getCountry());
        updated_address.setStreet(address.getStreet());
        updated_address.setCity(address.getCity());
        updated_address.setDetailedAddress(address.getDetailedAddress());

        customer.setAddress(updated_address);
        customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.OK).body("Address is updated");
    }


    @Override
    public ResponseEntity<Object> updateContactInfo (UpdateContactInfoRequest contactInfoRequest,long id){
        Customer customer = customerRepository.findById(id);

        if(customer==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer is not found");
        }

    ContactInfo updated_contactInfo = customer.getContactInfo();

        updated_contactInfo.setPrimaryPhoneNumber(contactInfoRequest.getPrimaryPhoneNumber());
        updated_contactInfo.setPrimaryEmail(contactInfoRequest.getPrimaryEmail());
        updated_contactInfo.setSecondaryEmail(contactInfoRequest.getSecondaryEmail());
        updated_contactInfo.setSecondaryPhoneNumber(contactInfoRequest.getSecondaryPhoneNumber());

        customer.setContactInfo(updated_contactInfo);
        customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.OK).body("Contact Information is updated");
    }

    @Override
    public ResponseEntity<Object> deleteCustomer(long id) {
        Customer customer = customerRepository.findById(id);

        if (customer == null) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Customer is not found");
        }
        return isDeletable(customer);
    }

    ResponseEntity<Object> isDeletable(Customer customer) {

        if (customer.getBalance()!=0) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Customer have money on account.Deletion is not allowed");
        }

        for (int i = 0; i < customer.getCreditCards().size(); i++) {

            double debt = customer.getCreditCards().get(i).getCardLimit() - customer.getCreditCards().get(i).getCardLimit();

            if (debt != 0) {
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Customer have a credit debt.Deletion is not allowed");
            }
        }
        customerRepository.delete(customer);
        return ResponseEntity.status(HttpStatus.OK).body("Customer is deleted succesfully");
    }
    }



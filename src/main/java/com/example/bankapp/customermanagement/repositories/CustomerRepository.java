package com.example.bankapp.customermanagement.repositories;

import com.example.bankapp.customermanagement.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findById(long id);
}

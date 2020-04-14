package com.kamal.springframework.kamalbrewery.services;

import com.kamal.springframework.kamalbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveCustomer(CustomerDto customerDto);
    void updateCustomerById(UUID customerId,CustomerDto customerDto);
    void deleteCustomerById(UUID customerId);
}

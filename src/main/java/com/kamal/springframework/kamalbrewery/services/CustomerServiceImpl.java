package com.kamal.springframework.kamalbrewery.services;

import com.kamal.springframework.kamalbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Kamaldwip Choudhury")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
       return CustomerDto.builder()
               .id(UUID.randomUUID())
               .build();
    }

    @Override
    public CustomerDto updateCustomerById(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer.....");
        return null;
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting customer.....");
    }


}

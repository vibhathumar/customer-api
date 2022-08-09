package com.customer.customerapi.service;

import com.customer.customerapi.dto.Customer;
import com.customer.customerapi.entity.CustomerEntity;
import com.customer.customerapi.mapper.CustomerMapper;
import com.customer.customerapi.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public CustomerEntity saveCustomer(Customer customer) {
        CustomerEntity customerEntity = customerRepository.save(customerMapper.toEntity(customer));
        log.info("Added"+customerEntity);
        return customerEntity;

    }

    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<CustomerEntity> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}

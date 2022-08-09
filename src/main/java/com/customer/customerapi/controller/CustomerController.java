package com.customer.customerapi.controller;

import com.customer.customerapi.dto.Customer;
import com.customer.customerapi.entity.CustomerEntity;
import com.customer.customerapi.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/customer")
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/saveCustomer")
    public CustomerEntity saveCustomer(@RequestBody Customer customer){
       return customerService.saveCustomer(customer);
    }

    @GetMapping("/getAllCustomer")
    public List<CustomerEntity> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/getCustomerById/{id}")
    public Optional<CustomerEntity> getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("deleteCustomerById/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        customerService.deleteCustomerById(id);
    }
}

package com.customer.customerapi.mapper;

import com.customer.customerapi.dto.Customer;
import com.customer.customerapi.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public Customer toDto(CustomerEntity customerEntity){
        Customer customer=new Customer();
        customer.setFirstName(customerEntity.getFirstName());
        customer.setLastName(customerEntity.getLastName());
        customer.setAge(customerEntity.getAge());

        return customer;
    }

    public CustomerEntity toEntity(Customer customer){
        CustomerEntity customerEntity=new CustomerEntity();


        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setAge(customer.getAge());

        return customerEntity;
    }
}

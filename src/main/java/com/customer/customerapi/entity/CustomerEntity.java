package com.customer.customerapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customerInfo")
@Data

public class CustomerEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

}

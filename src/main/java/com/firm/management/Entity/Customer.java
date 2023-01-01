package com.firm.management.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Customer")
public class Customer {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

}
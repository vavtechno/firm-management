package com.firm.management.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="department")
    private String department;

}
package com.firm.management.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Teachers")
public class Teachers {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="phone")
    private int phone;

    @Column(name="branch")
    private String branch;

}

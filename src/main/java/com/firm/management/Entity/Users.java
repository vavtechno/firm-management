package com.firm.management.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Users")
public class Users {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="age")
    private String age;

    @Column(name="title")
    private String title;

}

package com.firm.management.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Orders")
public class Orders {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="brand")
    private String brand;

    @Column(name="type")
    private String type;

    @Column(name="stock")
    private boolean stock;

    @Column(name="Customer")
    private String customer;

}

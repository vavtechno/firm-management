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

    @Column(name="customer")
    private int customer;

    @Column(name="amount")
    private int amount;
    @Column(name="quantity")
    private int quantity;
    @Column(name="stok_status")
    private boolean stok_status;

    @Column(name="color")
    private String color;
}
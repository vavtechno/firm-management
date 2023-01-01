package com.firm.management.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ProductDetail")
public class ProductDetail {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="size")
    private String size;

    @Column(name="type")
    private String type;

    @Column(name="brand")
    private String brand;

}

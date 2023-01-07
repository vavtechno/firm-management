package com.firm.management.Entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="academic_program")
public class AcademicProgram {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="lessons")
    private String lessons;

    @Column(name="classes")
    private String classes;

    @Column(name="days")
    private String days;

    @Column(name="hours")
    private int hours;

}









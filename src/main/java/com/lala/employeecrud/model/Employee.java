package com.lala.employeecrud.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int phone;
    private String department;
}

package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    int id;
    String name;
    public String toString() {
        return "id = " + id + " name = " + name;
    }
}

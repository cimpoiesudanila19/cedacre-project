package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
//    @Indexed(unique=true)
    private String id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

//    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
//        this.name = name;
//        this.email = email;
//        this.jobTitle = jobTitle;
//        this.phone = phone;
//        this.imageUrl = imageUrl;
//        this.employeeCode = employeeCode;
//    }
}

package com.Aman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Job extends baseclass implements Serializable {

    private static final long serialVersionUID = 46835149772133975L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="Eligibility")
    private String eligibility;

    @Column(name="Location")
    private String location;


    @Column(name="Description")
    private String description;

    @Column(name="Designation")
    private String designation;

    @ManyToOne
    @JoinColumn(name = "sanjeev",nullable = false)
    private Category category;

    @Column(name = "Skills_Required")
    private String skills;

    @Column(name = "Salary_Type")
    private String salaryType;

    @Column(name = "Salary")
    private String salary;

    @Column(name = "Experience_Required")
    private String experience;

    @Column(name = "Sort_Order")
    private int sortOrder;

    @Column(name = "Status")
    private boolean status;
}

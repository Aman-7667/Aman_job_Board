package com.Aman.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class jobapplicationDto {
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "job_id",nullable = false)
//    private Job job;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;


    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @Column(name = "Educational_Qualification")
    private String qualification;

    @Column(name = "Job_Experience")
    private String experience;

    @Column(name = "Job_Position")
    private String position;

    @Column(name="Previous_Company")
    private String company;

    @Lob
    @Column(name = "Resume")
    private byte[] resume;

    @Column(name = "FileName")
    private String fileName;
}

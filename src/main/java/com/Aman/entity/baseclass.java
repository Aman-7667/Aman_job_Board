package com.Aman.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass @Getter @Setter
public class baseclass {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = true)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column (updatable = true)
    private String createdBye;

}

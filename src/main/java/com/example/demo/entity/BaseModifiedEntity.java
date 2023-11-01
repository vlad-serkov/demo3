package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseModifiedEntity extends BaseEntity {
    @Column(name = "created")
    @CreatedDate
    private LocalDate created;

    @Column(name = "modified")
    @LastModifiedDate
    private LocalDate modified;
}

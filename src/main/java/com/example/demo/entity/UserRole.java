package com.example.demo.entity;

import com.example.demo.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "user_role")
@AllArgsConstructor
public class UserRole extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    public UserRole() {

    }
}
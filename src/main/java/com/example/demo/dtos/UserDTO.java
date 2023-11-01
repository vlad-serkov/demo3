package com.example.demo.dtos;

import com.example.demo.entity.UserRole;
import com.example.demo.enums.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class UserDTO {
    private UUID id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private UserRole role;
    private String imageUrl;


    public UserDTO(String username, String password, String firstName, String lastName, boolean isActive, UserRole role, String imageUrl) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.role = role;
        this.imageUrl = imageUrl;

    }
}
package com.example.demo.service;

import com.example.demo.dtos.OfferDTO;
import com.example.demo.dtos.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.enums.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    Optional<UserDTO> findById(UUID id);

    List<UserDTO> getAll();

    User save(UserDTO userDto1);

    void deleteById(UUID id);
}

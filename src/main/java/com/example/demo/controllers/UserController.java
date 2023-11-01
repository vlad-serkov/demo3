package com.example.demo.controllers;

import com.example.demo.dtos.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public Optional<UserDTO> getUserById(@PathVariable UUID id) {
        return userService.findById(id);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public User saveUser(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }
}

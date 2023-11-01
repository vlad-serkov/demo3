package com.example.demo.service.impl;

import com.example.demo.dtos.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.repo.UserRoleRepo;
import com.example.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final ModelMapper modelMapper = new ModelMapper();
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Optional<UserDTO> findById(UUID id) {
        UserDTO userDTO = modelMapper.map(userRepo.findById(id).get(), UserDTO.class);
        return Optional.of(userDTO);
    }

    @Override
    public List<UserDTO> getAll() {
        return userRepo.findAll()
                .stream()
                .map(obj -> modelMapper.map(obj, UserDTO.class))
                .toList();
    }

    @Override
    public User save(UserDTO userDto1) {
        User user = modelMapper.map(userDto1, User.class);
        return userRepo.save(user);
    }

    @Override
    public void deleteById(UUID id) {
        userRepo.deleteById(id);
    }
}

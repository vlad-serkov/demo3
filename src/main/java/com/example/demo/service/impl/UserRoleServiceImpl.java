package com.example.demo.service.impl;

import com.example.demo.entity.UserRole;
import com.example.demo.repo.UserRoleRepo;
import com.example.demo.service.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepo userRoleRepository;

    @Override
    public void saveUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
}

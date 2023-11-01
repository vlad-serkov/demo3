package com.example.demo.service;

import com.example.demo.dtos.BrandDTO;
import com.example.demo.entity.Brand;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BrandService {
    Brand saveBrand(BrandDTO brand);

    Optional<Brand> findById(UUID id);

    List<Brand> findAll();

    void deleteById(UUID id);
}

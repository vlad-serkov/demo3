package com.example.demo.service.impl;

import com.example.demo.dtos.BrandDTO;
import com.example.demo.entity.Brand;
import com.example.demo.repo.BrandRepo;
import com.example.demo.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final ModelMapper modelMapper = new ModelMapper();
    private final BrandRepo brandRepository;

    @Override
    public Brand saveBrand(BrandDTO brandDTO) {
        Brand brand = modelMapper.map(brandDTO, Brand.class);
        return brandRepository.save(brand);
    }

    @Override
    public Optional<Brand> findById(UUID id) {
        return brandRepository.findById(id);
    }

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }
    @Override
    public void deleteById(UUID id) {
        brandRepository.deleteById(id);
    }
}

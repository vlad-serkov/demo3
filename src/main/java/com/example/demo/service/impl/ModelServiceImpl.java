package com.example.demo.service.impl;

import com.example.demo.dtos.ModelDTO;
import com.example.demo.entity.Model;
import com.example.demo.repo.BrandRepo;
import com.example.demo.repo.ModelRepo;
import com.example.demo.repo.OfferRepo;
import com.example.demo.service.ModelService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ModelServiceImpl implements ModelService {
    private final ModelMapper modelMapper;

    private final BrandRepo brandRepository;

    private final ModelRepo modelRepository;

    private final OfferRepo offerRepository;

    public ModelServiceImpl(BrandRepo brandRepository, ModelRepo modelRepository, OfferRepo offerRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
        this.offerRepository = offerRepository;
        modelMapper = new ModelMapper();
    }

    @Override
    public Model saveModel(ModelDTO modelDTO) {
        Model model = modelMapper.map(modelDTO, Model.class);

        return modelRepository.save(model);
    }

    @Override
    public void deleteById(UUID id) {
        offerRepository.deleteById(id);
    }

    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    @Override
    public Optional<Model> findById(UUID id) {
        return modelRepository.findById(id);
    }
}

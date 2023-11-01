package com.example.demo.service;


import com.example.demo.dtos.BrandDTO;

import com.example.demo.dtos.ModelDTO;
import com.example.demo.dtos.OfferDTO;
import com.example.demo.dtos.ReportDTO;
import com.example.demo.entity.Brand;
import com.example.demo.entity.Model;
import com.example.demo.entity.Offer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ModelService {


    Model saveModel(ModelDTO modelDTO);

    void deleteById(UUID id);

    List<Model> findAll();

    Optional<Model> findById(UUID id);
}

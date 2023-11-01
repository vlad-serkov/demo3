package com.example.demo.service;

import com.example.demo.dtos.OfferDTO;
import com.example.demo.entity.Offer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OfferService {
    Offer saveOffer(OfferDTO offerDto1);

    List<Offer> findAll();

    void deleteById(UUID id);

    Optional<Offer> findById(UUID id);
}

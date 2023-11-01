package com.example.demo.service.impl;

import com.example.demo.dtos.OfferDTO;
import com.example.demo.entity.Offer;
import com.example.demo.repo.OfferRepo;
import com.example.demo.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {
    private final ModelMapper modelMapper = new ModelMapper();
    private final OfferRepo offerRepository;
    @Override
    public Offer saveOffer(OfferDTO offerDto1) {
        Offer offer = modelMapper.map(offerDto1, Offer.class);

        return offerRepository.save(offer);
    }
    @Override
    public List<Offer> findAll() {
        return offerRepository.findAll();
    }
    @Override
    public void deleteById(UUID id) {
        offerRepository.deleteById(id);
    }
    @Override
    public Optional<Offer> findById(UUID id) {
        return offerRepository.findById(id);
    }
}

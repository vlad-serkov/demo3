package com.example.demo.dtos;

import com.example.demo.entity.Model;
import com.example.demo.entity.User;
import com.example.demo.enums.Engine;
import com.example.demo.enums.Transmission;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
@Data
public class OfferDTO {
    private UUID id;
    private String description;
    private Engine engine;
    private String imageUrl;
    private int mileage;
    private Double price;
    private Transmission transmission;
    private int year;

    private Model model;
    private User seller;

    public OfferDTO(String description, Engine engine, String imageUrl, int mileage, Double price, Transmission transmission, int year,  Model model, User seller) {
        this.description = description;
        this.engine = engine;
        this.imageUrl = imageUrl;
        this.mileage = mileage;
        this.price = price;
        this.transmission = transmission;
        this.year = year;
        this.model = model;
        this.seller = seller;
    }
}
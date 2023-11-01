package com.example.demo.dtos;

import com.example.demo.entity.Brand;
import com.example.demo.enums.Category;
import lombok.Data;

import java.util.UUID;
@Data
public class ModelDTO {
    private UUID id;
    private String name;
    private Category category;
    private String imageUrl;
    private int startYear;
    private int endYear;
    private Brand brand;

    public ModelDTO(String name, Category category, String imageUrl, int startYear, int endYear,  Brand brand) {
        this.name = name;
        this.category = category;
        this.imageUrl = imageUrl;
        this.startYear = startYear;
        this.endYear = endYear;
        this.brand = brand;
    }
}
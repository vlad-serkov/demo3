package com.example.demo.dtos;


import java.time.LocalDate;
import java.util.UUID;

public record BrandDTO( UUID id,
         String name,
         LocalDate created,
         LocalDate modified
) {
}

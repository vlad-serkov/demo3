package com.example.demo.controllers;

import com.example.demo.dtos.BrandDTO;
import com.example.demo.dtos.ModelDTO;
import com.example.demo.dtos.OfferDTO;
import com.example.demo.dtos.ReportDTO;
import com.example.demo.entity.Brand;
import com.example.demo.entity.Model;
import com.example.demo.entity.Offer;
import com.example.demo.service.BrandService;
import com.example.demo.service.ModelService;
import com.example.demo.service.OfferService;
import com.example.demo.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/models")
@RequiredArgsConstructor
public class ModelController {

    private final ModelService modelService;
    private final BrandService brandService;
    private final OfferService offerService;
    private final ReportService reportService;

    @PostMapping("/brand")
    public Brand saveBrand(@RequestBody BrandDTO brandDTO) {
        return brandService.saveBrand(brandDTO);
    }

    @PostMapping("/model")
    public Model saveModel(@RequestBody ModelDTO modelDTO) {
        return modelService.saveModel(modelDTO);
    }

    @PostMapping("/offer")
    public Offer saveOffer(@RequestBody OfferDTO offerDTO) {
        return offerService.saveOffer(offerDTO);
    }

    @GetMapping("/report")
    public ReportDTO getReportByModelName(@RequestParam String modelName) {
        return reportService.getReportByModelName(modelName);
    }
}

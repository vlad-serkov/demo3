package com.example.demo.service.impl;

import com.example.demo.dtos.ReportDTO;
import com.example.demo.entity.Offer;
import com.example.demo.service.OfferService;
import com.example.demo.service.ReportService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReportServiceImpl implements ReportService {
    private final OfferService offerService;

    @Override
    public ReportDTO getReportByModelName(String modelName) {
        List<Offer> all = offerService.findAll();
        List<Double> doubles = all.stream()
                .filter(offer -> modelName.equals(offer.getModel().getName()))
                .map(Offer::getPrice)
                .toList();
        Double sum = doubles.stream()
                .reduce(0.0, (a, b) -> a + b);
        Long count = (long) doubles.size();

        return new ReportDTO(sum,count,modelName);
    }
}

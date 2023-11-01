package com.example.demo.service;

import com.example.demo.dtos.ReportDTO;

public interface ReportService {
    ReportDTO getReportByModelName(String modelName);

}

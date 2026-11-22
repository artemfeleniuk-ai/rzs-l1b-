package com.ua.vinylstore.service;

import com.ua.vinylstore.web.dto.VinylCardDto;
import com.ua.vinylstore.web.dto.VinylDetailDto;

import java.util.List;

public interface VinylRecordService {
    List<VinylCardDto> findAll();

    VinylDetailDto findById(Long id);
}

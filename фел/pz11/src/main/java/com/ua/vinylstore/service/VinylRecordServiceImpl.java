package com.ua.vinylstore.service;

import com.ua.vinylstore.domain.VinylRecord;
import com.ua.vinylstore.exception.VinylRecordNotFoundException;
import com.ua.vinylstore.repository.VinylRecordRepository;
import com.ua.vinylstore.service.mapper.VinylRecordMapper;
import com.ua.vinylstore.web.dto.VinylCardDto;
import com.ua.vinylstore.web.dto.VinylDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VinylRecordServiceImpl implements VinylRecordService {

    private final VinylRecordRepository repository;
    private final VinylRecordMapper mapper;

    public VinylRecordServiceImpl(VinylRecordRepository repository, VinylRecordMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<VinylCardDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::toCard)
                .toList();
    }

    @Override
    public VinylDetailDto findById(Long id) {
        VinylRecord record = repository.findById(id)
                .orElseThrow(() -> new VinylRecordNotFoundException(id));
        return mapper.toDetail(record);
    }
}

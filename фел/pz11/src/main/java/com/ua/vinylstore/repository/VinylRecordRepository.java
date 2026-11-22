package com.ua.vinylstore.repository;

import com.ua.vinylstore.domain.VinylRecord;

import java.util.List;
import java.util.Optional;

public interface VinylRecordRepository {
    List<VinylRecord> findAll();

    Optional<VinylRecord> findById(Long id);

    VinylRecord save(VinylRecord record);
}

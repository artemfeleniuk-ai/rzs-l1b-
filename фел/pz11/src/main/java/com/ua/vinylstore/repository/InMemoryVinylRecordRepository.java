package com.ua.vinylstore.repository;

import com.ua.vinylstore.domain.VinylRecord;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryVinylRecordRepository implements VinylRecordRepository {

    private final ConcurrentMap<Long, VinylRecord> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public List<VinylRecord> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<VinylRecord> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public VinylRecord save(VinylRecord record) {
        if (record.getId() == null) {
            record.setId(sequence.incrementAndGet());
        }
        storage.put(record.getId(), record);
        return record;
    }
}

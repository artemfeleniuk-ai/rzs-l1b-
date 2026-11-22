package com.ua.vinylstore.config;

import com.ua.vinylstore.domain.VinylRecord;
import com.ua.vinylstore.repository.VinylRecordRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class VinylRecordSeeder implements ApplicationRunner {

    private final VinylRecordRepository repository;

    public VinylRecordSeeder(VinylRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new VinylRecord(
                null, "Abbey Road", "The Beatles", "Apple Records",
                new BigDecimal("1899.00"), 1969, "Rock", 47,
                "/covers/abbey-road.jpg",
                "Один із найвідоміших альбомів групи, записаний на студії Abbey Road."
        ));
        repository.save(new VinylRecord(
                null, "Kind of Blue", "Miles Davis", "Columbia Records",
                new BigDecimal("1650.00"), 1959, "Jazz", 45,
                "/covers/kind-of-blue.jpg",
                "Впливовий альбом модального джазу з імпровізованими композиціями."
        ));
        repository.save(new VinylRecord(
                null, "The Dark Side of the Moon", "Pink Floyd", "Harvest Records",
                new BigDecimal("2199.00"), 1973, "Progressive Rock", 43,
                "/covers/dark-side.jpg",
                "Концептуальний альбом про час, гроші, божевілля та людські емоції."
        ));
        repository.save(new VinylRecord(
                null, "Blue Train", "John Coltrane", "Blue Note Records",
                new BigDecimal("1499.00"), 1957, "Jazz", 41,
                "/covers/blue-train.jpg",
                "Ранній шедевр Джона Колтрейна у стилі хард-боп."
        ));
        repository.save(new VinylRecord(
                null, "Rumours", "Fleetwood Mac", "Warner Records",
                new BigDecimal("1799.00"), 1977, "Rock", 40,
                "/covers/rumours.jpg",
                "Альбом, створений у період складних стосунків учасників гурту."
        ));
    }
}

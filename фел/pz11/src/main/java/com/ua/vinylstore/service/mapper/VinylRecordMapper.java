package com.ua.vinylstore.service.mapper;

import com.ua.vinylstore.domain.VinylRecord;
import com.ua.vinylstore.web.dto.VinylCardDto;
import com.ua.vinylstore.web.dto.VinylDetailDto;
import org.springframework.stereotype.Component;

@Component
public class VinylRecordMapper {

    public VinylCardDto toCard(VinylRecord record) {
        return new VinylCardDto(
                record.getId(),
                record.getAlbumTitle(),
                record.getArtist(),
                record.getReleaseYear(),
                record.getGenre(),
                record.getPrice(),
                record.getCoverUrl()
        );
    }

    public VinylDetailDto toDetail(VinylRecord record) {
        return new VinylDetailDto(
                record.getId(),
                record.getAlbumTitle(),
                record.getArtist(),
                record.getLabel(),
                record.getPrice(),
                record.getReleaseYear(),
                record.getGenre(),
                record.getDurationMinutes(),
                record.getCoverUrl(),
                record.getDescription()
        );
    }
}

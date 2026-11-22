package com.ua.vinylstore.web.dto;

import java.math.BigDecimal;

public record VinylDetailDto(Long id, String albumTitle, String artist, String label,
                             BigDecimal price, Integer releaseYear, String genre,
                             Integer durationMinutes, String coverUrl, String description) {
}

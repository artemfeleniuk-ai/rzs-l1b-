package com.ua.vinylstore.web.dto;

import java.math.BigDecimal;

public record VinylCardDto(Long id, String albumTitle, String artist,
                           Integer releaseYear, String genre, BigDecimal price,
                           String coverUrl) {
}

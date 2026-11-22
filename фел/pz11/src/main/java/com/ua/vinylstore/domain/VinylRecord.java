package com.ua.vinylstore.domain;

import java.math.BigDecimal;

public class VinylRecord {
    private Long id;
    private String albumTitle;
    private String artist;
    private String label;
    private BigDecimal price;
    private Integer releaseYear;
    private String genre;
    private Integer durationMinutes;
    private String coverUrl;
    private String description;

    public VinylRecord() {
    }

    public VinylRecord(Long id, String albumTitle, String artist, String label,
                       BigDecimal price, Integer releaseYear, String genre,
                       Integer durationMinutes, String coverUrl, String description) {
        this.id = id;
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.label = label;
        this.price = price;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
        this.coverUrl = coverUrl;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

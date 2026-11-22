package com.ua.vinylstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VinylRecordNotFoundException extends RuntimeException {

    public VinylRecordNotFoundException(Long id) {
        super("Платівку з id=" + id + " не знайдено");
    }
}

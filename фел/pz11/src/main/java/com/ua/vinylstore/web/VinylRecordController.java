package com.ua.vinylstore.web;

import com.ua.vinylstore.service.VinylRecordService;
import com.ua.vinylstore.web.dto.VinylCardDto;
import com.ua.vinylstore.web.dto.VinylDetailDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vinyl-records")
public class VinylRecordController {

    private final VinylRecordService vinylRecordService;

    public VinylRecordController(VinylRecordService vinylRecordService) {
        this.vinylRecordService = vinylRecordService;
    }

    @GetMapping
    public List<VinylCardDto> list() {
        return vinylRecordService.findAll();
    }

    @GetMapping("/{id}")
    public VinylDetailDto getOne(@PathVariable Long id) {
        return vinylRecordService.findById(id);
    }
}

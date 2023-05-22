package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dtos.DeliverRevisionDto;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverController {

    @Autowired
    private DeliverService service;

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDto dto) {
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }

}
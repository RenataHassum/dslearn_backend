package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dtos.NotificationDto;
import com.devsuperior.dslearnbds.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

    @Autowired
    private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDto>> notificationsForCurrentUser(Pageable pageable) {
        Page<NotificationDto> page = service.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}

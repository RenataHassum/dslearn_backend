package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dtos.NotificationDto;
import com.devsuperior.dslearnbds.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

    @Autowired
    private NotificationService service;

//    @GetMapping
//    public ResponseEntity<Page<NotificationDto>> notificationsForCurrentUser(Pageable pageable) {
//        Page<NotificationDto> page = service.notificationsForCurrentUser(pageable);
//        return ResponseEntity.ok().body(page);
//    }

    @GetMapping
    public ResponseEntity<Page<NotificationDto>> notificationsForCurrentUser(
            @RequestParam(name = "unreadOnly", defaultValue = "false") Boolean unreadOnly,
            Pageable pageable) {
        Page<NotificationDto> page = service.notificationsForCurrentUser(unreadOnly, pageable);
        return ResponseEntity.ok().body(page);
    }
}

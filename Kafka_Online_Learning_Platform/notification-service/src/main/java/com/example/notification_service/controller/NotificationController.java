package com.example.notification_service.controller;

import com.example.notification_service.model.Notification;
import com.example.notification_service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Notification> receiveNotification(@RequestBody Notification notification) {
        Notification saved = notificationService.createNotification(notification);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getAllNotifications() {
        return ResponseEntity.ok(notificationService.notificationRepository.findAll());
    }
}

package com.example.notification_service.controller;

import com.example.notification_service.model.Notification;
import com.example.notification_service.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController 
{

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) 
    {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) 
    {
        return ResponseEntity.ok(notificationService.createNotification(notification));
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getAllNotifications() 
    {
        return ResponseEntity.ok(notificationService.getAllNotifications());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) 
    {
        return notificationService.getNotificationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/request/{requestId}")
    public ResponseEntity<List<Notification>> getNotificationsByRequestId(@PathVariable Long requestId) 
    {
        return ResponseEntity.ok(notificationService.getNotificationsByRequestId(requestId));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Notification> updateStatus(@PathVariable Long id,
                                                     @RequestParam Notification.Status status) 
    {
        return ResponseEntity.ok(notificationService.updateNotificationStatus(id, status));
    }
}

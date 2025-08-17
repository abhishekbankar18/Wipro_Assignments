package com.example.notification_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "class_created", groupId = "notification-group")
    public void consumeClassCreated(String message) {
        System.out.println("Received Class Created Event: " + message);
        
    }

    @KafkaListener(topics = "assignment_submitted", groupId = "notification-group")
    public void consumeAssignmentSubmitted(String message) {
        System.out.println("Received Assignment Submitted Event: " + message);
    }
}

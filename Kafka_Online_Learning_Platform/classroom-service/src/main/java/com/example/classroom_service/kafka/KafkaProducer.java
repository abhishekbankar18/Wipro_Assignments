package com.example.classroom_service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC_CLASS_CREATED = "class_created";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendClassCreatedEvent(String message) {
        kafkaTemplate.send(TOPIC_CLASS_CREATED, message);
    }
}

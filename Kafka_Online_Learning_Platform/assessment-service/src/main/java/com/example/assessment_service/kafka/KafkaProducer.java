package com.example.assessment_service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC_ASSIGNMENT_SUBMITTED = "assignment_submitted";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendAssignmentSubmittedEvent(String message) {
        kafkaTemplate.send(TOPIC_ASSIGNMENT_SUBMITTED, message);
    }
}

package com.example.assessment_service.service;

import com.example.assessment_service.kafka.KafkaProducer;
import com.example.assessment_service.model.Assessment;
import com.example.assessment_service.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class AssessmentService {

    @Autowired
    private AssessmentRepository assessmentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Assessment createAssessment(Assessment assessment) {
        Assessment saved = assessmentRepository.save(assessment);

        String notificationUrl = "http://localhost:5555/notifications"; 
        restTemplate.postForObject(notificationUrl, saved, String.class);

        return saved;
    }

    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }

    public Optional<Assessment> getAssessmentById(Long id) {
        return assessmentRepository.findById(id);
    }

    public void deleteAssessment(Long id) {
        assessmentRepository.deleteById(id);
    }
    
    @Autowired
    private KafkaProducer kafkaProducer;

    public Assessment submitAssignment(Assessment assessment) {
        Assessment saved = assessmentRepository.save(assessment);
        kafkaProducer.sendAssignmentSubmittedEvent("Assignment submitted: " + saved.getTitle());
        return saved;
    }

}

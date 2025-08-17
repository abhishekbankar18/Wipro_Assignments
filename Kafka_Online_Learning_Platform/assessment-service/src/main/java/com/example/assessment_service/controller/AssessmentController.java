package com.example.assessment_service.controller;

import com.example.assessment_service.model.Assessment;
import com.example.assessment_service.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assessments")
public class AssessmentController {

    @Autowired
    private AssessmentService assessmentService;

    @PostMapping
    public ResponseEntity<Assessment> createAssessment(@RequestBody Assessment assessment) {
        return ResponseEntity.ok(assessmentService.createAssessment(assessment));
    }

    @GetMapping
    public ResponseEntity<List<Assessment>> getAllAssessments() {
        return ResponseEntity.ok(assessmentService.getAllAssessments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Assessment>> getAssessmentById(@PathVariable Long id) {
        return ResponseEntity.ok(assessmentService.getAssessmentById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAssessment(@PathVariable Long id) {
        assessmentService.deleteAssessment(id);
        return ResponseEntity.ok("Assessment deleted successfully");
    }
}

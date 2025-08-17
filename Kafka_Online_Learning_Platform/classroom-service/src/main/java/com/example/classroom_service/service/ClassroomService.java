package com.example.classroom_service.service;

import com.example.classroom_service.kafka.KafkaProducer;
import com.example.classroom_service.model.Classroom;
import com.example.classroom_service.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public Classroom saveClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Optional<Classroom> getClassroomById(Long id) {
        return classroomRepository.findById(id);
    }

    public void deleteClassroom(Long id) {
        classroomRepository.deleteById(id);
    }
    
    @Autowired
    private KafkaProducer kafkaProducer;

    public Classroom createClass(Classroom classroom) {
        Classroom saved = classroomRepository.save(classroom);
        kafkaProducer.sendClassCreatedEvent("Class created: " + saved.getClass());
        return saved;
    }

}

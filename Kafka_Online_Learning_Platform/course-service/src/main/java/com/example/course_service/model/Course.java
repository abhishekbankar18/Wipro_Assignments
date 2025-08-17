package com.example.course_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String title;
    private String description;
    private String syllabus;
    private Long teacherId; 


    public Long getCourseId() {
        return courseId;
    }
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSyllabus() {
        return syllabus;
    }
    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }
    public Long getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }


    public Course() {}
    public Course(Long courseId, String title, String description, String syllabus, Long teacherId) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
        this.teacherId = teacherId;
    }
}

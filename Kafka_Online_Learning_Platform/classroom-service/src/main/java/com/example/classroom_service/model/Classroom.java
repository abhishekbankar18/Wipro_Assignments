package com.example.classroom_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;

    private Long courseId;
    private String sessionLink;
    private String scheduleTime;
    private int enrolledStudents;

    public Long getClassroomId() {
        return classroomId;
    }
    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }
    public Long getCourseId() {
        return courseId;
    }
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public String getSessionLink() {
        return sessionLink;
    }
    public void setSessionLink(String sessionLink) {
        this.sessionLink = sessionLink;
    }
    public String getScheduleTime() {
        return scheduleTime;
    }
    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }
    public int getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    
    public Classroom() {}
    public Classroom(Long classroomId, Long courseId, String sessionLink, String scheduleTime, int enrolledStudents) {
        this.classroomId = classroomId;
        this.courseId = courseId;
        this.sessionLink = sessionLink;
        this.scheduleTime = scheduleTime;
        this.enrolledStudents = enrolledStudents;
    }
}

package com.example.notification_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    private Long assessmentId;
    private Long courseId;
    private String message;
    
	public Long getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}
	public Long getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(Long assessmentId) {
		this.assessmentId = assessmentId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notification(Long notificationId, Long assessmentId, Long courseId, String message) {
		super();
		this.notificationId = notificationId;
		this.assessmentId = assessmentId;
		this.courseId = courseId;
		this.message = message;
	}

    
}

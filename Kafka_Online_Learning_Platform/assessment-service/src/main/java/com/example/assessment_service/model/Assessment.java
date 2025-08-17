package com.example.assessment_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assessmentId;

    private String title;
    private String description;
    private String type; 
    private Long courseId;
    private String dueDate;
	public Long getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(Long assessmentId) {
		this.assessmentId = assessmentId;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Assessment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assessment(Long assessmentId, String title, String description, String type, Long courseId, String dueDate) {
		super();
		this.assessmentId = assessmentId;
		this.title = title;
		this.description = description;
		this.type = type;
		this.courseId = courseId;
		this.dueDate = dueDate;
	} 

    
    
  
}

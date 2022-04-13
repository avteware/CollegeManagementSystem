package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course")
public class Course {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseCode;
	
	
	private String courseName;
	private int totalSem;
	
	@JsonIgnore
	@OneToMany(mappedBy = "courseCode")
	private List<Students> id;
	
	@OneToMany(mappedBy = "courseCode",cascade = CascadeType.ALL)
	private List<Subject> subjectCode;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Course(Integer courseCode, String courseName, int totalSem, List<Students> id, List<Subject> subjectCode) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.totalSem = totalSem;
		this.id = id;
		this.subjectCode = subjectCode;
	}


	public Integer getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTotalSem() {
		return totalSem;
	}

	public void setTotalSem(int totalSem) {
		this.totalSem = totalSem;
	}

	public List<Students> getId() {
		return id;
	}

	public void setId(List<Students> id) {
		this.id = id;
	}

	public List<Subject> getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(List<Subject> subjectCode) {
		this.subjectCode = subjectCode;
	}

	
	
}

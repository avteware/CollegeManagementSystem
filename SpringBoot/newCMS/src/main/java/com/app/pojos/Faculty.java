package com.app.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer facultyId;
	private String facultyName;
	@Column(unique=true,nullable=false )
	private String facultyEmail;
	private String facultyMob;
	@Temporal(TemporalType.DATE)
	private Date facultyDob;
	private String facultyGender;
	private String facultyCity;
	private String facultyQulification;
	private String facultyExp;
	private String role;
	
	@OneToMany(mappedBy = "facultyId")
	private List<Subject> subjectCode;
	
	@OneToMany(mappedBy = "facultyId")
	private List<Exam> examCode;
	
	@JsonIgnore
	@OneToMany(mappedBy = "facultyId", cascade = CascadeType.ALL)
	private List<Students> id;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(Integer facultyId, String facultyName, String facultyEmail, String facultyMob, Date facultyDob,
			String facultyGender, String facultyCity, String facultyQulification, String facultyExp, String role,
			List<Subject> subjectCode, List<Exam> examCode, List<Students> id) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyEmail = facultyEmail;
		this.facultyMob = facultyMob;
		this.facultyDob = facultyDob;
		this.facultyGender = facultyGender;
		this.facultyCity = facultyCity;
		this.facultyQulification = facultyQulification;
		this.facultyExp = facultyExp;
		this.role = role;
		this.subjectCode = subjectCode;
		this.examCode = examCode;
		this.id = id;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyEmail() {
		return facultyEmail;
	}

	public void setFacultyEmail(String facultyEmail) {
		this.facultyEmail = facultyEmail;
	}

	public String getFacultyMob() {
		return facultyMob;
	}

	public void setFacultyMob(String facultyMob) {
		this.facultyMob = facultyMob;
	}

	public Date getFacultyDob() {
		return facultyDob;
	}

	public void setFacultyDob(Date facultyDob) {
		this.facultyDob = facultyDob;
	}

	public String getFacultyGender() {
		return facultyGender;
	}

	public void setFacultyGender(String facultyGender) {
		this.facultyGender = facultyGender;
	}

	public String getFacultyCity() {
		return facultyCity;
	}

	public void setFacultyCity(String facultyCity) {
		this.facultyCity = facultyCity;
	}

	public String getFacultyQulification() {
		return facultyQulification;
	}

	public void setFacultyQulification(String facultyQulification) {
		this.facultyQulification = facultyQulification;
	}

	public String getFacultyExp() {
		return facultyExp;
	}

	public void setFacultyExp(String facultyExp) {
		this.facultyExp = facultyExp;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Subject> getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(List<Subject> subjectCode) {
		this.subjectCode = subjectCode;
	}

	public List<Exam> getExamCode() {
		return examCode;
	}

	public void setExamCode(List<Exam> examCode) {
		this.examCode = examCode;
	}

	public List<Students> getId() {
		return id;
	}

	public void setId(List<Students> id) {
		this.id = id;
	}

	
	

	
}

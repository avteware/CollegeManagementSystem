package com.app.pojos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "exam")
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer examCode;
	
	private String examTime;
	@Temporal(TemporalType.DATE)
	private Date examDate;
	
	@OneToOne
	private Subject subjectCode;
	
	@ManyToOne
	private Faculty facultyId;
	
	@ManyToOne
	private ReportCard reportCardId;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Integer examCode, String examTime, Date examDate, Subject subjectCode, Faculty facultyId,
			ReportCard reportCardId) {
		super();
		this.examCode = examCode;
		this.examTime = examTime;
		this.examDate = examDate;
		this.subjectCode = subjectCode;
		this.facultyId = facultyId;
		this.reportCardId = reportCardId;
	}

	public Integer getExamCode() {
		return examCode;
	}

	public void setExamCode(Integer examCode) {
		this.examCode = examCode;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Subject getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(Subject subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Faculty getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Faculty facultyId) {
		this.facultyId = facultyId;
	}

	public ReportCard getReportCardId() {
		return reportCardId;
	}

	public void setReportCardId(ReportCard reportCardId) {
		this.reportCardId = reportCardId;
	}

	
	
	
	
	
}

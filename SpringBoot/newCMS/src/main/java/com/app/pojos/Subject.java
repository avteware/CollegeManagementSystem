package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer subjectCode;
	private String subjectName;
	private String subjectSem;
	private String totalTheoryMarks;
	private String totalPracticalMarks;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Course courseCode;
	
	@OneToOne
	private Exam examCode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Faculty facultyId;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Integer subjectCode, String subjectName, String subjectSem, String totalTheoryMarks,
			String totalPracticalMarks, Course courseCode, Exam examCode, Faculty facultyId) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectSem = subjectSem;
		this.totalTheoryMarks = totalTheoryMarks;
		this.totalPracticalMarks = totalPracticalMarks;
		this.courseCode = courseCode;
		this.examCode = examCode;
		this.facultyId = facultyId;
	}

	public Integer getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(Integer subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectSem() {
		return subjectSem;
	}

	public void setSubjectSem(String subjectSem) {
		this.subjectSem = subjectSem;
	}

	public String getTotalTheoryMarks() {
		return totalTheoryMarks;
	}

	public void setTotalTheoryMarks(String totalTheoryMarks) {
		this.totalTheoryMarks = totalTheoryMarks;
	}

	public String getTotalPracticalMarks() {
		return totalPracticalMarks;
	}

	public void setTotalPracticalMarks(String totalPracticalMarks) {
		this.totalPracticalMarks = totalPracticalMarks;
	}

	public Course getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Course courseCode) {
		this.courseCode = courseCode;
	}

	public Exam getExamCode() {
		return examCode;
	}

	public void setExamCode(Exam examCode) {
		this.examCode = examCode;
	}

	public Faculty getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Faculty facultyId) {
		this.facultyId = facultyId;
	}

		
	
}

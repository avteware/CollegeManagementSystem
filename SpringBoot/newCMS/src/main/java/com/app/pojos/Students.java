package com.app.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="students")
public class Students {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	private String fName;
	private String lName;
	@Column(unique=true,nullable=false )
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String mob;
	private String gender;
	private String fatherName;
	private String motherName;
	private String city;
	private String state;
	private String sem;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Course courseCode;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Faculty facultyId;
	
	@OneToMany(mappedBy = "id")
	private List<Attendance> rollNo;
	
	@OneToOne
	private ReportCard reportCardId;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(Integer id, String fName, String lName, String email, Date dob, String mob, String gender,
			String fatherName, String motherName, String city, String state, String sem, Course courseCode,
			Faculty facultyId, List<Attendance> rollNo, ReportCard reportCardId) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.dob = dob;
		this.mob = mob;
		this.gender = gender;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.city = city;
		this.state = state;
		this.sem = sem;
		this.courseCode = courseCode;
		this.facultyId = facultyId;
		this.rollNo = rollNo;
		this.reportCardId = reportCardId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

	public Course getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Course courseCode) {
		this.courseCode = courseCode;
	}

	public Faculty getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Faculty facultyId) {
		this.facultyId = facultyId;
	}

	public List<Attendance> getRollNo() {
		return rollNo;
	}

	public void setRollNo(List<Attendance> rollNo) {
		this.rollNo = rollNo;
	}

	public ReportCard getReportCardId() {
		return reportCardId;
	}

	public void setReportCardId(ReportCard reportCardId) {
		this.reportCardId = reportCardId;
	}
	
	
	
	
}

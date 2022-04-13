package com.app.pojos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "attendance")
public class Attendance {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer rollNo;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String isPresent;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Students id;

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(Integer rollNo, Date date, String isPresent, Students id) {
		super();
		this.rollNo = rollNo;
		this.date = date;
		this.isPresent = isPresent;
		this.id = id;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(String isPresent) {
		this.isPresent = isPresent;
	}

	public Students getId() {
		return id;
	}

	public void setId(Students id) {
		this.id = id;
	}

	


}

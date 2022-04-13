package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reportCard")
public class ReportCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false) 
	private Integer reportCardId;
	private String theoryMarks;
	private String practicalMarks;
	
	@OneToOne
	private Students id;
	
	@OneToMany(mappedBy = "reportCardId", cascade = CascadeType.ALL)
	private List<Exam> examCode;

	public ReportCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReportCard(Integer reportCardId, String theoryMarks, String practicalMarks, Students id,
			List<Exam> examCode) {
		super();
		this.reportCardId = reportCardId;
		this.theoryMarks = theoryMarks;
		this.practicalMarks = practicalMarks;
		this.id = id;
		this.examCode = examCode;
	}

	public Integer getReportCardId() {
		return reportCardId;
	}

	public void setReportCardId(Integer reportCardId) {
		this.reportCardId = reportCardId;
	}

	public String getTheoryMarks() {
		return theoryMarks;
	}

	public void setTheoryMarks(String theoryMarks) {
		this.theoryMarks = theoryMarks;
	}

	public String getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(String practicalMarks) {
		this.practicalMarks = practicalMarks;
	}

	public Students getId() {
		return id;
	}

	public void setId(Students id) {
		this.id = id;
	}

	public List<Exam> getExamCode() {
		return examCode;
	}

	public void setExamCode(List<Exam> examCode) {
		this.examCode = examCode;
	}

	
	
}

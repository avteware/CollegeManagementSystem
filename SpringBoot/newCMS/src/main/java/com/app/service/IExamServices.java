package com.app.service;

import java.util.List;

import com.app.pojos.Exam;


public interface IExamServices 
{
	//Students getStudentsById(Integer id);
	List<Exam> getAllExam();
	Exam addExamDetails(Exam TransientExam);
	
	Exam getExamDetailsById(int examCode);
	String deleteExamDetails(int examCode);
	
}

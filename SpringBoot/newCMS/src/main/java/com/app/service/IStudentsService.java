package com.app.service;

import java.util.List;

import com.app.pojos.Students;


public interface IStudentsService 
{
	//Students getStudentsById(Integer id);
	List<Students> getAllStudents();
	Students addStudentsDetails(Students TransientStudent);
	String deleteStudentsDetails(int id);
	Students getStudentsDetailsById(int id);
}

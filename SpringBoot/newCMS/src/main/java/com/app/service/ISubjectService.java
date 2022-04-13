package com.app.service;

import java.util.List;


import com.app.pojos.Subject;

public interface ISubjectService 
{
	List<Subject> getAllSubject();
	Subject addSubjectDetails(Subject TransientSubject);
	String deleteSubjectDetails(int subjectCode);
	Subject getSubjectDetailsById(int subjectCode);
}

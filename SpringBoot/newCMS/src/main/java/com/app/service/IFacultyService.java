package com.app.service;

import java.util.List;

import com.app.pojos.Faculty;
import com.app.pojos.Students;

public interface IFacultyService 
{
	List<Faculty> getAllFaculty();
	Faculty addFacultyDetails(Faculty TransientFaculty);
	Faculty getFacultyDetailsById(int facultyId);
	String deleteFacultyDetails(int facultyId);
}

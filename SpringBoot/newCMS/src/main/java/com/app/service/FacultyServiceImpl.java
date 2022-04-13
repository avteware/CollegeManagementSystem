package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.FacultyRepository;
import com.app.pojos.Faculty;
import com.app.pojos.Students;

@Service
@Transactional
public class FacultyServiceImpl implements IFacultyService
{
	@Autowired
	private FacultyRepository facultyRepo;
	@Override
	public List<Faculty> getAllFaculty() 
	{
		// TODO Auto-generated method stub
		List<Faculty> faculty = new ArrayList<>();
	     facultyRepo.findAll().forEach(faculty::add);
	     return faculty;
	}
	
	
	@Override
	public Faculty addFacultyDetails(Faculty TransientFaculty) 
	{
		// TODO Auto-generated method stub
		return facultyRepo.save(TransientFaculty);
	}
	
	
	
	@Override
	public String deleteFacultyDetails(int facultyId) {
		// TODO Auto-generated method stub
		facultyRepo.deleteById(facultyId);
		return "Faculty details with "+facultyId+" dekleted sucessfully..!!!";
	}

	@Override
	public Faculty getFacultyDetailsById(int facultyId) {
		// TODO Auto-generated method stub
		return facultyRepo.findById(facultyId).orElseThrow(() -> new ResourceNotFoundException("Faculty by id "+facultyId+" not found..!!"));
	}
}

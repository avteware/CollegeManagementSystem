package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.StudentsRepository;
import com.app.pojos.Students;

@Service
@Transactional
public class StudentsServiceImpl implements IStudentsService {
	@Autowired
	private StudentsRepository studentsRepo;

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		List<Students> students = new ArrayList<>();
		studentsRepo.findAll().forEach(students::add);
		return students;
	}

	@Override
	public Students addStudentsDetails(Students TransientStudent) {
		// TODO Auto-generated method stub
		return studentsRepo.save(TransientStudent);
	}

	@Override
	public String deleteStudentsDetails(int id) {
		// TODO Auto-generated method stub
		studentsRepo.deleteById(id);
		return "Student details with "+id+" dekleted sucessfully..!!!";
	}

	@Override
	public Students getStudentsDetailsById(int id) {
		// TODO Auto-generated method stub
		return studentsRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student by id "+id+" not found..!!"));
	}

	
	/*
	 * @Override public Students getStudentsById(Integer id) { return
	 * studentsRepo.findById(id); }
	 */
	
	
}

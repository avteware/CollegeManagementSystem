package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.SubjectRepository;
import com.app.pojos.Course;
import com.app.pojos.Subject;

@Service
@Transactional
public class SubjectServiceImpl implements ISubjectService {
	@Autowired
	private SubjectRepository subjectRepo;

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		List<Subject> subject = new ArrayList<>();
		subjectRepo.findAll().forEach(subject::add);
		return subject;
	}
	
	@Override
	public Subject addSubjectDetails(Subject TransientSubject) {
		// TODO Auto-generated method stub
		return subjectRepo.save(TransientSubject);
	}
	
	
	
	@Override
	public String deleteSubjectDetails(int subjectCode) {
		// TODO Auto-generated method stub
		subjectRepo.deleteById(subjectCode);
		return "Subject details with "+subjectCode+" dekleted sucessfully..!!!";
	}

	
	
	@Override
	public Subject getSubjectDetailsById(int subjectCode) {
		// TODO Auto-generated method stub
		return subjectRepo.findById(subjectCode).orElseThrow(() -> new ResourceNotFoundException("Subject by id "+subjectCode+" not found..!!"));
	}
	
	/*
	 * @Override public Students getStudentsById(Integer id) { return
	 * studentsRepo.findById(id); }
	 */
	

}

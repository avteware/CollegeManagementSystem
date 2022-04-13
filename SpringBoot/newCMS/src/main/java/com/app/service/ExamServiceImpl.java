package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.ExamRepository;
import com.app.pojos.Course;
import com.app.pojos.Exam;

@Service
@Transactional
public class ExamServiceImpl implements IExamServices {
	@Autowired
	private ExamRepository examRepo;

	@Override
	public List<Exam> getAllExam() {
		// TODO Auto-generated method stub
		List<Exam> exam = new ArrayList<>();
		examRepo.findAll().forEach(exam::add);
		return exam;
	}

	@Override
	public Exam addExamDetails(Exam TransientExam) {
		// TODO Auto-generated method stub
		return examRepo.save(TransientExam);
	}

	
	

	@Override
	public String deleteExamDetails(int examCode) {
		// TODO Auto-generated method stub
		examRepo.deleteById(examCode);
		return "Exam details with "+examCode+" dekleted sucessfully..!!!";
	}

	
	
	@Override
	public Exam getExamDetailsById(int examCode) {
		// TODO Auto-generated method stub
		return examRepo.findById(examCode).orElseThrow(() -> new ResourceNotFoundException("Course by id "+examCode+" not found..!!"));
	}
	
	/*
	 * @Override public Students getStudentsById(Integer id) { return
	 * studentsRepo.findById(id); }
	 */
	

}

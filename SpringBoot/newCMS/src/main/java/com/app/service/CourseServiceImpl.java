package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.CourseRepository;
import com.app.pojos.Course;
//import com.app.pojos.Course;

@Service
@Transactional
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		List<Course> course = new ArrayList<>();
		courseRepo.findAll().forEach(course::add);
		return course;
	}

	@Override
	public Course addCourseDetails(Course TransientCourse) {
		// TODO Auto-generated method stub
		return courseRepo.save(TransientCourse);
	}
	
	
	@Override
	public String deleteCourseDetails(int courseCode) {
		// TODO Auto-generated method stub
		courseRepo.deleteById(courseCode);
		return "Course details with "+courseCode+" dekleted sucessfully..!!!";
	}

	
	@Override
	public Course getCourseDetailsById(int courseCode) {
		// TODO Auto-generated method stub
		return courseRepo.findById(courseCode).orElseThrow(() -> new ResourceNotFoundException("Course by id "+courseCode+" not found..!!"));
	}


	
	/*
	 * @Override public Course getCourseById(Integer id) { return
	 * CourseRepo.findById(id); }
	 */
	

}

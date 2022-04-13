package com.app.service;

import java.util.List;

import com.app.pojos.Course;
import com.app.pojos.Students;

public interface ICourseService {
	
	List<Course> getAllCourse();
	Course addCourseDetails(Course TransientCourse);
	/*
	 * String deleteCourseDetails(String courseCode); Course
	 * getCourseDetailsById(String courseCode);
	 */
	Course getCourseDetailsById(int courseCode);
	String deleteCourseDetails(int courseCode);

}
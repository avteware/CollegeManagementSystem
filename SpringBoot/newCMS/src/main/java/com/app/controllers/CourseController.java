package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Course;
import com.app.service.ICourseService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Course")
public class CourseController 
{
	@Autowired
	private ICourseService courseService;
	public CourseController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<Course> getAllCourseDetail()
	{
		System.out.println("In getAllCourse");
		return courseService.getAllCourse();
	}
	
	
	@PostMapping
	public Course addCourseDetails(@RequestBody Course s)
	{
		System.out.println("In add Course.."+s);
		return courseService.addCourseDetails(s);
		
	}
	
	
	@DeleteMapping("/{courseCode}")
	public String deleteCourseDetails(@PathVariable int courseCode)
	{
		System.out.println("In delete Course details.."+courseCode);
		return courseService.deleteCourseDetails(courseCode);
	}
	
	
	@GetMapping("/{courseCode}")
	public Course getCourseDetailsById(@PathVariable int courseCode)
	{
		System.out.println("In get Course details by courseCode.."+courseCode);
		return courseService.getCourseDetailsById(courseCode);
	}
}


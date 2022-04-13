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

import com.app.pojos.Students;
import com.app.service.IStudentsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/students")
public class StudentsController 
{
	@Autowired
	private IStudentsService studentService;
	public StudentsController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<Students> getAllStudentsDetail()
	{
		System.out.println("In getAllStudents");
		return studentService.getAllStudents();
	}
	
	
	@PostMapping
	public Students addStudentDetails(@RequestBody Students s)
	{
		System.out.println("In add Student.."+s);
		return studentService.addStudentsDetails(s);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteStudentsDetails(@PathVariable int id)
	{
		System.out.println("In delete Student details.."+id);
		return studentService.deleteStudentsDetails(id);
	}
	
	
	@GetMapping("/{id}")
	public Students getStudentsDetailsById(@PathVariable int id)
	{
		System.out.println("In get Student details by id.."+id);
		return studentService.getStudentsDetailsById(id);
	}
}


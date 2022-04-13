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

import com.app.pojos.Subject;
import com.app.service.ISubjectService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/subject")
public class SubjectController 
{
	@Autowired
	private ISubjectService SubjectService;
	public SubjectController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<Subject> getAllSubjectDetail()
	{
		System.out.println("In getAllSubject");
		return SubjectService.getAllSubject();
	}
	
	
	@PostMapping
	public Subject addStudentDetails(@RequestBody Subject s)
	{
		System.out.println("In add Subject.."+s);
		return SubjectService.addSubjectDetails(s);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteSubjectDetails(@PathVariable int id)
	{
		System.out.println("In delete Subject details.."+id);
		return SubjectService.deleteSubjectDetails(id);
	}
	
	
	@GetMapping("/{id}")
	public Subject getSubjectDetailsById(@PathVariable int id)
	{
		System.out.println("In get Subject details by id.."+id);
		return SubjectService.getSubjectDetailsById(id);
	}
}


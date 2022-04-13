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

import com.app.pojos.Exam;
import com.app.service.IExamServices;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Exam")
public class ExamController 
{
	@Autowired
	private IExamServices examService;
	public ExamController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<Exam> getAllExamDetail()
	{
		System.out.println("In getAllExam");
		return examService.getAllExam();
	}
	
	
	@PostMapping
	public Exam addStudentDetails(@RequestBody Exam s)
	{
		System.out.println("In add Exam.."+s);
		return examService.addExamDetails(s);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteExamDetails(@PathVariable int id)
	{
		System.out.println("In delete Exam details.."+id);
		return examService.deleteExamDetails(id);
	}
	
	
	@GetMapping("/{id}")
	public Exam getExamDetailsById(@PathVariable int id)
	{
		System.out.println("In get Exam details by id.."+id);
		return examService.getExamDetailsById(id);
	}
}


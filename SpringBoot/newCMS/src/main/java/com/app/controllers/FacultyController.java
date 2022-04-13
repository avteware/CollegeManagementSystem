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

import com.app.pojos.Faculty;
import com.app.service.IFacultyService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/faculty")
public class FacultyController 
{
	@Autowired
	private IFacultyService facultyService;
	public FacultyController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<Faculty> getAllFacultyDetail()
	{
		System.out.println("In getAllFaculty");
		return facultyService.getAllFaculty();
	}
	
	
	@PostMapping
	public Faculty addStudentDetails(@RequestBody Faculty s)
	{
		System.out.println("In add Student.."+s);
		return facultyService.addFacultyDetails(s);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteFacultyDetails(@PathVariable int id)
	{
		System.out.println("In delete Faculty details.."+id);
		return facultyService.deleteFacultyDetails(id);
	}
	
	
	@GetMapping("/{id}")
	public Faculty getFacultyDetailsById(@PathVariable int id)
	{
		System.out.println("In get Faculty details by id.."+id);
		return facultyService.getFacultyDetailsById(id);
	}
}


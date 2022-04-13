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

import com.app.pojos.Attendance;

import com.app.service.IAttendanceService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Attendance")
public class AttendanceController 
{
	@Autowired
	private IAttendanceService attendanceService;
	public AttendanceController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<Attendance> getAllAttendanceDetail()
	{
		System.out.println("In getAllAttendance");
		return attendanceService.getAllAttendance();
	}
	
	
	@PostMapping
	public Attendance addAttendanceDetails(@RequestBody Attendance s)
	{
		System.out.println("In add Course.."+s);
		return attendanceService.addAttendanceDetails(s);
		
	}
	
	
	@DeleteMapping("/{rollNo}")
	public String deleteAttendanceDetails(@PathVariable int rollNo)
	{
		System.out.println("In delete Attendance details.."+rollNo);
		return attendanceService.deleteAttendanceDetails(rollNo);
	}
	
	
	@GetMapping("/{rollNo}")
	public Attendance getAttendanceDetailsById(@PathVariable int rollNo)
	{
		System.out.println("In get Attendance details by courseCode.."+rollNo);
		return attendanceService.getAttendanceDetailsById(rollNo);
	}
}


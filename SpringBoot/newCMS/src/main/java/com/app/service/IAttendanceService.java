package com.app.service;

import java.util.List;

import com.app.pojos.Attendance;
import com.app.pojos.Course;


public interface IAttendanceService 
{
	List<Attendance> getAllAttendance();
	Attendance addAttendanceDetails(Attendance TransientAttendance);
	String deleteAttendanceDetails(int rollNo);
	Attendance getAttendanceDetailsById(int rollNo);
	
}

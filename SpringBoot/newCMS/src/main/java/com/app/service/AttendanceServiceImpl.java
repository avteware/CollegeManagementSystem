package com.app.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.AttendanceRepository;
import com.app.dao.StudentsRepository;
import com.app.pojos.Attendance;
import com.app.pojos.Course;
import com.app.pojos.Students;


@Service
@Transactional
public class AttendanceServiceImpl implements IAttendanceService
{
	@Autowired
	private AttendanceRepository attendanceRepo;
	
	
	@Override
	public List<Attendance> getAllAttendance() {
		// TODO Auto-generated method stub
		List<Attendance> attendance = new ArrayList<>();
		attendanceRepo.findAll().forEach(attendance::add);
		return attendance;
	}
	
	
	
	@Override
	public Attendance addAttendanceDetails(Attendance TransientAttendance) {
		// TODO Auto-generated method stub
		return attendanceRepo.save(TransientAttendance);
	}
	
	
	
	@Override
	public String deleteAttendanceDetails(int rollNo) {
		// TODO Auto-generated method stub
		attendanceRepo.deleteById(rollNo);
		return "Course details with "+rollNo+" dekleted sucessfully..!!!";
	}

	
	
	@Override
	public Attendance getAttendanceDetailsById(int rollNo) {
		// TODO Auto-generated method stub
		return attendanceRepo.findById(rollNo).orElseThrow(() -> new ResourceNotFoundException("rollno by id "+rollNo+" not found..!!"));
	}

}

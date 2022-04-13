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

import com.app.pojos.ReportCard;
import com.app.service.IReportCardService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ReportCard")
public class ReportCardController 
{
	@Autowired
	private IReportCardService reportCardService;
	public ReportCardController()
	{
		System.out.println("In const.."+getClass());
		
	}
	
	@GetMapping
	public List<ReportCard> getAllReportCardDetail()
	{
		System.out.println("In getAllReportCard");
		return reportCardService.getAllReportCard();
	}
	
	
	@PostMapping
	public ReportCard addStudentDetails(@RequestBody ReportCard s)
	{
		System.out.println("In add ReportCard.."+s);
		return reportCardService.addReportCardDetails(s);
		
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteReportCardDetails(@PathVariable int id)
	{
		System.out.println("In delete ReportCard details.."+id);
		return reportCardService.deleteReportCardDetails(id);
	}
	
	
	@GetMapping("/{id}")
	public ReportCard getReportCardDetailsById(@PathVariable int id)
	{
		System.out.println("In get ReportCard details by id.."+id);
		return reportCardService.getReportCardDetailsById(id);
	}
}


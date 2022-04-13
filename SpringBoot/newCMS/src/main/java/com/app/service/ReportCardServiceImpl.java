package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.ReportCardRepository;
import com.app.pojos.ReportCard;

@Service
@Transactional
public class ReportCardServiceImpl implements IReportCardService {
	@Autowired
	private ReportCardRepository reportCardRepo;

	@Override
	public List<ReportCard> getAllReportCard() {
		// TODO Auto-generated method stub
		List<ReportCard> reportCard = new ArrayList<>();
		reportCardRepo.findAll().forEach(reportCard::add);
		return reportCard;
	}

	@Override
	public ReportCard addReportCardDetails(ReportCard TransientReportCard) {
		// TODO Auto-generated method stub
		return reportCardRepo.save(TransientReportCard);
	}

	@Override
	public String deleteReportCardDetails(int id) {
		// TODO Auto-generated method stub
		reportCardRepo.deleteById(id);
		return "Report Card details with "+id+" dekleted sucessfully..!!!";
	}

	
	@Override
	public ReportCard getReportCardDetailsById(int id) {
		// TODO Auto-generated method stub
		return reportCardRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student by id "+id+" not found..!!"));
	}

	
	/*
	 * @Override public ReportCard getReportCardById(Integer id) { return
	 * ReportCardRepo.findById(id); }
	 */
	
	
}

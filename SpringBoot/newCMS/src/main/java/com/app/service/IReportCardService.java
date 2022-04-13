package com.app.service;

import java.util.List;


import com.app.pojos.ReportCard;

public interface IReportCardService 
{
	List<ReportCard> getAllReportCard();
	ReportCard addReportCardDetails(ReportCard TransientReportCard);
	String deleteReportCardDetails(int id);
	ReportCard getReportCardDetailsById(int id);
}

package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.ReportCard;

public interface ReportCardRepository extends JpaRepository<ReportCard, Integer> {

}

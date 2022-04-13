package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}

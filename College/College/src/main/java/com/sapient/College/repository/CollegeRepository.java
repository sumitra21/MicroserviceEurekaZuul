package com.sapient.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.College.model.College;

public interface CollegeRepository extends JpaRepository<College, String>{

}

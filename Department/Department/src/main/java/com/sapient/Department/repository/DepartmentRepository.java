package com.sapient.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.Department.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, String>{

}

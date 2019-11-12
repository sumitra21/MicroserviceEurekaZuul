package com.sapient.Department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.Department.model.Department;
import com.sapient.Department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository; 
	
	public void addDept(Department deptId) {
		departmentRepository.save(deptId);
	}
	
	public Department getDept(String deptId) {
		return departmentRepository.findById(deptId).get();
	}
	
	public java.util.List<Department> getAllDepts() {
		return departmentRepository.findAll();
	}
}

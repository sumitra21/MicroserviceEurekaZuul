package com.sapient.Department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.Department.model.Department;
import com.sapient.Department.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(path = "/depts", consumes = "application/json", produces = "application/json")
	public void addDept(@RequestBody Department department) {
		departmentService.addDept(department);
	}
	
	@GetMapping(path = "/depts/{deptId}")
	public Department getDept(@PathVariable String deptId){	
		return departmentService.getDept(deptId);
	}
	
	@GetMapping(path = "/depts")
	public List<Department> getAllDepertments(){			
		return departmentService.getAllDepts();
	}
	
	@GetMapping(path = "/depts/msg")
	public String getMessage(){			
		return "Department Microservice Started";
	}
}

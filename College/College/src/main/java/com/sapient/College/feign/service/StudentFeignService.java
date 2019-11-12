package com.sapient.College.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sapient.College.model.Student;

@FeignClient(name = "student-service", fallback = StudentFeignServiceFallback.class)
public interface StudentFeignService {
	
	@GetMapping(path = "/students/{studentId}")
	public Student getStudent(String studentId);
	
	@GetMapping(path = "/students")
	public List<Student> getAllStudents();
}

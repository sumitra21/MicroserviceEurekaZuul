package com.sapient.College.feign.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sapient.College.model.Student;

@Component
public class StudentFeignServiceFallback implements StudentFeignService{

	@Override
	public Student getStudent(String studentId) {
		System.out.println("inside=====");
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return new ArrayList<Student>();
	}

}

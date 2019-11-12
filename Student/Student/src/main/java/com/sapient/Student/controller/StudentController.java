package com.sapient.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.Student.model.Student;
import com.sapient.Student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(path = "/students", consumes = "application/json", produces = "application/json")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@GetMapping(path = "/students/{studentId}")
	public Student getStudent(@PathVariable String studentId){	
		return studentService.getStudent(studentId);
	}
	
	@GetMapping(path = "/students")
	public List<Student> getAllStudents(){			
		return studentService.getAllStudents();
	}
	
	@GetMapping(path = "/")
	public String getMessage(){			
		return "Student Microservice Started";
	}
}

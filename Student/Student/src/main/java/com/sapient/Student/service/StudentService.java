package com.sapient.Student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.Student.model.Student;
import com.sapient.Student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository; 
	
	public void addStudent(Student studentid) {
		studentRepository.save(studentid);
	}
	
	public Student getStudent(String studentid) {
		return studentRepository.findById(studentid).get();
	}
	
	public java.util.List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
}

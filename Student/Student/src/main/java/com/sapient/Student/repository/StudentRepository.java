package com.sapient.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.Student.model.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}

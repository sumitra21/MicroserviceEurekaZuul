package com.sapient.College.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.College.feign.service.DeptFeignService;
import com.sapient.College.feign.service.StudentFeignService;
import com.sapient.College.model.College;
import com.sapient.College.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository collegeRepository; 
	
	@Autowired
	private StudentFeignService studentFeignService;
	
	@Autowired
	private DeptFeignService deptFeignService;
	
	public void addCollege(College collegeid) {
		collegeRepository.save(collegeid);
	}
	
	public College getCollege(String collegeId) {
		College college = collegeRepository.findById(collegeId).get();
		college.setDepts(deptFeignService.getAllDepertments());
		college.setStudents(studentFeignService.getAllStudents());
		return college;
	}
	
	public java.util.List<College> getAllColleges() {
		return collegeRepository.findAll();
	}
}

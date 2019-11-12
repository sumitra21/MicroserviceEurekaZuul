package com.sapient.College.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sapient.College.model.Department;

@FeignClient(name = "department-service", fallback = DeptFeignServiceFallback.class)
public interface DeptFeignService {
	
	@GetMapping(path = "/depts/{deptId}")
	public Department getDept(String deptId);
	
	@GetMapping(path = "/depts")
	public List<Department> getAllDepertments();
}

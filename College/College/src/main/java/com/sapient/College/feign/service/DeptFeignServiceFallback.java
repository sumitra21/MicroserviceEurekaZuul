
package com.sapient.College.feign.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sapient.College.model.Department;

@Component
public class DeptFeignServiceFallback implements DeptFeignService {

	@Override
	public Department getDept(String deptId) {
	
		return null;
	}

	@Override
	public List<Department> getAllDepertments() {
		return new ArrayList<Department>();
	}

}

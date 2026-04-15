package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.DepartmentMapper;

@SpringBootTest
public class DepMapperTest {
 
	@Autowired
	DepartmentMapper mapper;
	
	@Test
	public void selectOne() {
		DepartmentVO dep = mapper.selectOne(10);
		System.out.println("단건조회: "+ dep.getDepartmentName());
	}
	
	@Test
	public void selectAll() {
		DepartmentVO result = new DepartmentVO();
		result.setDepartmentName(null);
		List<DepartmentVO> list = mapper.selectAll(result);
		for (DepartmentVO dep : list) {
			System.out.println(dep.getDepartmentName());
		}

	}
	
}

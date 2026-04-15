package com.example.demo;

import java.security.PublicKey;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.EmployeeVO;
import com.example.demo.mapper.EmployeeMapper;

@SpringBootTest
public class EmpMapperTest {
	
	@Autowired
	EmployeeMapper mapper;
	
	// @Test
	public void selectOne() {
		EmployeeVO emp = mapper.selectOne(100);
		// fristName 출력
			System.out.println(emp.getFirstName());
			
	}
    // @Test
  public void selectAll() {
	  EmployeeVO param = new EmployeeVO();
	  //param.setDepartmentId(10);
	  //param.setManagerId(100);
	  param.setFirstName("A");
	  List<EmployeeVO> list = mapper.selectAll(param);
	  for(EmployeeVO emp : list) {
		  System.out.println(emp.getFirstName());
	  }

  }
}

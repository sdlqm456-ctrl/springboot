package com.example.demo.emp.service;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.PageInfo;

// 어노테이션 
// @Component + 포록시 (대행) 클래스 구현 (been 등록) => @controller, @Mapper
// @Autowired 
// configuration + @Bean 
@Mapper
public interface EmployeeService {
	PageInfo<Object> selectAll(EmployeeVO emp, int pageNum);
	EmployeeVO selectOne(int empid);
	int delete(int id);
	int update(EmployeeVO emp);
	int insert(EmployeeVO emp);
}

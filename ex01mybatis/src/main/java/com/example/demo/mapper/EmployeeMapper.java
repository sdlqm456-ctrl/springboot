package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.emp.EmployeeVO;

// 어노테이션 
// @Component + 포록시 (대행) 클래스 구현 (been 등록) => @controller, @Mapper
// @Autowired 
// configuration + @Bean 
@Mapper
public interface EmployeeMapper {
	List<EmployeeVO> selectAll(EmployeeVO emp);
	EmployeeVO selectOne(int empid);
	int delete(int id);
	int update(EmployeeVO emp);
	int insert(EmployeeVO emp);
}

package com.example.demo.emp.controller;

// import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.emp.mapper.EmployeeMapper;
import com.example.demo.emp.service.EmployeeVO;
@CrossOrigin
@RequestMapping("/api")
@RestController
public class EmployeeRestController {
	@Autowired EmployeeMapper employeeMapper;
  // 전체조회 
	@GetMapping("/emp")
	public List<EmployeeVO>selectAll() {
		return employeeMapper.selectAll(null);
	}
  // 단건조회
	@GetMapping("/emp/{id}") 
	public EmployeeVO selectone(@PathVariable int id) {
		return employeeMapper.selectOne(id);
	}
	
  // 등록
	@PostMapping("/emp")
	public EmployeeVO insert(EmployeeVO vo) {
		employeeMapper.insert(vo);
		return vo;
	}
	
  // 수정  
	@PutMapping("/emp")
	public EmployeeVO update(EmployeeVO vo) {
		employeeMapper.update(vo);
		return vo;
	}
	// 삭제
	@DeleteMapping("/emp/{id}") 
	public int delete(@PathVariable int id) {
		return employeeMapper.delete(id);
	}
	
}

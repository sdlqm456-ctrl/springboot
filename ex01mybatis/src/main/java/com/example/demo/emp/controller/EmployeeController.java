package com.example.demo.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mapper.EmployeeMapper;

// Component + 라우터(컨트롤러임을 명시)
@Controller // 스테디오타입 어노테이션 
public class EmployeeController {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@GetMapping("/emp")
	public String emplist(Model modle) {
		modle.addAttribute("list", employeeMapper.selectAll(null));
		return "emp";
	}
}


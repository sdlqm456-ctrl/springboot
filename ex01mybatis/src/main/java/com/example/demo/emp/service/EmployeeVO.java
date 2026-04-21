package com.example.demo.emp.service;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeeVO {
	
	// 파스칼케이스: 클레스이름에 사용 (BackgroundColor)
	// 스네이크케이스: 데이터베이스 (backgroundcolor) 
	// 캐밥: Css 사용 (background-color)
	// 카멜: 필드 메서드(backgroundColor)
	private Integer employeeId; // 표기법: 파스탈케이스, 스네이크케이스, 캐밥, 카멜(자바) 
	private String firstName;
	private String lastName;
	private String Email;
	private String phoneNumber;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;
	private String jobId;
	private Double  salary;
	private Double commissionPct;
	private Integer managerId;
	private Integer departmentId;
	

	
}

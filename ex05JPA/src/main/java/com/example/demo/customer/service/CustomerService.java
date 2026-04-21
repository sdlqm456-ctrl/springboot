package com.example.demo.customer.service;

import java.util.List;

public interface CustomerService {
	// 등록
	void insert(CustomerReqVo vo);
	// 수정 
	void update(CustomerUpdVo vo);
	// 삭제 
	void delete(Long vo);
	
	// 단건조회
	CustomerResVO selectOne(CustomerVo vo);
	// 전체조회
	List<CustomerResVO>selectAll();
}

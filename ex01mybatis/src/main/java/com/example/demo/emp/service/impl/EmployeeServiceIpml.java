package com.example.demo.emp.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.emp.mapper.EmployeeMapper;
import com.example.demo.emp.service.EmployeeService;
import com.example.demo.emp.service.EmployeeVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service

public class EmployeeServiceIpml implements EmployeeService {
	private final EmployeeMapper employeeMapper;

	@Override
	public PageInfo<Object> selectAll(EmployeeVO emp, int pageNum) {
		
				PageInfo<Object> page = PageHelper.startPage(pageNum, 5)
						  .doSelectPageInfo(()-> employeeMapper.selectAll(emp));
		
		log.info("TotalCount : {}, CurrentPage : {}, PageSize : {}, TotalPage : {}"
		, page.getTotal()
		, page.getPageNum()
		, page.getPageSize()
		, page.getPages());
		System.out.println(page.getList());
		return page;
	}

	@Override
	public EmployeeVO selectOne(int empid) {
		// TODO Auto-generated method stub
		return employeeMapper.selectOne(empid);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return employeeMapper.delete(id);
	}

	@Override
	public int update(EmployeeVO emp) {
		// TODO Auto-generated method stub
		return employeeMapper.update(emp);
	}

	@Override
	public int insert(EmployeeVO emp) {
		// TODO Auto-generated method stub
		return employeeMapper.insert(emp);
	}
	

}

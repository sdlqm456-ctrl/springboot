package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.DepartmentVO;

@Mapper
public interface DepartmentMapper {
	List<DepartmentVO> selectAll(DepartmentVO dep);
	DepartmentVO selectOne(int deperid);
	int delete(int id);
	int update(DepartmentVO dep);
	int insert(DepartmentVO dep);
}

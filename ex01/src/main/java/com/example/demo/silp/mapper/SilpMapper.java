package com.example.demo.silp.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.silp.SilpVO;

@Mapper
public interface SilpMapper {
	List<SilpVO> selectAll();
	SilpVO selectOne(Integer silpno);
	int insert(SilpVO silpvo);
}

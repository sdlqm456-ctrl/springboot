package com.example.demo.silp.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.silp.SilpVO;
import com.example.demo.silp.mapper.SilpMapper;

@Service
@Mapper
public class SilpService {
 @Autowired 
 SilpMapper silpMapper;
 
 public List<SilpVO> getsilpList(Object param) {
	 return silpMapper.selectAll();
 }
}

package com.example.demo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.service.UserVO;
import com.example.demo.user.service.Userservice;

@Service
public class UserServiceIpml implements Userservice, UserDetailsService {

	@Autowired 
	UserMapper userMapper;
	
	@Override
	public UserVO selectUser(String loginId) {
		return userMapper.selectUser(loginId);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVO vo = userMapper.selectUser(username);
		vo.setRole(userMapper.selectRole(vo.getId()));
		return vo;
	}

}

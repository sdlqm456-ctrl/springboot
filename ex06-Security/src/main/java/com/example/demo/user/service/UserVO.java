package com.example.demo.user.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UserVO implements UserDetails {
  private Long id;
  private String userId;
  private String password;
  private String fullName;
  private String deptName;
  
  private List<String> role;
  
  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return role.stream().map(a-> new SimpleGrantedAuthority(a))
			   .collect(Collectors.toList());
  }
  
  @Override
  public String getUsername() {
	// TODO Auto-generated method stub
	return userId;
  }
 
  @Override
  public boolean isAccountNonExpired() {
	// 패스워드 변경
	return true;
  }

  @Override
  public boolean isAccountNonLocked() {
	// 로그인 실패횟수 look
	return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
	return true;
  }

  @Override
  public boolean isEnabled() {
	// 휴먼회원
	return true;
  }


}


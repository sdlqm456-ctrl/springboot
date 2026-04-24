package com.example.demo.user.mapper;

import java.util.List;
// import org.apache.ibatis.annotations.Mapper;
import com.example.demo.user.service.UserVO;

// @Mapper
public interface UserMapper {
	UserVO selectUser(String loginId);
	List<String>selectRole(Long id);
	
}

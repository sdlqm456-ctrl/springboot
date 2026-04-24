package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordTest {
 
	// 비밀번호 암호화 
	@Test
	public void test() {
		PasswordEncoder encoder = new BCryptPasswordEncoder(10);
		String pw = encoder.encode("1234");
		// matches: 비교 연산자 
		boolean result =  encoder.matches("1234", "$2a$10$KfsJEGgU/Th/rj8d5VMbIu7I6zjTdRHh2S9oSvx3eA4Sluo6jymA6");
		System.out.println(result);
		
	}
}

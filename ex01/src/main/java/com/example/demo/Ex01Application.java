package com.example.demo;

//import java.lang.System.LoggerFinder;

import org.mybatis.spring.annotation.MapperScan;
// import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.demo.**.mapper")
@SpringBootApplication
public class Ex01Application {
	// private static final Logger log = LoggerFinder.getLogger(Demo1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}

}

package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice


public class GlobalExceptionHandler {
	
	// 500
	@ExceptionHandler(NullPointerException.class) 
	public String error1() {
		return "error 500";
	}
	// 500
	@ExceptionHandler(InstantiationError.class) 
	public String error2() {
		return "error 500";
	}
 @ExceptionHandler(Exception.class) 
  public String error(Model model) {
	 return "error";
 }
}

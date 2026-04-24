package com.example.demo.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.book.BookVO;
import com.example.demo.book.service.BookService;

@Controller
public class Bookcontroller {
	
  @Autowired
  BookService bookService;
  
  // 처음 접속 시 메인화면인 book.html 파일의 내용이 나와야 함 
  
  
  // 도서 조회, 수정 페이지 
  @GetMapping({"/book/list"}) 
	public String booklist(Model model, 
			@ModelAttribute("book") BookVO vo,
			@RequestParam(required = false, defaultValue = "1") int pageNum) {
	  model.addAttribute("list", bookService.selectAll(vo, pageNum));
	  return "booklist";
  }
  
  // 도서등록 페이지 이동 
  @GetMapping("book/add")
  public String add(@ModelAttribute("book") BookVO vo, Model model) {
	  return "bookadd";
  }
  
  // 도서 등록 처리
  @PostMapping("book/add")
  public String addProc(BookVO vo) {
		bookService.insert(vo);
		return "redirect:/book/list";
		  
  }	  
  
}

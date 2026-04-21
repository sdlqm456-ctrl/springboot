package com.example.demo.board.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.board.BoardVO;
import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller

public class Boardcontoller {
	
	@Autowired
	BoardService boardService;

	@GetMapping({"/board/list", "/"})
	public String boardlist(Model model, 
			@ModelAttribute("board") BoardVO vo,
			@RequestParam(required = false, defaultValue = "1") int pageNum) {

		model.addAttribute("pageInfo", boardService.selectAll(vo, pageNum));
		return "board/list";
	}
	@GetMapping("/board/info")
	public void info(Integer bno, Model model) {
		model.addAttribute("board" , boardService. selectOne(bno));
	}
	// 게시판 등록 페이지이동 
	@GetMapping("/board/register")
	public void register(@ModelAttribute("board") BoardVO vo, Model model) {
		
	}
	
	// 게시글 등록처리 
	@PostMapping("/board/register") 
	public String registerProc(BoardVO vo, MultipartFile file) throws IllegalStateException, IOException {
		// 첨부파일 
		file.transferTo(new File("d:/upload", file.getOriginalFilename()));
		vo.setAttach(file.getOriginalFilename());
		boardService.insert(vo);
		return "redirect:/board/list";
	}
	
	// 게시글 수정
	@GetMapping("/board/update") 
	public String update(Integer bno, Model model) {
		model.addAttribute("board", boardService.selectOne(bno));
		return "board/update";
	}
	
	//수정처리
	@PostMapping("/board/update")
	public String updateProc(BoardVO vo) {
	    boardService.update(vo);
	    return "redirect:/board/list";
	}
	// 게시글 삭제처리 
	@GetMapping("/board/delete") 
	public String delete(Integer bno) {
		boardService.delete(bno);
		return "redirect:/board/list";
	}
	

	

}

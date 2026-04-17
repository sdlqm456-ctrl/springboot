package com.example.demo.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.board.BoardVO;
import com.example.demo.board.mapper.BoardMapper;

@Controller

public class Boardcontoller {
	
	@Autowired
	BoardMapper boardMapper;

	@GetMapping("/board/list")
	public String boardlist(Model model) {
		model.addAttribute("list", boardMapper.selectAll(null));
		return "board/list";
	}
	@GetMapping("/board/info")
	public void info(@RequestParam Integer bno, Model model) {
		model.addAttribute("board" , boardMapper. selectOne(bno));
	}
	// 게시판 등록 페이지이동 
	@GetMapping("/board/register")
	public void register(@ModelAttribute("board") BoardVO vo, Model model) {
		
	}
	
	// 게시글 등록처리 
	@PostMapping("/board/register") 
	public String registerProc(BoardVO vo) {
		boardMapper.insert(vo);
		return "redirect:/board/list";
	}
	// 게시글 수정
	@GetMapping("/board/update") 
	public String update(Integer bno, Model model) {
		model.addAttribute("board", boardMapper.selectOne(bno));
		return "board/update";
	}
	
	//수정처리
	@PostMapping("/board/update")
	public String updateProc(BoardVO vo) {
	    boardMapper.update(vo);
	    return "redirect:/board/list";
	}
	// 게시글 삭제처리 
	@GetMapping("/board/delete") 
	public String delete(Integer bno) {
		boardMapper.delete(bno);
		return "redirect:/board/list";
	}
	

	

}

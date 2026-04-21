package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("reply")
@RestController

public class ReplyController {
  @Autowired ReplyRepository replyRepository;
  
  // 전체조회 
  @GetMapping("/reply")
  public List<Reply> findAll(){
	  return replyRepository.findAll();
  }
  // 단건조회 
  @GetMapping("/reply/{bno}")
  public Reply findOne(@PathVariable Long bno) {
	  return replyRepository.findById(bno).get();
	  
  }
  // 등록 
  @PostMapping("/reply")
  public Reply findById(@RequestBody Reply re) {
	  replyRepository.save(re);
	  return re;
  }
  // 수정 
  @PutMapping("/reply") 
  public Reply update(@RequestBody Reply re) {
	  replyRepository.save(re);
	  return re;
  }
  // 삭제 
  @DeleteMapping("/reply/{bno}")
  public void deleteLong(@PathVariable Long bno) {
	  replyRepository.deleteById(bno);
  }
}

package com.example.demo.silp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.silp.service.SilpService;

@Controller
public class SilpController {
	
  @Autowired 
  SilpService sil;
  
  @RequestMapping("/silp/list")
  public String silpList(Model model) {
	  model.addAttribute("silplist", sil.getsilpList(null));
	  return "silplist";
  }
  

}

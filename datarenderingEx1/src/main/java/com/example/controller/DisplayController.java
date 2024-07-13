package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayController {
	@GetMapping("/about")
	public String showAboutPage(Model model) {
		model.addAttribute("name","Ram");
		model.addAttribute("age","30");
		model.addAttribute("mobileno","123123");
		model.addAttribute("address","Bbsr");
		return"about";
		
	}
	

}

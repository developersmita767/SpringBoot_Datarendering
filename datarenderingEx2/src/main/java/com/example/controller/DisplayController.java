package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

@Controller
@RequestMapping("/display")
public class DisplayController {
	@GetMapping("/about")
	public String showAboutPage(Model model) {
		Student student=new Student();
		student.setName("Rama");
		student.setAge("20");
		student.setMobileno("9999999");
		student.setAddress("BBSR");
		model.addAttribute("student",student);
		return"about";
		
		
	}
	

}

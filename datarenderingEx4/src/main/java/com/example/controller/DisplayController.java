package com.example.controller;

import java.util.ArrayList;
import java.util.List;

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
			Student student1=new Student();
			student1.setName("Raj");
			student1.setAge(20);
			student1.setMobileno("88888888");
			student1.setAddress("Bbsr");
			
			Student student2=new Student();
			student2.setName("Ram");
			student2.setAge(35);
			student2.setMobileno("77777777");
			student2.setAddress("Bbsr");
			
			
			List<Student> studentList =new ArrayList<>();
			studentList.add(student1);
			studentList.add(student2);
			
			model.addAttribute("students",studentList);
			
			
			
			return"about";
		}
		

}

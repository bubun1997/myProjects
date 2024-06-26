package com.soumya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soumya.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping("/send")
	public String getStudentData(
			       
			   @RequestParam("id") Long studentid,
			   @RequestParam("name") String studentname,
			   @RequestParam("email") String studentemail,
			   @RequestParam("mobno") String studentmobileno,
			   Model model

			
			
			) 
	{
		
		model.addAttribute("student_details",Student.build(studentid, studentname, studentemail, studentmobileno));
		return "student";
	}
	
	@GetMapping("/")
	public String getHomePage() {
		
		return "Home";
	}
	
	@GetMapping("/about")
	public String getAboutPage() {
		
		return "About";
	}

}

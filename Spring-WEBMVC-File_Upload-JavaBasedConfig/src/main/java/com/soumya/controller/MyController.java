package com.soumya.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.soumya.model.Car;


@Controller
@RequestMapping("/mycars")
public class MyController {
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		
		return "Home";
	}
	
	@PostMapping("/add/car")
	public String addCar(@ModelAttribute Car car , HttpSession session , Model model) {
		
		CommonsMultipartFile file = car.getMyFile();
		
		byte[] data = file.getBytes();
		
		String path = session.getServletContext().getRealPath("/")+"WEB-INF"+
											File.separator+"resources"+File.separator+"image"+File.separator+
												file.getOriginalFilename();
		
		System.out.println(path);
		
		try {
		
			FileOutputStream fos = new FileOutputStream(path);
			
			fos.write(data);
			
			model.addAttribute("cars", car);
			model.addAttribute("path", "/resources/image/");
			
			System.err.println("File Uploaded...");
			
			fos.close();
		
		}
		
		catch(IOException IE) {
			
			IE.printStackTrace();
			
		}
		
		
		return "Success";
	}
	
	

}

package com.soumya.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soumya.entity.Employee;

@Controller
public class MyController {
	
	
	private static final List<Employee> EMPLOYEE_LIST;
	
	static {
		
		EMPLOYEE_LIST = new ArrayList();
				
				
				
				
	}
	
	@RequestMapping("/home")
	public String getHomePage() {
		
		return "Home";
	}
	
	@RequestMapping("/add/employee")
	public String addEmployee(@ModelAttribute Employee employee) {
		
		System.out.println(employee);
		
		EMPLOYEE_LIST.add(employee);
		
		return "Confirmation";
	}

	
	@RequestMapping("/get/employee")
	public String getEmployee(@RequestParam Integer eid,Model model) {
		
		Employee emp = EMPLOYEE_LIST.stream().
				     filter(e -> e.getEmployeeId().equals(eid)).findAny().orElse(null);
				     
				
	   if(!(emp==null)) {
		   
			   model.addAttribute("emp",emp);
			
			return "Result";
	   }
	   
	   return "Error";
	}
}

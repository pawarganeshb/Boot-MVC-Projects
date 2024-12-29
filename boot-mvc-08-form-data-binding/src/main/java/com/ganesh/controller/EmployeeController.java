package com.ganesh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ganesh.entity.EmployeeEntity;

@Controller
public class EmployeeController {
	@GetMapping
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String show(Map<String, String> map, @ModelAttribute("employee") EmployeeEntity employee) {
		System.out.println(employee);
		return "show";

	}
}

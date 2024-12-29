package com.ganesh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ganesh.entity.StudentEntity;

@Controller
public class RegistrationController {
	@GetMapping
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String register() {
		return "register_student";
	}

	@PostMapping("/register")
	public String showResult(Map<String, String> map, @ModelAttribute("stu") StudentEntity studentEntity) {
		System.out.println(studentEntity);
		return "show";
	}
}

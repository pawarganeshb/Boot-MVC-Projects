package com.ganesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganesh.service.IGreetService;

@Controller
public class GreetingController {
	@Autowired
	private IGreetService service;

	@RequestMapping("/")
	public String getGreet() {
		return "index";
	}

	@RequestMapping("greet")
	public String getGreet(Map<String, String> map) {
		String greet = service.greeting();
		map.put("greet", greet);
		return "greet";
	}
}

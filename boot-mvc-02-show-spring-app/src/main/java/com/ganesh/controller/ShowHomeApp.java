package com.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowHomeApp {

	@GetMapping
	public String showHomeApp() {
		return "welcome";
	}

}

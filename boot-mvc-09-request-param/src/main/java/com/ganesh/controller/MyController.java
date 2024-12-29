package com.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/data")
	public String process(@RequestParam("n") Integer no, @RequestParam("sname") String name, Model model) {
		model.addAttribute("n", no);
		model.addAttribute("sname", name);
		System.out.println(no + " " + name);
		return "home";
	}

}

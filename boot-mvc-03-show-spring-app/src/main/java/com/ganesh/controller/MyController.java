package com.ganesh.controller;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	/*
	 * @GetMapping public String getMessage(Map<String, Object> map) {
	 * System.out.println("Map Object " + map.getClass()); map.put("Name",
	 * "Ganesh Pawar"); map.put("Ganesh", new Date().getYear()); return "index"; }
	 */

	/*
	 * @GetMapping public String process(Model model) { model.addAttribute("val1",
	 * "val2"); model.addAttribute("val2", new Date()); return "index"; }
	 */
	@GetMapping
	public String process(ModelMap map) {
		map.addAttribute("Name", "Ganesh");
		map.addAttribute("Date", LocalDateTime.now());
		return "index";
	}
}

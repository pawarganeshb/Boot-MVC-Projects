package com.ganesh.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/report")
	public String showReport1() throws Exception {
		System.out.println("MyController.showReport1()");
		return "inddex";
	}

	/*
	 * @RequestMapping("/report2") public String showReport2() throws Exception {
	 * System.out.println("MyController.showReport2()"); return "index"; }
	 */

	/*
	 * @RequestMapping(value = { "report1", "report2", "report3", }) public String
	 * showReport2() throws Exception {
	 * System.out.println("MyController.showReport2()"); return "index"; }
	 */

	
	@RequestMapping("/data")
	public String sendData(Map<String, Object> map) {
		System.out.println("MyController.sendData()");
		map.put("favColor", new String[] { "Green", "Red", "Yellow" });
		map.put("nickName", List.of("Ganesh", "Gana", "Ganu"));
		map.put("phonNumber", Set.of(8805005169L, 7020928761L));
		map.put("idDetail", Map.of("Adhar No ", 123456, "Voter No ", 745896));
		return "index";
	}
}
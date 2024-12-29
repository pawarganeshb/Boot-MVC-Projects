package com.ganesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ganesh.service.IFindSeasonService;

@Controller
public class SeasonController {
	@Autowired
	private IFindSeasonService service;

	@GetMapping("/")
	public String homePage() {

		return "index";
	}

	@GetMapping("/season")
	public String showSeason(Map<String, String> map) {
		String msg = service.seasonFinder();
		map.put("season", msg);
		return "display";
	}
}

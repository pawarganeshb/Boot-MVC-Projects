package com.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ganesh.exceptions.CustomException;

@Controller
public class TestController {
	@RequestMapping("/test")
	public String testPage() {
		return "test"; // Should map to /WEB-INF/views/test.jsp
	}

	@RequestMapping("/test-error")
	public String testError() {
		throw new CustomException("This is a custom error");
	}

}

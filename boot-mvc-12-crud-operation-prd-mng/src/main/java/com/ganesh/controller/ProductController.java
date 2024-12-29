package com.ganesh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ganesh.entity.ProductEntity;
import com.ganesh.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService productService;

	@GetMapping("/")
	public String homePage() {
		System.err.println("ProductController.homePage()");
		return "home";
	}

	@GetMapping("/show")
	public String showPage(Map<String, Object> map) {
		System.err.println("ProductController.showPage()");
		List<ProductEntity> allRecord = productService.getAllRecord();
		if (allRecord == null) {
			System.err.println("Empty record!");
		} else {
			System.err.println(allRecord.size() + " record found.");
		}
		map.put("productList", allRecord);
		return "show";
	}

}

package com.ganesh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ganesh.model.Customer;
import com.ganesh.services.ICustomerService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
public class EmployeeController {
	@Autowired
	private ICustomerService customerService;

	@GetMapping("/")
	public String showHomePage() {
		System.out.println("EmployeeController.showHomePage()");
		return "home";
	}

	@GetMapping("/show")
	public String showRecord(Map<String, Object> map) {
		List<Customer> customerEntities = customerService.getAllCustomer();
		customerEntities.forEach(System.out::println);
		map.put("customers", customerEntities);
		System.out.println("CustomerController.view()");
		return "record";
	}

	@GetMapping("/update")
	public String updateRecords(@RequestParam("cno") int cno, @ModelAttribute("cust") Customer cust) {
		System.out.println(cno);
		Customer reocor = customerService.getReocor(cno);
		System.out.println(reocor);
		BeanUtils.copyProperties(reocor, cust);
		return "update";
	}

	@PostMapping("/update")
	public String updateRecords(@ModelAttribute("cust") Customer customer, Model model) {
		boolean isUpdated = customerService.updateRecord(customer);
		if (isUpdated) {
			model.addAttribute("message", "Customer details updated successfully!");
		} else {
			model.addAttribute("message", "Failed to update customer details!");
		}
		return "redirect:show";
	}

	@GetMapping("/add")
	public String addRecord() {
		System.out.println("EmployeeController.addRecord()");
		return "add";
	}

	@PostMapping("/add")
	public String addRecords(@ModelAttribute("cust") Customer cust, Map<String, Object> map) {
		System.out.println("EmployeeController.addRecords()");
		String msg = customerService.saveRecord(cust);
		System.out.println(msg);
		map.put("customer", msg);
		map.put("id", cust.getCno());
		return "redirect:show";
	}

	@GetMapping("/delete")
	public String deleteRecord(@RequestParam int no) {
		customerService.deleteRecord(no);
		return "redirect:show";
	}
}

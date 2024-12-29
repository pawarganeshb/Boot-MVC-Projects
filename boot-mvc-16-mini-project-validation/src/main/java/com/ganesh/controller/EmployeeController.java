package com.ganesh.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ganesh.model.EmployeesEntity;
import com.ganesh.services.IEmployeeService;
import com.ganesh.validation.Validation;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private Validation validation;

	@GetMapping
	public String home() {
		System.err.println("EmployeeController.home()");
		return "home";
	}

	@GetMapping("/show")
	public String show(Map<String, Object> map) {
		System.err.println("EmployeeController.show()");

		List<EmployeesEntity> allEmployee = employeeService.getAllEmployee();

		map.put("empList", allEmployee);
		if (allEmployee == null)
			System.err.println("NO Employee Present!");
		else
			allEmployee.forEach(System.out::println);

		return "record";
	}

	@GetMapping("/add")
	public String addEmployee(@ModelAttribute("employee") EmployeesEntity employee) {
		System.err.println("EmployeeController.addEmployee()");
		return "add";
	}

	@GetMapping("/record")
	public String showEmployeeRecords(Map<String, Object> model) {
		System.err.println("EmployeeController.showEmployeeRecords()");

		List<EmployeesEntity> allEmployees = employeeService.getAllEmployee();

		model.put("empList", allEmployees);

		return "record";
	}

	@PostMapping("/add")
	public String addEmployee(@ModelAttribute("employee") EmployeesEntity employee, BindingResult errors,
			RedirectAttributes redirect) {

		System.out.println("EmployeeController.addEmployee()");

		// Validation first
		if (validation.supports(EmployeesEntity.class)) {
			validation.validate(employee, errors);
			if (errors.hasErrors()) {
				// Forward back to the form with error messages
				return "add";
			}
		}

		// Save the employee if validation is successful
		String statusMessage = employeeService.saveRecord(employee);
		redirect.addFlashAttribute("message", statusMessage);

		// Redirect to a confirmation or list page
		return "redirect:record";
	}

	@GetMapping("/update/{id}")
	public String updateEmployee(@PathVariable("id") int id, Model model) {
		System.out.println("EmployeeController.updateEmployee()");
		EmployeesEntity emp = employeeService.getEmployee(id);

		if (emp == null) {
			throw new IllegalArgumentException("Employee not found with ID: " + id);
		}

		model.addAttribute("employee", emp);
		return "update";
	}

	@PostMapping("/update")
	public String updatedRecord(RedirectAttributes attributes, @ModelAttribute("emp") EmployeesEntity emp,
			BindingResult errors) {
		System.out.println("EmployeeController.updatedRecord()");
		if (validation.supports(EmployeesEntity.class)) {
			if (errors.hasErrors()) {
				return "update";

			}

		}
		EmployeesEntity updateRecord = employeeService.updateRecord(emp);
		attributes.addFlashAttribute("updatedMessage", updateRecord);
		return "redirect:record";
	}

	@GetMapping("/delete")
	public String deleteEmployee(RedirectAttributes attributes, @RequestParam int no) {
		String deleteRecord = employeeService.deleteRecord(no);
		attributes.addFlashAttribute("deleteMessage", deleteRecord);
		return "redirect:record";
	}

}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Customer;
import com.example.demo.repository.ICustomerRepository;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerRepository customerRepository;

    // Show the form for adding a new customer
    @GetMapping("/show_customer_form")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer()); // Empty object for new customer
        return "customer_form";
    }

    // Show the form for updating an existing customer
    @GetMapping("/update_customer/{cno}")
    public String showUpdateForm(@PathVariable("cno") Integer cno, Model model) {
        Customer customer = customerRepository.getReferenceById(cno);
        model.addAttribute("customer", customer);
        return "customer_form"; // Same form is used for update
    }

    // Save or update customer
    @PostMapping("/save_customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
    	customerRepository.save(customer);
        return "redirect:/show_customer_data";
    }
}

package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.app.service.AdminService;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/approveExpense")
    public String approveExpense(@RequestParam("expenseId") Integer expenseId, Model model) {
        adminService.approveExpense(expenseId);
        model.addAttribute("message", "Expense approved successfully!");
        return "redirect:/expenseList";
    }

    @PostMapping("/rejectExpense")
    public String rejectExpense(@RequestParam("expenseId") Integer expenseId, Model model) {
        adminService.rejectExpense(expenseId);
        model.addAttribute("message", "Expense rejected successfully!");
        return "redirect:/expenseList";
    }
}

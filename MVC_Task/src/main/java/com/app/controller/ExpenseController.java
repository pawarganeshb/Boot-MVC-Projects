package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.entity.ExpenseEntity;
import com.app.service.ExpenseService;

@Controller
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/addExpense")
    public String showAddExpensePage() {
        return "addExpense";
    }

    @PostMapping("/addExpense")
    public String saveExpense(@RequestParam("expenseName") String expenseName, 
                              @RequestParam("amount") double amount,
                              @RequestParam("date") String date, 
                              @RequestParam("description") String description, 
                              Model model) {
        try {
            ExpenseEntity expense = new ExpenseEntity();
            expense.setExpenseName(expenseName);
            expense.setAmount(amount);
            expense.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(date)); // Fixed date format
            expense.setDescription(description);
            expenseService.saveExpense(expense);

            model.addAttribute("message", "Expense added successfully!");
        } catch (Exception e) {
            model.addAttribute("message", "Failed to add expense: " + e.getMessage());
        }
        return "addExpense";
    }

    @GetMapping("/expenseList")
    public String getExpenses(Model model) {
        List<ExpenseEntity> expenses = expenseService.getAllExpenses();
        model.addAttribute("expenses", expenses);
        return "expenseList";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/editExpense/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        ExpenseEntity expense = expenseService.getExpenseById(id);
        model.addAttribute("expense", expense);
        return "editExpense";
    }

    @PostMapping("/updateExpense")
    public String updateExpense(@ModelAttribute ExpenseEntity expense, Model model) {
        expenseService.updateExpense(expense);
        model.addAttribute("message", "Expense updated successfully!");
        return "redirect:/expenseList";
    }

    @GetMapping("/deleteExpense/{id}")
    public String deleteExpense(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        try {
            expenseService.deleteExpense(id);
            redirectAttributes.addFlashAttribute("message", "Expense deleted successfully.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Failed to delete expense.");
        }
        return "redirect:/expenseList";
    }
}

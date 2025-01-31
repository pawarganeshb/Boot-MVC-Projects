package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.ExpenseEntity;
import com.app.repository.ExpenseRepository;

@Service
public class AdminService {
    
    @Autowired
    private ExpenseRepository expenseRepository;

    public void approveExpense(Integer expenseId) {
        ExpenseEntity expense = expenseRepository.findById(expenseId).orElseThrow(() -> new RuntimeException("Expense not found"));
        expense.setStatus("Approved");
        expenseRepository.save(expense);
    }

    public void rejectExpense(Integer expenseId) {
        ExpenseEntity expense = expenseRepository.findById(expenseId).orElseThrow(() -> new RuntimeException("Expense not found"));
        expense.setStatus("Rejected");
        expenseRepository.save(expense);
    }
}

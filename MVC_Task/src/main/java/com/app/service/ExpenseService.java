package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.entity.ExpenseEntity;
import com.app.repository.ExpenseRepository;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public void saveExpense(ExpenseEntity expense) {
        expenseRepository.save(expense);
    }

    public List<ExpenseEntity> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public ExpenseEntity getExpenseById(Integer id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public void updateExpense(ExpenseEntity expense) {
        expenseRepository.save(expense); 
    }

    public void deleteExpense(Integer id) {
        expenseRepository.deleteById(id);
    }
}

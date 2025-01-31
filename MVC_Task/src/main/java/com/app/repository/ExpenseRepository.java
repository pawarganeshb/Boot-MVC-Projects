package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ExpenseEntity;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Integer> {
}

package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ExpenseEntity;

public interface AdminRepository extends JpaRepository<ExpenseEntity, Integer> {

}

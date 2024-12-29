package com.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.model.EmployeesEntity;

public interface IEmployeesRepo extends JpaRepository<EmployeesEntity, Integer> {

}

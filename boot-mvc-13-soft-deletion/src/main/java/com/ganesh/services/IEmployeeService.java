package com.ganesh.services;

import java.util.List;

import com.ganesh.model.EmployeesEntity;

public interface IEmployeeService {
	public List<EmployeesEntity> getAllEmployee();

	public String saveRecord(EmployeesEntity employeesEntity);

	public String deleteRecord(int id);

	public EmployeesEntity updateRecord(EmployeesEntity employeesEntity);

	public EmployeesEntity getEmployee(int id);
}
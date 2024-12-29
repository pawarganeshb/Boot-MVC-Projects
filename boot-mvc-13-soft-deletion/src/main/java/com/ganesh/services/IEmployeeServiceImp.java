package com.ganesh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.model.EmployeesEntity;
import com.ganesh.repo.IEmployeesRepo;

@Service("customerService")
public class IEmployeeServiceImp implements IEmployeeService {
	@Autowired
	private IEmployeesRepo employeesRepo;

	@Override
	public List<EmployeesEntity> getAllEmployee() {
		System.out.println("IEmployeeServiceImp.getAllCustomer()");
		return employeesRepo.findAll();
	}

	@Override
	public String saveRecord(EmployeesEntity employeesEntity) {
		System.out.println("IEmployeeServiceImp.saveRecord()");
		return "Employee added with " + employeesRepo.save(employeesEntity).getEmp_id();
	}

	@Override
	public String deleteRecord(int id) {
		System.out.println("IEmployeeServiceImp.deleteRecord()");
		employeesRepo.deleteById(id);
		return "Deleted Reocord ID: " + id;
	}

	@Override
	public EmployeesEntity updateRecord(EmployeesEntity employeesEntity) {
		System.out.println("IEmployeeServiceImp.updateRecord()");
		return employeesRepo.save(employeesEntity);
	}

	@Override
	public EmployeesEntity getEmployee(int id) {
		System.out.println("IEmployeeServiceImp.getEmployee()");
		return employeesRepo.findById(id).orElseThrow(() -> new IllegalArgumentException());
	}

}

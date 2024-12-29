package com.ganesh.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ganesh.model.EmployeesEntity;

@Component
public class Validation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(EmployeesEntity.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		EmployeesEntity employeesEntity = (EmployeesEntity) target;
		if (employeesEntity.getName() == null || employeesEntity.getName().isBlank()) {
			errors.rejectValue("ename", " emp.name.required.");
		} else if (employeesEntity.getName().length() > 5) {
			errors.rejectValue("ename", "Name should be grater than 5.");
		} else if (employeesEntity.getDepartment_id() == 0 || employeesEntity.getDepartment_id() == null) {
			errors.rejectValue("departmentId", "emp.department_id.required");
		} else if (employeesEntity.getSalary() < 10000 || employeesEntity.getSalary() > 20000) {
			errors.rejectValue("salary", "emp.salary.range");
		}
	}

}

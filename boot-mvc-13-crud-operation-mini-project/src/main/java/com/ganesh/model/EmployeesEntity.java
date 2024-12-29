package com.ganesh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "emp")
@AllArgsConstructor
public class EmployeesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_id;

	private String name;
	private Integer department_id;
	private double salary;

	public EmployeesEntity() {
		System.err.println("EmployeesEntity.EmployeesEntity()");
	}

}

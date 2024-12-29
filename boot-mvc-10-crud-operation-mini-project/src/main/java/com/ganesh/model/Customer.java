package com.ganesh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
//	@SequenceGenerator(name = "gen1", initialValue = 1, allocationSize = 1, sequenceName = "customer_seq")
//	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer cno; // Change from String to Integer

	private String camt;
	private String name;
	private String products;
}

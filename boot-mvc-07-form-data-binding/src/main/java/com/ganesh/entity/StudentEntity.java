package com.ganesh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
	private Integer sId;
	private String sName;
	private String sAddress;
	private Float avg;
}

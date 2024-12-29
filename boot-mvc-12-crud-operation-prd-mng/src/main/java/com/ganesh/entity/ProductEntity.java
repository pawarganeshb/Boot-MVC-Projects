package com.ganesh.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;

	@Column(name = "product_name", nullable = false, length = 50)
	private String productName;

	@Column(name = "category", length = 30)
	private String category;

	@Column(name = "price", precision = 10, scale = 2)
	private BigDecimal price;

	@Column(name = "quantity", nullable = true)
	private Integer quantity;

	public ProductEntity() {
		
	}

}

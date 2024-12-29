package com.ganesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.entity.ProductEntity;
import com.ganesh.repo.IProductRepo;

@Service("productService")
public class ProductServiceImp implements IProductService {
	@Autowired
	private IProductRepo productRepo;

	@Override
	public List<ProductEntity> getAllRecord() {
		System.out.println("ProductServiceImp.getAllRecord()");

		return productRepo.findAll();
	}

}

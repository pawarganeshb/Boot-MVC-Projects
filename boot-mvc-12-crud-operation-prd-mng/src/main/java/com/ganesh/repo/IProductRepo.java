package com.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.ProductEntity;

public interface IProductRepo extends JpaRepository<ProductEntity, Integer> {

}

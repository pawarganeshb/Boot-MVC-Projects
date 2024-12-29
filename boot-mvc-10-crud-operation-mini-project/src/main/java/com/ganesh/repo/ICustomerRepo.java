package com.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}

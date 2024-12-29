package com.ganesh.services;

import java.util.List;

import com.ganesh.model.Customer;

public interface ICustomerService {
	public List<Customer> getAllCustomer();

	public String saveRecord(Customer customer);

	public String deleteRecord(int id);

	public boolean updateRecord(Customer customer);
	
	public Customer getReocor(int id);
}

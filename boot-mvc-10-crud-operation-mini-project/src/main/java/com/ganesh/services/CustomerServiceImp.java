package com.ganesh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.model.Customer;
import com.ganesh.repo.ICustomerRepo;

@Service("customerService")
public class CustomerServiceImp implements ICustomerService {
	@Autowired
	private ICustomerRepo customerRepo;

	@Override
	public List<Customer> getAllCustomer() {

		return customerRepo.findAll();
	}

	@Override
	public String saveRecord(Customer customer) {
		customerRepo.save(customer);
		return "Record successfully added!";
	}

	@Override
	public String deleteRecord(int id) {
		customerRepo.deleteById(id);
		return "Record has been deleted!";
	}

	@Override
	public boolean updateRecord(Customer customer) {
		return customerRepo.save(customer) != null ? true : false;
	}

	@Override
	public Customer getReocor(int id) {
		return customerRepo.getReferenceById(id);
	}

}

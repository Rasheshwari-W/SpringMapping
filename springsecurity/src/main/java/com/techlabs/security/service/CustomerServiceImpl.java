package com.techlabs.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.security.entity.Customer;
import com.techlabs.security.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public List<Customer> getAllCustomers() {

		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomerById(int customerId) {
	
		return customerRepo.findById(customerId).orElseThrow(()-> new NullPointerException("Customer Does Not exist"));
	}

}

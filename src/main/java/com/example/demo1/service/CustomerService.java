package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entity.Customer;
import com.example.demo1.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}
	
	public String addCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Customer Added Successfully";
	}

}

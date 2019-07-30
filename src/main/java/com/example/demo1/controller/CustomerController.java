package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entity.Customer;
import com.example.demo1.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/getCustomers")
	public List<Customer> getCostumers() {
		return customerService.getCustomer();
	}

	@PostMapping("/addCustomers")
	public String addCustomers(@RequestBody final Customer customer) {
		return customerService.addCustomer(customer);
	}

}

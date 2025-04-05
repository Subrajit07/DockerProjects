package com.docker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.model.Customer;

@RestController
public class CustomerRest {

	@GetMapping("/data")
	public Customer getCustomerData() {
		Customer cust=new Customer(101, "Deepak hudda", "Pune", 8850057946l);
		return cust;
	}
}

package com.examples.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.customerservice.model.Customer;
import com.examples.customerservice.model.OrderDto;
import com.examples.customeservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> showAll(){
		return service.displayAllCustomer();
}
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
}
	@DeleteMapping("/delete/{cid}")
	public String deletecustomer(@PathVariable("cid") int cid) {
		return service.deleteCustomer(cid);
	
}
	@GetMapping("/customer/{cname}")
	public List<Customer> searchByName(@PathVariable("cname") String customer) {
			return service.searchCustomerByName(customer);
	}
	@GetMapping("/oid/{oid}")
	public List<Customer> searchByOid(@PathVariable("oid") int oid) {
			return service.searchCustomersByOrderId(oid);
	}
	
}	


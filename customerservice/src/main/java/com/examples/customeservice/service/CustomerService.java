package com.examples.customeservice.service;

import com.examples.customerservice.model.Customer;
import com.examples.customerservice.model.OrderDto;

import java.util.List;
public interface CustomerService {

	
	 public String insertCustomer(Customer customer);
	 public List<Customer> displayAllCustomer();
	 public String deleteCustomer(int cid);
	 public List<Customer> searchCustomerByName(String name);
	 public List<Customer> searchCustomersByOrderId(int oid);
	
}

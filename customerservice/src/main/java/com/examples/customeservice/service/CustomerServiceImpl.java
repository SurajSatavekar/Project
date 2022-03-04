package com.examples.customeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examples.customerservice.model.Customer;
import com.examples.customerservice.model.OrderDto;
import com.examples.customerrservice.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	CustomerRepo repo;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	CustomerFeignProxy proxy;
	

	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Customer Added";
	}

	@Override
	public List<Customer> displayAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Post deleted";
	}

	@Override
	public List<Customer> searchCustomerByName(String cname) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByName(cname);
	}

	@Override
	public List<Customer> searchCustomersByOrderId(int oid) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByOrderId(oid);
	}

}

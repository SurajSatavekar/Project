package com.examples.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.orderservice.model.Order;
import com.examples.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/all")
	public List<Order> showAll(){
		return service.displayAllOrder();
	}
	
	@PostMapping("/add")
	public String addOrder(@RequestBody Order orders) {
		return service.insertOrder(orders);
	}
	
	@DeleteMapping("/delete/{oid}")
	public String deleteCustomer(@PathVariable("oid") int oid) {
		return service.deleteOrder(oid);
	}
	@GetMapping("/cid/{cid}")
	public List<Order> searchByCid(@PathVariable("cid") int cid) {
			return service.searchOrderByCustomerId(cid);
	}
}

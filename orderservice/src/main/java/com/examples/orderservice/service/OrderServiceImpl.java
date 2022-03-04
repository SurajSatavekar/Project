package com.examples.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.orderservice.model.Order;
import com.examples.orderservice.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepo repo;

	
	
	@Override
	public String insertOrder(Order orders) {
		// TODO Auto-generated method stub
		repo.save(orders);
		return "order Added";
	}

	@Override
	public List<Order> displayAllOrder() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteOrder(int oid) {
		// TODO Auto-generated method stub
		repo.deleteById(oid);
		return "Order Deleted";
	}

	@Override
	public List<Order> searchOrderByCustomerId(int cid) {
		// TODO Auto-generated method stub
		return repo.searchOrderByCustomerId(cid);
	}

}

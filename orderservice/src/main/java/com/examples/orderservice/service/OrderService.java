package com.examples.orderservice.service;

import java.util.List;

import com.examples.orderservice.model.Order;

public interface OrderService {
	
	public String insertOrder(Order orders);
    public List<Order> displayAllOrder();
    public String deleteOrder(int oid);
	public List<Order> searchOrderByCustomerId(int cid);


}

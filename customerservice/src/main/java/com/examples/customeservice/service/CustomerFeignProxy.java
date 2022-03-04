package com.examples.customeservice.service;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.examples.customerservice.model.OrderDto;

@FeignClient(name="customer-service", url="http://localhost:8082/")
public interface CustomerFeignProxy {
	
	@GetMapping("customer/cid/{cid}")
	public List<OrderDto> findOrderByCid(@PathVariable int cid);

}
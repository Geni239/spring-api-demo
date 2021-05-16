package com.api.demo.services;

import java.util.List;
import com.api.demo.entities.Order;

public interface OrderService {

	List<Order> getAllOrders();
	void addOrder(Order order);
	
}

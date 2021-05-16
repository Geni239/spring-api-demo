package com.api.demo.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.demo.entities.Order;
import com.api.demo.repository.OrderRepo;
import com.api.demo.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepository;

	@Override
	public List<Order> getAllOrders() {
		List<Order> oList = orderRepository.findAll();
		return oList;
	}

	@Override
	public void addOrder(Order order) {
		try {
			this.orderRepository.save(order);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

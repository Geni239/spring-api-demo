package com.api.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.entities.OrderItems;
import com.api.demo.repository.OrderItemsRepo;
import com.api.demo.services.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	OrderItemsRepo itemsRepository;

	@Override
	public List<OrderItems> getAllOrderItems() {
		List<OrderItems> oiList = itemsRepository.findAll();
		return oiList;
	}

	@Override
	public void addNewItems(OrderItems newItem) {
		try {
			this.itemsRepository.save(newItem);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package com.api.demo.services;

import java.util.List;
import com.api.demo.entities.OrderItems;

public interface OrderItemService {

	List<OrderItems> getAllOrderItems();
	void addNewItems(OrderItems newItem);
}

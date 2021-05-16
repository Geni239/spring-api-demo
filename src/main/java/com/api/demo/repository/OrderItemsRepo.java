package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.entities.OrderItems;

public interface OrderItemsRepo extends JpaRepository<OrderItems,Long> {

}

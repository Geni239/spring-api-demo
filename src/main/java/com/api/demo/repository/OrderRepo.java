package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}

package com.mehmed.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.orderservice.model.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails, Long>{

}

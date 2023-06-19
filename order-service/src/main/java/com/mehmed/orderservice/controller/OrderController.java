package com.mehmed.orderservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.orderservice.client.OrderClient;
import com.mehmed.orderservice.constant.AppConstantOrder;
import com.mehmed.orderservice.dto.OrderDto;
import com.mehmed.orderservice.model.OrderDetails;
import com.mehmed.orderservice.service.OrderService;
import com.mehmed.productservice.model.ProductModel;

@RestController
@RequestMapping(value = AppConstantOrder.API_ORDER)
public class OrderController {

	
	private OrderService orderService;

	@Autowired
	OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@Autowired
	private OrderClient orderClient;
	
	@PostMapping(value = AppConstantOrder.PLACE_ORDER)
	public void placeOrder(@RequestBody OrderDto orderDto) {
		orderService.placeOrder(orderDto);
	}

	@GetMapping(value = AppConstantOrder.GET_ALL_ORDER_DETAILS)
	public @ResponseBody List<OrderDetails> getAllOrderDetails() {
		return orderService.getAllOrderDetails();
	}

	@GetMapping(value = AppConstantOrder.GET_PRODUCTS_LIST)
	public @ResponseBody List<ProductModel> getAllProducts(){
		return orderClient.getAllProducts();
	}
}

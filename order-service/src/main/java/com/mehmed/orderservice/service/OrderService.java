package com.mehmed.orderservice.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mehmed.orderservice.dto.EmailDto;
import com.mehmed.orderservice.dto.OrderDto;
import com.mehmed.orderservice.model.OrderDetails;
import com.mehmed.orderservice.model.OrderLineItems;
import com.mehmed.orderservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, EmailDto> kafkaTemplate;
	
	
	private OrderRepository orderRepository;

	@Autowired
	OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public void placeOrder(OrderDto orderDto) {
		List<OrderLineItems> orderLineItemsList = orderDto.getOrderLineItemsList();
		Random random = new Random();
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setOrderNumber((long) random.nextInt(100000, 1000000));
		orderDetails.setOrderLineItemsList(orderLineItemsList);
		
		orderRepository.save(orderDetails);

		/* Creating EmailDto Object : */
		EmailDto emailDto = new EmailDto();
		emailDto.setSubject("Interview Scheduled");
		emailDto.setSenderMailId("arshadalam2010@gmail.com");
		emailDto.setRecipentMailId("arshadalam2099@gmail.com");
		emailDto.setMailBodyContent("Going to Attend the Interview .");
		
		kafkaTemplate.send("emailTemplate", emailDto);
		
		
	}

	public List<OrderDetails> getAllOrderDetails() {
		System.out.println(orderRepository.findAll());
		return orderRepository.findAll();
	}

}

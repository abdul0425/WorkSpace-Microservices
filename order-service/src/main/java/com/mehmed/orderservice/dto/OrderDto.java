package com.mehmed.orderservice.dto;

import java.util.List;

import com.mehmed.orderservice.model.OrderLineItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDto {

	private List<OrderLineItems> orderLineItemsList;
}

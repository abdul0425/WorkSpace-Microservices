package com.mehmed.orderservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.orderservice.constant.AppConstantOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = AppConstantOrder.ORDER_LINE_ITEMS)
public class OrderLineItems {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="order_line_items_id")
	private Long orderLineItemsId;
	@Column(name = "stock_code")
	private Long stockCode;
	private Double price;
	private Long quantity;
}

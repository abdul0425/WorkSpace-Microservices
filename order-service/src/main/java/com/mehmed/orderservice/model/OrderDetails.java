package com.mehmed.orderservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = AppConstantOrder.ORDER_DETAILS)
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	@Column(name = "order_number")
	private Long orderNumber;
	@Column(name = "F_key")
	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderLineItems> orderLineItemsList; 
}

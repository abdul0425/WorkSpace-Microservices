package com.mehmed.productservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDto {

	private String productName;
	private String productDescription;
	private Double productPrice;

}

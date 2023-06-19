package com.mehmed.ekart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {

	private String ProductName;
	private String ProductDesc;
	private String ProductImg;
	private Double ProductSellPrice;
	private Double ProductCostPrice;
	private int StockUnit;
	
	
	
	
}

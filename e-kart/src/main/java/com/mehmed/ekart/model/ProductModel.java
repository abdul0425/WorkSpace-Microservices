package com.mehmed.ekart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductModel implements Serializable{

	@Id
	private int ProductId;
	private String ProductName;
	private String ProductDesc;
	private String ProductImg;
	private Double ProductSellPrice;
	private Double ProductCostPrice;
	private int StockUnit;
	private int createdByUser;
	private Date CreateDate;
	private boolean IsDeleted;
}

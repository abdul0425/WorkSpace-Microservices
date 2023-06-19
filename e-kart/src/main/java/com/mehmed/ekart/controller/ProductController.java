package com.mehmed.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.ekart.constant.AppConstant;
import com.mehmed.ekart.model.ProductModel;
import com.mehmed.ekart.service.ProductService;

@RestController
@RequestMapping(value =AppConstant.PRODUCT_API)
public class ProductController {

	private ProductService productService;
	
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	
	@GetMapping(value =AppConstant.GET_ALL_PRODUCTS)
	public @ResponseBody List<ProductModel> getAllProducts(){
		return productService.getAllProducts();
	}
	
}

package com.mehmed.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.productservice.constant.AppConstantProduct;
import com.mehmed.productservice.dto.ProductDto;
import com.mehmed.productservice.model.ProductModel;
import com.mehmed.productservice.service.ProductService;

@RestController
@RequestMapping(value = AppConstantProduct.API_PRODUCTS)
public class ProductController {

	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	
	@PostMapping(value = AppConstantProduct.CREATE_PRODUCT)
	public void createProduct(@RequestBody ProductDto productDto) {
		productService.createProduct(productDto);
	}
	
	@GetMapping(value = AppConstantProduct.GET_PRODUCTS_LIST)
	public @ResponseBody List<ProductModel> getProductsList() {
		return productService.getProductsList();
	}
}

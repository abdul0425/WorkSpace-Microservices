package com.mehmed.ekart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.ekart.model.ProductModel;
import com.mehmed.ekart.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;
	@Autowired
	ProductService(ProductRepository productRepository){
		this.productRepository = productRepository;
	}
	
	public List<ProductModel> getAllProducts() {
		return productRepository.findAll();
	}

}

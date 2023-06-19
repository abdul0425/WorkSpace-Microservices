package com.mehmed.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.productservice.dto.ProductDto;
import com.mehmed.productservice.model.ProductModel;
import com.mehmed.productservice.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;

	@Autowired
	ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public void createProduct(ProductDto productDto) {
		ProductModel productModel = new ProductModel();
		productModel.setProductName(productDto.getProductName());
		productModel.setProductDescription(productDto.getProductDescription());
		productModel.setProductPrice(productDto.getProductPrice());

		productRepository.save(productModel);

	}

	public List<ProductModel> getProductsList() {
		return productRepository.findAll();
	}

}

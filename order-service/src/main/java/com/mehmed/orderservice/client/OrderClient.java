package com.mehmed.orderservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mehmed.productservice.model.ProductModel;

@FeignClient("PRODUCT-SERVICE")
public interface OrderClient {

	@GetMapping(value = "/api/products/getProductsList")
	public List<ProductModel> getAllProducts();
}

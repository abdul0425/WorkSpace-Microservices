package com.mehmed.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.productservice.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}

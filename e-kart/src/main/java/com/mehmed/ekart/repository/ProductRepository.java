package com.mehmed.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.ekart.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer>{

}

package com.mehmed.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.stockservice.model.StockModel;

public interface StockRepository extends JpaRepository<StockModel, Long>{

	StockModel findByStockId(Long stockId);

}

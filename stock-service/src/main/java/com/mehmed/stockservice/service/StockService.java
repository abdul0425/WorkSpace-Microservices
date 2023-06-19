package com.mehmed.stockservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mehmed.stockservice.dto.StockDto;
import com.mehmed.stockservice.model.StockModel;
import com.mehmed.stockservice.repository.StockRepository;

@Service
public class StockService {

	private StockRepository stockRepository;
	
	StockService(StockRepository stockRepository){
		this.stockRepository = stockRepository;
	}
	
	public void saveStock(StockDto stockDto) {
		StockModel stockModel = new StockModel();
		stockModel.setStockId(stockDto.getStockId());
		stockModel.setStockNumber(stockDto.getStockNumber());
		
		stockRepository.save(stockModel);
		
	}

	public Long findStockNumberByStockId(Long stockId) {
		StockModel stockModel = stockRepository.findByStockId(stockId);
		return stockModel.getStockNumber();
	}

	public List<StockModel> getAllStocks() {
		return stockRepository.findAll();
	}

}

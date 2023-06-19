package com.mehmed.stockservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.stockservice.constant.AppConstantStock;
import com.mehmed.stockservice.dto.StockDto;
import com.mehmed.stockservice.model.StockModel;
import com.mehmed.stockservice.service.StockService;

@RestController
@RequestMapping(value = AppConstantStock.API_STOCK)
public class StockController {

	private StockService stockService;
	
	@Autowired
	StockController(StockService stockService){
		this.stockService = stockService;
	}
	
	@PostMapping(value = AppConstantStock.SAVE_STOCK)
	public void saveStock(@RequestBody StockDto stockDto ) {
		stockService.saveStock(stockDto);
	}
	
	@GetMapping(value = AppConstantStock.FIND_STOCK_NUMBER_BY_STOCK_ID)
	public @ResponseBody Long findStockNumberByStockId(@PathVariable Long stockId) {
		return stockService.findStockNumberByStockId(stockId);
	}
	
	@GetMapping(value = AppConstantStock.GET_ALL_STOCKS)
	public @ResponseBody List<StockModel> getAllStocks() {
		return stockService.getAllStocks();
	}
}

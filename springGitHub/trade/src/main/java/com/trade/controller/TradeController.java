package com.trade.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trade.beans.Trade;
import com.trade.service.TradeService;
import com.trade.service.TradeServiceImpl;

@RestController
public class TradeController {
	
	@Autowired
	TradeService tradeService;
	
	
	
	@GetMapping(value = "/trade")  
	public ResponseEntity<Object> getAllTrade()   
	{  
	//finds all the trade  
	ResponseEntity<Object> trade = tradeService.findAll();  
	//returns the trade list  
	return trade;  
	}  
	
	LocalDate localDate = LocalDate.now();
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	   public ResponseEntity<Object> createTrade(@RequestBody Trade trade) {
		
		ResponseEntity<Object> saveTrade = tradeService.SaveTrade(trade);
		//new Trade(trade.getTradeId(), trade.getVersion(), trade.getCreatedDate(), trade.getMaturityDate(), trade.getExpiredFlag());
		//new Trade("T1", 1, localDate, localDate, "Y");
		return saveTrade;
	   }

	 @RequestMapping(value = "/trade/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Trade trade) { 
		 ResponseEntity<Object> updateTrade = tradeService.UpdateTrade(id,trade);
		
	      return updateTrade;
	   }
	
}

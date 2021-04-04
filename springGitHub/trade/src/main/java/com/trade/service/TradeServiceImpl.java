package com.trade.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trade.beans.Trade;

@Service
public class TradeServiceImpl implements TradeService {
	
	ArrayList<Trade> trade = new ArrayList<Trade>();  
	LocalDate localDate = LocalDate.now();
	private static Map<String, Trade> tradeRepo = new HashMap<>();

	@Override
	public ResponseEntity<Object> findAll() {
		//creating an object of ArrayList  
		
		//adding trade to the List  
		//trade.add(new Trade("T1", 1, localDate, localDate, "Y"));  
		//trade.add(new Trade("T2", 2, localDate, localDate, "Y"));  
		
		//returns a list of trade  
		return new ResponseEntity<>(tradeRepo.values(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> SaveTrade(Trade saveTrade) {
		//new Trade(saveTrade.getTradeId(),saveTrade.getVersion(),saveTrade.getCreatedDate(),saveTrade.getMaturityDate(),saveTrade.getExpiredFlag());
		//if(saveTrade.getVersion() )
		tradeRepo.put(saveTrade.getTradeId(), saveTrade);
		return new ResponseEntity<>("Trade is created successfully", HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Object> UpdateTrade(String id, Trade trade) {
		tradeRepo.remove(id);
		trade.setTradeId(id);
		tradeRepo.put(id, trade);
		return new ResponseEntity<>("Trade is updated successfully", HttpStatus.OK);
	}
	
	

}

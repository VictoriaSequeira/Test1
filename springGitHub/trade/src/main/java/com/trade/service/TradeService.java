package com.trade.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.trade.beans.Trade;

public interface TradeService {
	
	ResponseEntity<Object> findAll();

	ResponseEntity<Object> SaveTrade(Trade trade);

	ResponseEntity<Object> UpdateTrade(String id, Trade trade); 

}

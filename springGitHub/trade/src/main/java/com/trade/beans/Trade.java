package com.trade.beans;

import java.time.LocalDate;
import java.util.Date;

public class Trade {

	String tradeId;
	int version;
	LocalDate maturityDate;
	LocalDate createdDate;
	String expiredFlag;
	//CounterParty countrerParty;
	//Booking booking;
	
	
	public Trade(String tradeId, int version, LocalDate maturityDate, LocalDate createdDate, String expiredFlag) {
		super();
		this.tradeId = tradeId;
		this.version = version;
		this.maturityDate = maturityDate;
		this.createdDate = createdDate;
		this.expiredFlag = expiredFlag;
	}
	public String getTradeId() {
		return tradeId;
	}
	public int getVersion() {
		return version;
	}
	public LocalDate getMaturityDate() {
		return maturityDate;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public String getExpiredFlag() {
		return expiredFlag;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public void setExpiredFlag(String expiredFlag) {
		this.expiredFlag = expiredFlag;
	}
	/*
	 * public CounterParty getCountrerParty() { return countrerParty; } public
	 * Booking getBooking() { return booking; } public void
	 * setCountrerParty(CounterParty countrerParty) { this.countrerParty =
	 * countrerParty; } public void setBooking(Booking booking) { this.booking =
	 * booking; }
	 */
}

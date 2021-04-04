package com.trade;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.trade.controller.TradeController;

@SpringBootTest
class TradeApplicationTests {
	@Autowired
	TradeController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

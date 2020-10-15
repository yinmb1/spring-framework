package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {

	@Autowired
	private OrderService orderService;

	public OrderService getOrderService() {
		return orderService;
	}
}

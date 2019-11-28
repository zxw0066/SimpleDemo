package com.demo.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令类
 * @author zhaoxingwu
 *
 */
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
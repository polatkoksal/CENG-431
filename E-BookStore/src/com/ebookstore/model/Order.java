package com.ebookstore.model;

import com.ebookstore.controller.OrderStatus;

public class Order {

	private Integer id;
	private Integer customerId;
	private Title title;
	private OrderStatus orderStatus;

	public Order(Title title, OrderStatus orderStatus) {
		this.title = title;
		this.orderStatus = orderStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}

package com.ebookstore.model;

import java.util.ArrayList;

public class Customer {

	private Integer id;
	private String name;
	private String surname;
	private Integer credit;
	private ArrayList<Order> orders;
	private Integer orderIdCount = 1;

	public Customer(String name, String surname, Integer credit) {
		this.name = name;
		this.surname = surname;
		this.credit = credit;
		orders = new ArrayList<Order>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public void addOrder(Order order) {
		if (order.getTitle().getPrice() <= credit) {
			order.setId(orderIdCount);
			orderIdCount++;
			order.setCustomerId(id);
			this.orders.add(order);
			credit -= order.getTitle().getPrice();
		}
	}

}

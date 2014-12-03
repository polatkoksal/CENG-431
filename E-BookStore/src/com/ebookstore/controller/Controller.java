package com.ebookstore.controller;

import java.util.ArrayList;

import com.ebookstore.model.Customer;
import com.ebookstore.model.Order;
import com.ebookstore.model.Title;

public class Controller {

	private ArrayList<Customer> customers;
	private ArrayList<Title> titles;
	private Customer currentCustomer;

	public Controller() {
		customers = new ArrayList<Customer>();
		titles = new ArrayList<Title>();
		init();
	}

	private void init() {
		// Write all necc inits.
	}

	public Boolean validateAdmin(String name, String surname) {
		Boolean result = false;
		if ("admin".equals(name) && "admin".equals(surname)) {
			result = true;
		}
		return result;
	}

	public Customer validateCustomer(String name, String surname) {
		Customer result = null;
		for (Customer c : customers) {
			if (c.getName().equals(name) && c.getSurname().equals(surname)) {
				result = c;
				currentCustomer = c;
			}
		}
		return result;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	public void updateCustomer(Customer customer) {
		for (Customer c : customers) {
			if (c.getId() == customer.getId()) {
				c.setName(customer.getName());
				c.setSurname(customer.getSurname());
				c.setCredit(customer.getCredit());
			}
		}
	}

	public void addTitle(Title title) {
		titles.add(title);
	}

	public void removeTitle(Title title) {
		titles.remove(title);
	}

	public void updateTitle(Title title) {
		for (Title t : titles) {
			if (t.getId() == title.getId()) {
				t = title;
			}
		}
	}

	public void updateOrderStatus(Order order) {
		for (Customer c : customers) {
			if (c.getId() == order.getCustomerId()) {
				for (Order o : c.getOrders()) {
					if (o.getId() == order.getId()) {
						o = order;
					}
				}
			}
		}
	}

	public ArrayList<String> getStatus() {
		OrderStatus[] orders = OrderStatus.values();
		ArrayList<String> states = new ArrayList<String>();

		for (int i = 0; i < orders.length; i++) {
			states.add(orders[i].name());
		}

		return states;
	}

}

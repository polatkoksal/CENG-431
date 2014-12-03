package com.ebookstore.model;

import com.ebookstore.controller.OrderStatus;

public class Title {

	private Integer id;
	private String title;
	private String desc;
	private Integer price;

	public Title(String title, String desc, Integer price) {
		this.title = title;
		this.desc = desc;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}

package com.ebookstore.model;

public class Software extends Title {

	private String area;

	public Software(String title, String desc, Integer price, String area) {
		super(title, desc, price);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String type) {
		this.area = type;
	}

}

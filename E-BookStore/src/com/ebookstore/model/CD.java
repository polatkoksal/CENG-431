package com.ebookstore.model;

public class CD extends Title {

	private String kind;

	public CD(String title, String desc, Integer price, String kind) {
		super(title, desc, price);
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}

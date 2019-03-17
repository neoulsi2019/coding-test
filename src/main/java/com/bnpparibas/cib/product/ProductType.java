package com.bnpparibas.cib.product;

public enum ProductType {
	APPLE("Apple"), ORANGE("Orange"), WATERMELON("Watermelon");
	private String name;

	private ProductType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

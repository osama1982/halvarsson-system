package com.halvarsson.models;

public enum ItemSizes {
	
	SMALL ("Small"),
	MEDIUM ("Medium"),
	LARGE ("Large");
	
	private final String name;
	
	ItemSizes(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}

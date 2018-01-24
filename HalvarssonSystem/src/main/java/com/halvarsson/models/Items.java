package com.halvarsson.models;

import javax.persistence.Entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Items {
	
	private static int nextId = 1;
	private int id;
	
	@NotNull
	@Size(min = 3, max= 30, message = "Must be 3 characters at least")
	private String name;
	
	private String desc;
	
	@NotNull
	@Min(value = 0, message = "Price cannont be lower than zero")
	private double price;
	
	private ItemSizes itemSize;
	
	public ItemSizes getItemSize() {
		return itemSize;
	}

	public void setItemSize(ItemSizes itemSize) {
		this.itemSize = itemSize;
	}

	public Items() {
		id = nextId;
		nextId++;
	}
	
	public Items(String name, String desc, double price) {
		this();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}

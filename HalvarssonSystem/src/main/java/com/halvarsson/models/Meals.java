package com.halvarsson.models;

public class Meals {
	
	private Items item;
	private ItemSizes size;
	private int quantity;
	private double price;
	
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public ItemSizes getSize() {
		return size;
	}
	public void setSize(ItemSizes size) {
		this.size = size;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

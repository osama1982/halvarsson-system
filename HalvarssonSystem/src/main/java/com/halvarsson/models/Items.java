package com.halvarsson.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="maincourses")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mc_id")
	private int id;
	
	@NotNull
	@Size(min = 3, max= 30, message = "Must be 3 characters at least")
	@Column(name="mc_name")
	private String name;
	
	@Column(name="mc_desc")
	private String desc;
	
	private Categories category;
	
	@NotNull
	@Min(value = 0, message = "Price cannont be lower than zero")
	@Column(name="mc_price")
	private double price;
	
	public Items() {}
	
	public Items(String name, String desc, ItemSizes itemSize, double price) {
		this.name = name;
		this.desc = desc;
		this.price = price;
		//this.itemSize = itemSize;
	}
	
	public int getId() {
		return id;
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
	
	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}
	
	public String toString() {
		return String.format("Item: [id=%d, Name='%s', Description='%s' , Price='%d']", 
				id, name, desc, price);
		
	}
	
//	@Column(name="mc_itemSize")
//	private ItemSizes itemSize;
//	
//	public ItemSizes getItemSize() {
//		return itemSize;
//	}
//
//	public void setItemSize(ItemSizes itemSize) {
//		this.itemSize = itemSize;
//	}

}

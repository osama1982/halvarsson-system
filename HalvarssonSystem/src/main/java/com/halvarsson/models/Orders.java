package com.halvarsson.models;

import java.util.Date;

public class Orders {

	private int id;
	private Tables table;
	private Meals mainCourse;
	private Meals sideDish;
	private Meals dessert;
	private Meals drink;
	private String notes;
	private double totalPrice;
	private boolean ordIsDoneStatus;
	private Date ordTimeStamp;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tables getTable() {
		return table;
	}
	public void setTable(Tables table) {
		this.table = table;
	}
	public Meals getMainCourse() {
		return mainCourse;
	}
	public void setMainCourse(Meals mainCourse) {
		this.mainCourse = mainCourse;
	}
	public Meals getSideDish() {
		return sideDish;
	}
	public void setSideDish(Meals sideDish) {
		this.sideDish = sideDish;
	}
	public Meals getDessert() {
		return dessert;
	}
	public void setDessert(Meals dessert) {
		this.dessert = dessert;
	}
	public Meals getDrink() {
		return drink;
	}
	public void setDrink(Meals drink) {
		this.drink = drink;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isOrdIsDoneStatus() {
		return ordIsDoneStatus;
	}
	public void setOrdIsDoneStatus(boolean ordIsDoneStatus) {
		this.ordIsDoneStatus = ordIsDoneStatus;
	}
	public Date getOrdTimeStamp() {
		return ordTimeStamp;
	}
	public void setOrdTimeStamp(Date ordTimeStamp) {
		this.ordTimeStamp = ordTimeStamp;
	}
	

}

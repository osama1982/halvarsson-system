package com.halvarsson.models;

public class Orders {
	
	private int ordId;
	private int tableId;
	private Items mainCourse;
	private int mainCourseQty;
	private Items sideDish;
	private int sideDishQty;
	private Items dessert;
	private int dessertQty;
	private Items drink;
	private int drinkQty;
	private boolean ordStatus;
	//private Date ordTime;
	// private double ordTotalPrice
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public Items getMainCourse() {
		return mainCourse;
	}
	public void setMainCourse(Items mainCourse) {
		this.mainCourse = mainCourse;
	}
	public int getMainCourseQty() {
		return mainCourseQty;
	}
	public void setMainCourseQty(int mainCourseQty) {
		this.mainCourseQty = mainCourseQty;
	}
	public Items getSideDish() {
		return sideDish;
	}
	public void setSideDish(Items sideDish) {
		this.sideDish = sideDish;
	}
	public int getSideDishQty() {
		return sideDishQty;
	}
	public void setSideDishQty(int sideDishQty) {
		this.sideDishQty = sideDishQty;
	}
	public Items getDessert() {
		return dessert;
	}
	public void setDessert(Items dessert) {
		this.dessert = dessert;
	}
	public int getDessertQty() {
		return dessertQty;
	}
	public void setDessertQty(int dessertQty) {
		this.dessertQty = dessertQty;
	}
	public Items getDrink() {
		return drink;
	}
	public void setDrink(Items drink) {
		this.drink = drink;
	}
	public int getDrinkQty() {
		return drinkQty;
	}
	public void setDrinkQty(int drinkQty) {
		this.drinkQty = drinkQty;
	}
	public boolean isOrdStatus() {
		return ordStatus;
	}
	public void setOrdStatus(boolean ordStatus) {
		this.ordStatus = ordStatus;
	}
	

}

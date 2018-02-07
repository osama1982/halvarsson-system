 package com.halvarsson.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name="categories")
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name="catId")
	private int catId;
	
	@NotNull
	//@Column(name="catName")
	private String catName;
	
	@OneToMany
	@JoinColumn(name = "category_id")
	private List<Items> items = new ArrayList<>();
	
	public Categories() {}

	public Categories(String catName) {
		this.catName = catName;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	public List<Items> getItems() {
		return items;
	}

}

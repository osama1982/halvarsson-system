/*package com.halvarsson.services;

import java.util.ArrayList;

import com.halvarsson.models.Items;

public class ItemsServices {
	
	static ArrayList<Items> items = new ArrayList<>();
	
	// Get all items
	public static ArrayList<Items> getAllItems(){
		return items;
	}
	
	//add item
	public static void addItem(Items newItem) {
		items.add(newItem);
	}
	
	//get item by ID 
	public static Items getItemById(int targetId) {
		Items targetItem = null;
		for(Items item : items) {
			if(item.getId() == targetId) {
				targetItem = item;
			}
		}
		return targetItem;
	}
	
	//remove
	public static void removeItem(int targetId) {
		Items itemToRemove = getItemById(targetId);
		if (itemToRemove != null) {
			items.remove(itemToRemove);
		}
		
	}
	
}
*/
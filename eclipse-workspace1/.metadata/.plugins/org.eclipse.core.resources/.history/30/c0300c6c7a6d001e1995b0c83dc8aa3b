package com.model;
 
import java.util.ArrayList;
import java.util.HashMap;
 
public class Cart {
	HashMap<Integer,Item> item = new HashMap<>();
	public void addIteam(Item obj) {
		item.put(obj.getProductId(),obj);
	}
	public void emptyCart() {
		item.clear();
	}
	public void removeItem(int productId) {
		item.remove(productId);
	}
 
}
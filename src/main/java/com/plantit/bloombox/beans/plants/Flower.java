package com.plantit.bloombox.beans.plants;

import java.util.Map;

public class Flower extends Plant {
	
	private int petalCount;
	private String color;
	private String fragrance;
	private boolean isEdible;
	 
	public int getPetalCount() {
		return petalCount;
	}
	public void setPetalCount(int petalCount) {
		this.petalCount = petalCount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFragrance() {
		return fragrance;
	}
	
	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}
	public boolean isEdible() {
		return isEdible;
	}
	public void setEdible(boolean isEdible) {
		this.isEdible = isEdible;
	}
	public Flower(Long id, String plantDescription, String plantName, Map<String, Long> prices, String images,
			Integer stockQuantity) {
		super(id, plantDescription, plantName, prices, images, stockQuantity);
		// TODO Auto-generated constructor stub
	}
	

}

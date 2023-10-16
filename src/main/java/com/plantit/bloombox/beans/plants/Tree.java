package com.plantit.bloombox.beans.plants;

import java.util.Map;

public class Tree extends Plant {
	
	    private double trunkDiameter; 
	    private String barkTexture;  
	    private int age;              
	    private String fruitType;     
	    
	    public double getTrunkDiameter() {
			return trunkDiameter;
		}
		public Tree(String id, String plantDescription, String plantName, Map<String, Long> prices, String images,
				Integer stockQuantity, double trunkDiameter, String barkTexture, int age, String fruitType,
				String woodType) {
			super(id, plantDescription, plantName, prices, images, stockQuantity);
			this.trunkDiameter = trunkDiameter;
			this.barkTexture = barkTexture;
			this.age = age;
			this.fruitType = fruitType;
			this.woodType = woodType;
		}
		public void setTrunkDiameter(double trunkDiameter) {
			this.trunkDiameter = trunkDiameter;
		}
		public String getBarkTexture() {
			return barkTexture;
		}
		public void setBarkTexture(String barkTexture) {
			this.barkTexture = barkTexture;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getFruitType() {
			return fruitType;
		}
		public void setFruitType(String fruitType) {
			this.fruitType = fruitType;
		}
		public String getWoodType() {
			return woodType;
		}
		public void setWoodType(String woodType) {
			this.woodType = woodType;
		}
		private String woodType; 
		
		
		public static class Builder extends PlantsBuilder{
			
			
		}

}

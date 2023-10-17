package com.plantit.bloombox.beans.plants;

import java.util.Map;

import com.plantit.bloombox.beans.plants.Fern.FernBuilder;

public class Tree extends Plant {
	
	    private double trunkDiameter; 
	    private String barkTexture;  
	    private int age;              
	    private String fruitType;     
	    
	    public double getTrunkDiameter() {
			return trunkDiameter;
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
		
		
		
		public static class TreeBuilder extends PlantBuilder {
			private double trunkDiameter; 
		    private String barkTexture;  
		    private int age;              
		    private String fruitType;
		    private String plantDescription;
			private String plantName;		
			private Double price;		
			private String images;
			private Integer stockQuantity;
			
			
			
			public TreeBuilder setTrunkDiameter(double trunkDiameter) {
				this.trunkDiameter = trunkDiameter;
				return this;
			}
			public TreeBuilder setBarkTexture(String barkTexture) {
				this.barkTexture = barkTexture;
				return this;
			}
			public TreeBuilder setAge(int age) {
				this.age = age;
				return this;
			}
			public TreeBuilder setFruitType(String fruitType) {
				this.fruitType = fruitType;
				return this;
			}
			
			public TreeBuilder setPlantDescription(String description) {		
				this.plantDescription = description;
				return this;
			}
			
			public TreeBuilder setPlantName(String name) {		
				this.plantName = name;
				return this;
			}
			
			public TreeBuilder setPrice(Double price) {		
				this.price = price;
				return this;
			}
			
			public TreeBuilder setImages(String images) {		
				this.images = images;
				return this;
			}
			
			public TreeBuilder setStock(Integer stock) {
				this.stockQuantity = stock;
				return this;
			}
			
			public Tree build() {
				
				Tree tree = new Tree();
				tree.setAge(age);
				tree.setBarkTexture(barkTexture);
				tree.setFruitType(fruitType);
				tree.setTrunkDiameter(trunkDiameter);
				tree.setPlantDescription(plantDescription);
				tree.setPlantName(plantName);
				tree.setPrices(price);
				tree.setStockQuantity(stockQuantity);
				tree.setImages(images);
				return tree;
		}
		    
		    
		}

}

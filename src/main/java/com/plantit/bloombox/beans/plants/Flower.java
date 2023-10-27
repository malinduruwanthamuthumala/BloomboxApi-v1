package com.plantit.bloombox.beans.plants;

import java.util.Map;

import com.plantit.bloombox.beans.plants.Cactus.CactusBuilder;
import com.plantit.bloombox.beans.plants.Fern.FernBuilder;
import com.plantit.bloombox.enums.PlantTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
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
	
	
	
	public static class FlowerBuilder extends PlantBuilder {
		private int petalCount;
		private String color;
		private String fragrance;
		private boolean isEdible;
		private String plantDescription;
		private String plantName;		
		private Double price;		
		private String images;
		private Integer stockQuantity;
		private PlantTypes type;
	    
	    
		public FlowerBuilder setType(PlantTypes type) {
			this.type = type;
			return this;
		}
		
		public FlowerBuilder setPetalCount(int petalCount) {
			this.petalCount = petalCount;
			return this;
		}
		
		public FlowerBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public FlowerBuilder setFragrance(String fragrance) {
			this.fragrance = fragrance;
			return this;
		}
		
		public FlowerBuilder setIsEdible(boolean isEdible) {
			this.isEdible = isEdible;
			return this;
		}
		
		public FlowerBuilder setPlantDescription(String description) {		
			this.plantDescription = description;
			return this;
		}
		
		public FlowerBuilder setPlantName(String name) {		
			this.plantName = name;
			return this;
		}
		
		public FlowerBuilder setPrice(Double price) {		
			this.price = price;
			return this;
		}
		
		public FlowerBuilder setImages(String images) {		
			this.images = images;
			return this;
		}
		
		public FlowerBuilder setStock(Integer stock) {
			this.stockQuantity = stock;
			return this;
		}
		
		public  Flower build() {
			
			Flower flower = new Flower();
			flower.setColor(color);
			flower.setEdible(isEdible);
			flower.setFragrance(fragrance);
			flower.setPetalCount(petalCount);
			flower.setImages(images);
			flower.setFragrance(fragrance);
			flower.setPlantDescription(plantDescription);
			flower.setPrices(price);
			flower.setStockQuantity(stockQuantity);
			flower.setType(type);
			return flower;
			
		}
	}

}

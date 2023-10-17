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
	
	
	
	public class FlowerBuilder extends PlantBuilder {
		private int petalCount;
		private String color;
		private String fragrance;
		private boolean isEdible;
		
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
		
		public Flower build() {
			
			Plant plant = super.build();
			Flower flower = (Flower)plant;
			flower.setColor(color);
			flower.setEdible(isEdible);
			flower.setFragrance(fragrance);
			flower.setPetalCount(petalCount);
			return flower;
			
		}
	}

}

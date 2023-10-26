package com.plantit.bloombox.beans.plants;

import java.util.Map;

import com.plantit.bloombox.beans.plants.Plant.PlantBuilder;

import jakarta.persistence.Entity;

@Entity
public class Cactus extends Plant {
	
	private boolean isSpiky;
    private String spikyType;
    private boolean hasFlowers;
    
	
	public boolean isSpiky() {
		return isSpiky;
	}
	
	public void setSpiky(boolean isSpiky) {
		this.isSpiky = isSpiky;
	}
	public String getSpikyType() {
		return spikyType;
	}
	public void setSpikyType(String spikyType) {
		this.spikyType = spikyType;
	}
	public boolean isHasFlowers() {
		return hasFlowers;
	}
	public void setHasFlowers(boolean hasFlowers) {
		this.hasFlowers = hasFlowers;
	}
    
    
	public static class CactusBuilder extends PlantBuilder {
		
		private boolean isSpiky;
	    private String spikyType;
	    private boolean hasFlowers;		
		private String plantDescription;
		private String plantName;		
		private Double price;		
		private String images;
		private Integer stockQuantity;
	    
	    
	    public CactusBuilder setIsSpiky(boolean isSpiky) {
	    	this.isSpiky = isSpiky;
	    	return this;
	    }
	    
	    public CactusBuilder setSpiKyType(String spikyType) {
	    	this.spikyType = spikyType;
	    	return this;
	    }
		
	    public CactusBuilder setHasFlowers(boolean hasFlowers) {
	    	this.hasFlowers = hasFlowers;
	    	return this;
	    }
	    
	    public CactusBuilder setPlantDescription(String description) {		
			this.plantDescription = description;
			return this;
		}
		
		public CactusBuilder setPlantName(String name) {		
			this.plantName = name;
			return this;
		}
		
		public CactusBuilder setPrice(Double price) {		
			this.price = price;
			return this;
		}
		
		public CactusBuilder setImages(String images) {		
			this.images = images;
			return this;
		}
		
		public CactusBuilder setStock(Integer stock) {
			this.stockQuantity = stock;
			return this;
		}
		
	    
	    public Cactus build() {
	        Cactus cactus = new Cactus();
	        cactus.setHasFlowers(hasFlowers);
	        cactus.setSpiky(isSpiky);
	        cactus.setSpikyType(spikyType);
	        cactus.setImages(images);
	        cactus.setPlantName(plantName);
	        cactus.setPrices(price);
	        cactus.setStockQuantity(stockQuantity);
	        cactus.setPlantDescription(plantDescription);;
	        return cactus;
	    }
		
	}

}

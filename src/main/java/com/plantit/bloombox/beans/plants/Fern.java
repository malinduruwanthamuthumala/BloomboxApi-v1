package com.plantit.bloombox.beans.plants;

import java.util.Map;

import com.plantit.bloombox.beans.plants.Cactus.CactusBuilder;

public class Fern extends Plant {
	
	private boolean isIndigenous;
    private String habitat;
    private boolean hasSpores;
    
	
	public boolean isIndigenous() {
		return isIndigenous;
	}
	public void setIndigenous(boolean isIndigenous) {
		this.isIndigenous = isIndigenous;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public boolean isHasSpores() {
		return hasSpores;
	}
	public void setHasSpores(boolean hasSpores) {
		this.hasSpores = hasSpores;
	}
	
	public  static class FernBuilder extends PlantBuilder {
		
		private boolean isIndigenous;
	    private String habitat;
	    private boolean hasSpores;
	    private String plantDescription;
		private String plantName;		
		private Double price;		
		private String images;
		private Integer stockQuantity;
		
	    
		public FernBuilder setIndigenous(boolean isIndigenous) {
			this.isIndigenous = isIndigenous;
			return this;
		}
		public FernBuilder setHabitat(String habitat) {
			this.habitat = habitat;
			return this;
		}
		public FernBuilder setHasSpores(boolean hasSpores) {
			this.hasSpores = hasSpores;
			return this;
		}
		
		public FernBuilder setPlantDescription(String description) {		
			this.plantDescription = description;
			return this;
		}
		
		public FernBuilder setPlantName(String name) {		
			this.plantName = name;
			return this;
		}
		
		public FernBuilder setPrice(Double price) {		
			this.price = price;
			return this;
		}
		
		public FernBuilder setImages(String images) {		
			this.images = images;
			return this;
		}
		
		public FernBuilder setStock(Integer stock) {
			this.stockQuantity = stock;
			return this;
		}
	    
		public Fern build() {
			;
			Fern fern = new Fern();
			
			fern.setHabitat(habitat);
			fern.setHasSpores(hasSpores);
			fern.setIndigenous(isIndigenous);
			fern.setPlantName(plantName);
			fern.setImages(images);
			fern.setPlantDescription(plantDescription);
			fern.setStockQuantity(stockQuantity);
			fern.setPrices(price);
			return fern;
		}
	    
		
	}

	
	

}

package com.plantit.bloombox.beans.plants;

import java.util.Map;

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
	public Fern(String id, String plantDescription, String plantName, Map<String, Long> prices, String images,
			Integer stockQuantity) {
		super(id, plantDescription, plantName, prices, images, stockQuantity);
		// TODO Auto-generated constructor stub
	}
	
	

}

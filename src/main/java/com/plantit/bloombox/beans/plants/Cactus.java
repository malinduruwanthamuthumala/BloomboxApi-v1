package com.plantit.bloombox.beans.plants;

import java.util.Map;

public class Cactus extends Plant {
	
	private boolean isSpiky;
    private String spikyType;
    private boolean hasFlowers;
    
	
	public boolean isSpiky() {
		return isSpiky;
	}
	public Cactus(String id, String plantDescription, String plantName, Map<String, Long> prices, String images,
			Integer stockQuantity) {
		super(id, plantDescription, plantName, prices, images, stockQuantity);
		
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
    
    

}

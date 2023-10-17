package com.plantit.bloombox.beans.plants;

import java.util.Map;

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
    
    
	public class CactusBuilder extends PlantBuilder {
		
		private boolean isSpiky;
	    private String spikyType;
	    private boolean hasFlowers;
	    
	    public CactusBuilder setIsSpiky(boolean isSpiky) {
	    	this.isSpiky = isSpiky;
	    	return this;
	    }
	    
	    public CactusBuilder setspiKyType(String spikyType) {
	    	this.spikyType = spikyType;
	    	return this;
	    }
		
	    public CactusBuilder setHasFlowers(boolean hasFlowers) {
	    	this.hasFlowers = hasFlowers;
	    	return this;
	    }
	    
	    public Cactus build() {
	    	Plant plant = super.build();
	        Cactus cactus = (Cactus)plant;
	        cactus.setHasFlowers(hasFlowers);
	        cactus.setSpiky(isSpiky);
	        cactus.setSpikyType(spikyType);
	        return cactus;
	    }
		
	}

}

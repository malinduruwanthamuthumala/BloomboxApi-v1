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
	
	public  class FernBuilder extends PlantBuilder {
		
		private boolean isIndigenous;
	    private String habitat;
	    private boolean hasSpores;
		
	    
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
	    
		public Fern build() {
			Plant plant = super.build();
			Fern fern = (Fern)plant;
			
			fern.setHabitat(habitat);
			fern.setHasSpores(hasSpores);
			fern.setIndigenous(isIndigenous);
			return fern;
		}
	    
		
	}

	
	

}

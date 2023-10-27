package com.plantit.bloombox.beans.plants;

import java.util.HashMap;
import java.util.Map;

import com.plantit.bloombox.enums.PlantSize;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

@Embeddable
public class sizeDetail {
	
	@ElementCollection
	private Map<PlantSize,Double> sizeMap = new HashMap<> ();

	public Map<PlantSize, Double> getSizeMap() {
		return sizeMap;
	}

	public void setSizeMap(Map<PlantSize, Double> sizeMap) {
		this.sizeMap = sizeMap;
	}
	
}

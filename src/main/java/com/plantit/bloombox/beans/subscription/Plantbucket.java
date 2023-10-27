package com.plantit.bloombox.beans.subscription;

import java.util.Map;

import com.plantit.bloombox.beans.plants.IdSupport;
import com.plantit.bloombox.beans.plants.Plant;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Plantbucket  {

	
	@ElementCollection
	private Map<Plant,Integer> PurchasedQuantities;

	public Map<Plant, Integer> getPurchasedQuantities() {
		return PurchasedQuantities;
	}

	public void setPurchasedQuantities(Map<Plant, Integer> purchasedQuantities) {
		PurchasedQuantities = purchasedQuantities;
	}

	
}

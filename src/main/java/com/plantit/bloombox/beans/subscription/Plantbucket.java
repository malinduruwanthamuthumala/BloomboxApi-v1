package com.plantit.bloombox.beans.subscription;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.plantit.bloombox.beans.plants.IdSupport;
import com.plantit.bloombox.beans.plants.Plant;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Plantbucket  {

	@JsonProperty
	@ElementCollection
	private Map<String,Integer> PurchasedQuantities;

	public Map<String, Integer> getPurchasedQuantities() {
		return PurchasedQuantities;
	}

	public void setPurchasedQuantities(Map<String, Integer> purchasedQuantities) {
		PurchasedQuantities = purchasedQuantities;
	}

	
}

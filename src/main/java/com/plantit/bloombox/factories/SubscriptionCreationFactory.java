package com.plantit.bloombox.factories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.beans.subscription.Plantbucket;
import com.plantit.bloombox.beans.subscription.Subscription;
import com.plantit.bloombox.dto.SubscriptionDTO;
import com.plantit.bloombox.exceptions.PlantNotFoundException;
import com.plantit.bloombox.repository.PlantRepository;

@Component
public class SubscriptionCreationFactory {
	
	@Autowired
	PlantRepository plantRepository;
	
	public Optional<Subscription> createSubscription(SubscriptionDTO subscriptionDTO){
		
		Subscription subscription = new Subscription();
		
		subscription.setInvoiceId(subscriptionDTO.getInvoiceId());
		subscription.setTotalPrice(subscriptionDTO.getTotalPrice());
		subscription.setType(subscriptionDTO.getType());
		subscription.setPlantList(retrievePlantsByPlantIds(subscriptionDTO.getPlantList()));
		subscription.setBucket(createPlantBucket(subscriptionDTO.getBucket()));
		
		return Optional.of(subscription);
		
	}
	

	private List<Plant> retrievePlantsByPlantIds(List<Long> plantIds) {
	    List<Plant> plantList = new ArrayList<>();

	    for (Long plantId : plantIds) {
	        Optional<Plant> optionalPlant = plantRepository.findById(plantId);
	        
	        if (optionalPlant.isPresent()) {
	            plantList.add(optionalPlant.get());
	        } else {
	            throw new PlantNotFoundException("plant requested cannot be found");
	        }
	    }

	    return plantList;
	}
	
	private Plantbucket createPlantBucket(Plantbucket bucket) {
		Plantbucket bucketObj = new Plantbucket();
		if(bucket != null) {
			Map<String,Integer> purchasedQuantities = bucket.getPurchasedQuantities();
			HashMap<String,Integer> purchasedQuantitiesToHashMap = new HashMap<>(purchasedQuantities);
			bucketObj.setPurchasedQuantities(purchasedQuantitiesToHashMap);
			return bucketObj;
		}		
		return null;
		
	}
}

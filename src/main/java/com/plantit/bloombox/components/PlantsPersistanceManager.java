package com.plantit.bloombox.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.plantit.bloombox.beans.plants.Plant;

@Component
public class PlantsPersistanceManager {
	
	private static List<Plant>  plantList= new ArrayList<>();
	private static Map<String, Long> prices = new HashMap<>();
	 
	static {
		 	prices.put("Small", 10L);
	        prices.put("Medium", 20L);
	        prices.put("Large", 30L);

	        // Add instances of Plant to the list using the constructor
	        plantList.add(new Plant(1L, "Description 1", "Plant 1", prices, "image1.jpg", 100));
	        plantList.add(new Plant(2L, "Description 2", "Plant 2", prices, "image2.jpg", 150));
	        plantList.add(new Plant(3L, "Description 3", "Plant 3", prices, "image3.jpg", 200));
	}

 public  List<Plant> getPlantsList() {
	 return plantList;
 }
 


 public void save(Plant plant) {
	plantList.add(plant);
	
 }
	


 

}

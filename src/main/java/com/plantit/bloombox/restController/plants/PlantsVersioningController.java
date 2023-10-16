package com.plantit.bloombox.restController.plants;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.components.PlantsPersistanceManager;

public class PlantsVersioningController {

	@Autowired
	PlantsPersistanceManager prManager;
	
	@RequestMapping("/v1/flowePlant")
	public List<Plant> getAllPlants(){
		return prManager.getPlantsList();
	}
	
	@RequestMapping(path="/v1/flowePlant",params="version=1")
	public List<Plant> getAllPlants1(){
		return prManager.getPlantsList();
	}
	
	@RequestMapping(path="/v1/flowePlant", headers = "X-API-VERSION=1")
	public List<Plant> getAllPlants2(){
		return prManager.getPlantsList();
	}
	
	@RequestMapping(path="/v1/flowePlant", produces = "application/vnd.sd")
	public List<Plant> getAllPlants4(){
		return prManager.getPlantsList();
	}
}

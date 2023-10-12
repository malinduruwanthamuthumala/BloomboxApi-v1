package com.plantit.bloombox.restController.plants;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.plantit.bloombox.beans.HelloWorld;
import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.components.PlantsPersistanceManager;
import com.plantit.bloombox.exceptions.PlantNotFoundException;

@RestController
public class PlantsController {

	@Autowired
	PlantsPersistanceManager prManager;
	
	@RequestMapping("/plant")
	public List<Plant> getAllPlants(){
		return prManager.getPlantsList();
	}
	
	@RequestMapping(path ="/plant/{id1}")
	public Plant getFIlteredPlant(@PathVariable String id1){
		
		String identifirer = id1;
		Predicate<? super Plant> predicate = (plant) -> {
			return identifirer.equals(plant.getId());
		};
		
		Optional<Plant> searchedPlant =  prManager.getPlantsList().stream().filter(predicate).findFirst();
		return searchedPlant.orElseThrow(()-> new PlantNotFoundException("plant item you requested cannot be found"));
	}
	
	@PostMapping("/plant")
	public ResponseEntity<Plant> CreatePlant(@RequestBody Plant plant) {
		prManager.save(plant);		
		//returning back the uri of the created user
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(plant.getId())
				.toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping(path = "/plant/{id}")
	public void deletePlant(@PathVariable String id) {
		prManager.deleteById(id);
	}
	
  
}

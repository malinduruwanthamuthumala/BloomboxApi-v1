package com.plantit.bloombox.restController.plants;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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

import com.plantit.bloombox.beans.plants.Cactus;
import com.plantit.bloombox.beans.plants.Fern;
import com.plantit.bloombox.beans.plants.Flower;
import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.beans.plants.Tree;
import com.plantit.bloombox.components.PlantsPersistanceManager;
import com.plantit.bloombox.enums.PlantTypes;
import com.plantit.bloombox.exceptions.PlantNotFoundException;
import com.plantit.bloombox.factories.PlantCreationFactory;
import com.plantit.bloombox.repository.PlantRepository;

import jakarta.validation.Valid;

@RestController
public class PlantsControllerv2 {
	
	@Autowired 
	PlantRepository repository;
	
	@Autowired
	PlantsPersistanceManager prManager;
	
	@Autowired PlantCreationFactory factory;
	
	@GetMapping("/v2/plant")
	public List<Plant> getAllPlants(){
		return repository.findAll();
	}
	
	@RequestMapping(path ="/v2/plant/{id1}")
	public Plant getFIlteredPlant(@PathVariable long id1){
		
		Optional<Plant> plant = repository.findById(id1);
		
		if(plant.isPresent()) {
			return plant.get();
		} else {
			throw new PlantNotFoundException("Plant you requested cannot be found");
		}
		
	}
	
	@PostMapping("/v2/cactus")
	public ResponseEntity<Cactus> CreateCactus(@Valid  @RequestBody Cactus plant ) {
		Long id = null ;
		Optional<Plant> p = factory.createPlant(PlantTypes.CACTUS.getValue() , plant);
		if(p.isPresent()) {
			repository.save(p.get());
			id = p.get().getId();
		}					
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.replacePath("/v2/plant/{id}") 
				.buildAndExpand(id)
				.toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PostMapping("/v2/fern")
	public ResponseEntity<Fern> CreateFern(@Valid  @RequestBody Fern plant ) {
		
		Optional<Plant> p = factory.createPlant(PlantTypes.FERN.getValue(), plant);
		if(p.isPresent()) {
			repository.save(p.get());	
		}					
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(plant.getId())
				.toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PostMapping("/v2/flower")
	public ResponseEntity<Flower> CreateFlower(@Valid  @RequestBody Flower plant ) {
		
		Optional<Plant> p = factory.createPlant(PlantTypes.FLOWER.getValue(), plant);
		if(p.isPresent()) {
			repository.save(p.get());	
		}					
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(plant.getId())
				.toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PostMapping("/v2/tree")
	public ResponseEntity<Tree> CreateTree(@Valid  @RequestBody Tree plant ) {
		
		Optional<Plant> p = factory.createPlant(PlantTypes.TREE.getValue(), plant);
		if(p.isPresent()) {
			repository.save(p.get());	
		}					
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(plant.getId())
				.toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping(path = "v2/plant/{id}")
	public void deletePlant(@PathVariable long id) {
		repository.deleteById(id);
	}
	

	

}

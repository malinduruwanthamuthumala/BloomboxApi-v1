package com.plantit.bloombox.restController.subscription;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.plantit.bloombox.beans.plants.Cactus;
import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.beans.subscription.Subscription;
import com.plantit.bloombox.dto.SubscriptionDTO;
import com.plantit.bloombox.factories.SubscriptionCreationFactory;
import com.plantit.bloombox.repository.SubscriptionRepository;

import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

@RestController
public class SubsController {
	
	@Autowired
	SubscriptionCreationFactory subFactory;
	
	@Autowired
	SubscriptionRepository repo;
	
	@PostMapping("/v2/subscription")
	public ResponseEntity<Subscription> createSubscription(@Valid @RequestBody SubscriptionDTO subscriptionDTO) {
	    Optional<Subscription> subscription = subFactory.createSubscription(subscriptionDTO);
	    
	    if (subscription.isPresent()) {
	        Subscription savedSubscription = repo.save(subscription.get());
	        URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest()
	                .path("/{id}")
	                .buildAndExpand(savedSubscription.getId())
	                .toUri();
	        return ResponseEntity.created(location).body(savedSubscription);
	    } else {
	        // Handle the case where subscription creation failed, e.g., return a 400 Bad Request response.
	        return ResponseEntity.badRequest().build();
	    }
	}
	
	@GetMapping("/v2/subscription")
	public List<Subscription> getAllPlants(){
		return repo.findAll();
	}

}

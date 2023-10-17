package com.plantit.bloombox.restController.plants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.plantit.bloombox.factories.PlantCreationFactory;

@RestController
public class PlantsControllerv2 {
	
	@Autowired
	PlantCreationFactory factory;

}

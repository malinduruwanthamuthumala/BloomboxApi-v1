package com.plantit.bloombox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantit.bloombox.beans.plants.Plant;

public interface PlantRepository  extends JpaRepository<Plant,Long>{
	
	

}

package com.plantit.bloombox.factories;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.plantit.bloombox.beans.plants.Cactus;
import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.beans.plants.Cactus.CactusBuilder;
import com.plantit.bloombox.beans.plants.Fern;
import com.plantit.bloombox.beans.plants.Flower;
import com.plantit.bloombox.beans.plants.Plant.PlantBuilder;
import com.plantit.bloombox.beans.plants.Tree;
import com.plantit.bloombox.enums.PlantTypes;

@Component
public class PlantCreationFactory {
	
	
	
	public Optional<Plant> createPlant (String type,Plant plant) {
		if (PlantTypes.CACTUS.getValue().equals(type)) {
			Cactus c = (Cactus)plant;
			Cactus cactus = new Cactus.CactusBuilder()
					.setHasFlowers(c.isHasFlowers())
					.setSpiKyType(c.getSpikyType())
					.setIsSpiky(c.isSpiky())
					.setImages(c.getImages())
					.setPlantDescription(c.getPlantDescription())
					.setPrice(c.getPrices())		
					.setPlantName(c.getPlantName())
					.setStock(c.getStockQuantity())
					.setType(PlantTypes.CACTUS)
					.build();
			return Optional.of(cactus);
		}		
		if (PlantTypes.FERN.getValue().equalsIgnoreCase(type)) {
			Fern f = (Fern)plant;
			Fern fern = new Fern.FernBuilder()
					.setHabitat(f.getHabitat())
					.setHasSpores(f.isHasSpores())
					.setIndigenous(f.isIndigenous())
					.setPlantDescription(f.getPlantDescription())
					.setPlantName(f.getPlantName())
					.setStock(f.getStockQuantity())
					.setImages(f.getImages())
					.setType(PlantTypes.FERN)
					.build();
			return Optional.of(fern);
			
		}
		if (PlantTypes.FLOWER.getValue().equalsIgnoreCase(type)) {
			Flower fl = (Flower)plant;
			Flower flower = new Flower.FlowerBuilder()
					.setColor(fl.getColor())
					.setFragrance(fl.getFragrance())
					.setImages(fl.getImages())
					.setIsEdible(fl.isEdible())
					.setPetalCount(fl.getPetalCount())
					.setPlantDescription(fl.getPlantDescription())
					.setPlantName(fl.getPlantName())
					.setImages(fl.getImages())
					.setPrice(fl.getPrices())
					.setStock(fl.getStockQuantity())
					.setType(PlantTypes.FLOWER)
					.build();
			return Optional.of(flower);
		}
		if(PlantTypes.TREE.getValue().equalsIgnoreCase(type)) {
			Tree t = (Tree)plant;
			Tree tree = new Tree.TreeBuilder()
					.setAge(t.getAge())
					.setBarkTexture(t.getBarkTexture())
					.setFruitType(t.getFruitType())
					.setTrunkDiameter(t.getTrunkDiameter())
					.setImages(t.getImages())
					.setPlantDescription(t.getPlantDescription())
					.setPlantName(t.getPlantName())
					.setPrice(t.getPrices())
					.setStock(t.getStockQuantity())
					.setType(PlantTypes.TREE)
					.build();
			return Optional.of(tree);
	
		}
		return Optional.empty();
	}

}


package com.plantit.bloombox.enums;

public enum PlantTypes {
	TREE("Tree"),
	FERN("Fern"),
	FLOWER("Flower"),
	CACTUS("Cactus");
	
	

	private final String displayName;
	
	PlantTypes(String name) {
		this.displayName = name;
	}
	
	public String getDisplayName() {
		return displayName;
	}

}

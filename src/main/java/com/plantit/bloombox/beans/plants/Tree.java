package com.plantit.bloombox.beans.plants;

import java.util.Map;

public class Tree extends Plant {
	
	    private double trunkDiameter; 
	    private String barkTexture;  
	    private int age;              
	    private String fruitType;     
	    
	    public double getTrunkDiameter() {
			return trunkDiameter;
		}
		
		public void setTrunkDiameter(double trunkDiameter) {
			this.trunkDiameter = trunkDiameter;
		}
		public String getBarkTexture() {
			return barkTexture;
		}
		public void setBarkTexture(String barkTexture) {
			this.barkTexture = barkTexture;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getFruitType() {
			return fruitType;
		}
		public void setFruitType(String fruitType) {
			this.fruitType = fruitType;
		}
		public String getWoodType() {
			return woodType;
		}
		public void setWoodType(String woodType) {
			this.woodType = woodType;
		}
		private String woodType; 
		
		
		
		public class TreeBuilder extends PlantBuilder {
			private double trunkDiameter; 
		    private String barkTexture;  
		    private int age;              
		    private String fruitType;
			
			
			public TreeBuilder setTrunkDiameter(double trunkDiameter) {
				this.trunkDiameter = trunkDiameter;
				return this;
			}
			public TreeBuilder setBarkTexture(String barkTexture) {
				this.barkTexture = barkTexture;
				return this;
			}
			public TreeBuilder setAge(int age) {
				this.age = age;
				return this;
			}
			public TreeBuilder setFruitType(String fruitType) {
				this.fruitType = fruitType;
				return this;
			}
			
			public Tree build() {
				Plant plant = super.build();
				Tree tree = (Tree)plant;
				tree.setAge(age);
				tree.setBarkTexture(barkTexture);
				tree.setFruitType(fruitType);
				tree.setTrunkDiameter(trunkDiameter);
				
				return tree;
		}
		    
		    
		}

}

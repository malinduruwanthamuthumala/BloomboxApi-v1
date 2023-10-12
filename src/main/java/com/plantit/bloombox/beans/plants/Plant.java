package com.plantit.bloombox.beans.plants;

import java.util.Map;
import java.util.Objects;

public class Plant implements IdSupport{
	
	
	private String id;
	private String plantDescription;
	private String plantName;
	private Map<String,Long> prices;
	private String images;
	private Integer stockQuantity;
		
	public String getPlantDescription() {
		return plantDescription;
	}
	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public Map<String, Long> getPrices() {
		return prices;
	}
	
	
	public void setPrices(Map<String, Long> prices) {
		this.prices = prices;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Integer getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	@Override
	public String getId() {		
		return this.id;
	}
	@Override
	public void setId(String uniqueId) {
	  this.id = uniqueId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, images, plantDescription, plantName, prices, stockQuantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		return Objects.equals(id, other.id) && Objects.equals(images, other.images)
				&& Objects.equals(plantDescription, other.plantDescription)
				&& Objects.equals(plantName, other.plantName) && Objects.equals(prices, other.prices)
				&& Objects.equals(stockQuantity, other.stockQuantity);
	}
	
	@Override
	public String toString() {
		return "Plant [id=" + id + ", plantDescription=" + plantDescription + ", plantName=" + plantName + ", prices="
				+ prices + ", images=" + images + ", stockQuantity=" + stockQuantity + "]";
	}
	
	public Plant(String id, String plantDescription, String plantName, Map<String, Long> prices, String images,
			Integer stockQuantity) {
		super();
		this.id = id;
		this.plantDescription = plantDescription;
		this.plantName = plantName;
		this.prices = prices;
		this.images = images;
		this.stockQuantity = stockQuantity;
	}

	
	


}

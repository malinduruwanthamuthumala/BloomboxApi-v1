package com.plantit.bloombox.beans.plants;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.plantit.bloombox.beans.subscription.Subscription;
import com.plantit.bloombox.enums.PlantTypes;

import jakarta.annotation.Generated;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Plant implements IdSupport{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String plantDescription;
	
	@Embedded
	private sizeDetail sizes;
	
	@Size(min=2,message = "Name should have at least two charachters")
	private String plantName;
	
	private Double price;
	
	private String images;
	
	@ManyToMany(mappedBy="plantList")
	@Fetch(FetchMode.JOIN)
	private List<Subscription> subList;
	
	@Enumerated(EnumType.STRING)
	private PlantTypes type;
	
	@NotNull
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
	public Double getPrices() {
		return price;
	}
	
	
	public void setPrices(Double prices) {
		this.price = prices;
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
	public Long getId() {		
		return this.id;
	}
	@Override
	public void setId(Long uniqueId) {
	  this.id = uniqueId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, images, plantDescription, plantName, price, stockQuantity);
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
				&& Objects.equals(plantName, other.plantName) && Objects.equals(price, other.price)
				&& Objects.equals(stockQuantity, other.stockQuantity);
	}
	
	@Override
	public String toString() {
		return "Plant [id=" + id + ", plantDescription=" + plantDescription + ", plantName=" + plantName + ", prices="
				+ price + ", images=" + images + ", stockQuantity=" + stockQuantity + "]";
	}
	
	
	public static class PlantBuilder {
					//no-op
	}
	
	public Double getPrice() {
		return price;
	}
	public PlantTypes getType() {
		return type;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setType(PlantTypes type) {
		this.type = type;
	}

}

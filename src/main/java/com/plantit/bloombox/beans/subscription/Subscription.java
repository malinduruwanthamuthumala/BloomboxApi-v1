package com.plantit.bloombox.beans.subscription;

import java.util.List;
import java.util.Map;

import com.plantit.bloombox.beans.plants.IdSupport;
import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.enums.SubscriptionType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Subscription implements IdSupport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private long invoiceId;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Plant> plantList;
	
	@Embedded
	private Plantbucket bucket;
	
	private double totalPrice;
	
	@Enumerated(EnumType.STRING)
	private SubscriptionType type;
	

	@Override
	public Long getId() {
	return id;	
	}

	@Override
	public void setId(Long uniqueId) {
		this.id = uniqueId;
		
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public List<Plant> getPlantList() {
		return plantList;
	}

	public Plantbucket getBucket() {
		return bucket;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public void setPlantList(List<Plant> plantList) {
		this.plantList = plantList;
	}

	public void setBucket(Plantbucket bucket) {
		this.bucket = bucket;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}

package com.plantit.bloombox.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.plantit.bloombox.beans.subscription.Plantbucket;
import com.plantit.bloombox.enums.SubscriptionType;

import jakarta.persistence.Embedded;

import java.util.List;

public class SubscriptionDTO {

	@JsonProperty
    private long invoiceId;
	@JsonProperty
    private List<Long> plantList;
	
	
	@Embedded
	@JsonProperty
    private Plantbucket bucket;
	
	@JsonProperty
    private double totalPrice;
	
	@JsonProperty
    private SubscriptionType type;

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public List<Long> getPlantList() {
        return plantList;
    }

    public void setPlantList(List<Long> plantList) {
        this.plantList = plantList;
    }

    public Plantbucket getBucket() {
        return bucket;
    }

    public void setBucket(Plantbucket bucket) {
        this.bucket = bucket;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setPlantbucketTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }
}

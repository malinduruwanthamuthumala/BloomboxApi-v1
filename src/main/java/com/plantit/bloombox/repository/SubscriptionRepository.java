package com.plantit.bloombox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantit.bloombox.beans.plants.Plant;
import com.plantit.bloombox.beans.subscription.Subscription;

public interface SubscriptionRepository  extends JpaRepository<Subscription,Long>{

}

package com.subscription.client.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subscription.client.subscription.model.Subscription;



@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}

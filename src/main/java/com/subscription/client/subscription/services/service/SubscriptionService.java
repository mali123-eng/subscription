package com.subscription.client.subscription.services.service;

import org.springframework.stereotype.Service;

import com.subscription.client.subscription.model.Subscription;



@Service
public interface SubscriptionService {
public Subscription save(Subscription subscription);
}

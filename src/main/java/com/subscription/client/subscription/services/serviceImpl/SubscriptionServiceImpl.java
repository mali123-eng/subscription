package com.subscription.client.subscription.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subscription.client.subscription.model.Subscription;
import com.subscription.client.subscription.repository.SubscriptionRepository;
import com.subscription.client.subscription.services.service.SubscriptionService;



@Service
public class SubscriptionServiceImpl implements SubscriptionService {
@Autowired
SubscriptionRepository subscriptionRepository;
	@Override
	public Subscription save(Subscription subscription) {
		
		return subscriptionRepository.save(subscription);
	}

}

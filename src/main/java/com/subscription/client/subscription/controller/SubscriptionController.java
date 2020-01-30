package com.subscription.client.subscription.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.subscription.client.request.dto.TokenRequest;
import com.subscription.client.security.JwtAuthenticationToken;
import com.subscription.client.subscription.model.Mail;
import com.subscription.client.subscription.model.Subscription;
import com.subscription.client.subscription.services.service.SubscriptionService;



@RestController
public class SubscriptionController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	SubscriptionService subscriptionService;
	@Autowired
	private JwtAuthenticationToken jwtAuthenticationToken;
	@PostMapping(value = "/rest/save")
	public void save(@RequestBody Subscription subscription) {
		Subscription savedSubscription=subscriptionService.save(subscription);
		/*
		 * if(savedSubscription!=null) { final String uri =
		 * "http://localhost:9090/email"; Mail mail = new Mail();
		 * mail.setMailFrom("abc@gmail.com");
		 * mail.setMailTo(savedSubscription.getEmail());
		 * mail.setMailSubject("Spring Boot - Email Example"); mail.
		 * setMailContent(" Email service using Spring Boot!!!\n\nThanks\nwww.demo.com"
		 * ); HttpHeaders headers = new HttpHeaders();
		 * headers.setContentType(MediaType.APPLICATION_JSON); HttpEntity<Mail> entity =
		 * new HttpEntity<>(mail, headers); RestTemplate restTemplate = new
		 * RestTemplate(); restTemplate.postForObject(uri, entity, Mail.class);
		 * 
		 * }
		 */
	}
	@CrossOrigin(origins="*")
	   @RequestMapping(value = "/token", method = RequestMethod.POST)
	   public void getToken(@RequestBody TokenRequest tokenRequest) {
		   try {
			   LOG.info("TokenRequest get Token");
			   // update client 
			   jwtAuthenticationToken.setToken(tokenRequest.getToken());
			   
		   }catch(Exception ex) {
			   ex.printStackTrace();
			  
		   }
	   }

}

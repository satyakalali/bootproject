package com.boot.project.healthindicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("razorpay")
public class RazorPayHealthIndicator implements HealthIndicator {
	@Value("${razorpay.url}")
	private String razorPayUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Health health() {
		ResponseEntity<String> response = null;

		try {
			response = restTemplate.getForEntity(razorPayUrl, String.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return Health.up().build();
			}
		} catch (Exception t) {
			return Health.down(t).build();
		}
		return Health.outOfService().build();
	}
}

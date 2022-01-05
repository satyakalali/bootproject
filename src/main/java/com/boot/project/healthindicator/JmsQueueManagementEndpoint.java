package com.boot.project.healthindicator;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "jmsQueue")
public class JmsQueueManagementEndpoint {
	@ReadOperation
	public int length(String queueName) {
		System.out.println("length queueName : " + queueName);
		return 20;
	}

	@WriteOperation
	public boolean pause(String queueName) {
		System.out.println("pause queueName : " + queueName);
		return true;
	}

	@DeleteOperation
	public boolean disable(String queueName) {
		System.out.println("disable queueName : " + queueName);
		return true;
	}
}
package com.boot.project.events;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicatoinFaiedEventListner implements ApplicationListener<ApplicationFailedEvent> {

	@Override
	public void onApplicationEvent(ApplicationFailedEvent event) {
		
		System.out.println("6. Application Faied event."+event.getException().getCause().getMessage());
	}

}

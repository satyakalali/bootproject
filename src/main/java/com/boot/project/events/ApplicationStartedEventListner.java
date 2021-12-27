package com.boot.project.events;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartedEventListner implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		int beanDefinitionCount = event.getApplicationContext().getBeanDefinitionCount();

		System.out.println("4. Application started event. Bean Definition Count " + beanDefinitionCount);
	}

}

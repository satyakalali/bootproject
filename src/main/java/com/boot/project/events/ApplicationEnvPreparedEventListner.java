package com.boot.project.events;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEnvPreparedEventListner implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		String bikeName = event.getEnvironment().getProperty("bike_name");
		System.out.println("2. Env Prepared Event "+bikeName);
	}

}

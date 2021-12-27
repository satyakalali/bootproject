package com.boot.project.events;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import com.boot.project.customyml.Employee;

public class ApplicationReadyEventListner implements ApplicationListener<ApplicationReadyEvent> {

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

		Employee emp = event.getApplicationContext().getBean(Employee.class);
		System.out.println("5. Applicatoin Ready Event. "+emp);
	}

}

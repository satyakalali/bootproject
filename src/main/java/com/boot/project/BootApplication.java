package com.boot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootApplication.class, args);

		VogoBike bike = context.getBean(VogoBike.class);
		System.out.println(bike);
	}

}

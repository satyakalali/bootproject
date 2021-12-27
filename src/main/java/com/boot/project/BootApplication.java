package com.boot.project;

import java.io.FileNotFoundException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.project.bike.VogoBike;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootApplication.class, args);
		VogoBike bike = context.getBean(VogoBike.class);
		System.out.println(bike);
		int exit = SpringApplication.exit(context);
		System.out.println(exit);
	}

	//@Bean
	public CommandLineRunner commandLineRunner() {

		return (args) -> {
			throw new FileNotFoundException("C:/satya.txt not found.");
		};
	}
}

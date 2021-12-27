package com.boot.project;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.project.bike.VogoBike;
import com.boot.project.model.VogoBikeModel;
import com.boot.project.service.VogoService;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootApplication.class, args);
		VogoService vogoService = context.getBean(VogoService.class);
		List<VogoBikeModel> fetchBikes = vogoService.fetchBikes();
		fetchBikes.forEach(bike -> System.out.println(bike));
		int exit = SpringApplication.exit(context);
		System.out.println(exit);
	}

	// @Bean
	public CommandLineRunner commandLineRunner() {

		return (args) -> {
			throw new FileNotFoundException("C:/satya.txt not found.");
		};
	}
}

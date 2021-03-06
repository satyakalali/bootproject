package com.boot.project;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.boot.project.autoconfig.IrctcBookTicket;
import com.boot.project.bike.VogoBike;
import com.boot.project.customyml.Employee;
import com.boot.project.customyml.YmlPropertySourceLoader;
import com.boot.project.events.ApplicationEnvPreparedEventListner;
import com.boot.project.events.ApplicationPreparedEventListner;
import com.boot.project.events.ApplicationReadyEventListner;
import com.boot.project.events.ApplicationStartedEventListner;
import com.boot.project.events.ApplicationStartingEventListner;
import com.boot.project.events.ApplicatoinFaiedEventListner;
import com.boot.project.model.VogoBikeModel;
import com.boot.project.service.VogoService;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		/*
		 * ApplicationContext context =
		 * SpringApplication.run(BootApplication.class, args); VogoService
		 * vogoService = context.getBean(VogoService.class); List<VogoBikeModel>
		 * fetchBikes = vogoService.fetchBikes(); fetchBikes.forEach(bike ->
		 * System.out.println(bike)); int exit =
		 * SpringApplication.exit(context); System.out.println(exit);
		 * 
		 * Employee employee = context.getBean(Employee.class);
		 * System.out.println(employee);
		 */

		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(BootApplication.class);
		ApplicationContext context = applicationBuilder
				.listeners(new ApplicatoinFaiedEventListner(), new ApplicationReadyEventListner(),
						new ApplicationPreparedEventListner(), new ApplicationStartedEventListner(),
						new ApplicationEnvPreparedEventListner(), new ApplicationStartingEventListner())
				.initializers(new YmlPropertySourceLoader()).build().run(args);
		/*
		 * Employee employee = context.getBean(Employee.class);
		 * System.out.println(employee);
		 */

		IrctcBookTicket bookTicket = context.getBean(IrctcBookTicket.class);
		System.out.println(bookTicket.bookOrder("satya"));
	}

	// @Bean
	public CommandLineRunner commandLineRunner() {

		return (args) -> {
			throw new FileNotFoundException("C:/satya.txt not found.");
		};
	}

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}
}

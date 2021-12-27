package com.boot.project.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SKCommandLineRunners implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		for (String arg : args) {
			System.out.println(arg);
		}
	}

}

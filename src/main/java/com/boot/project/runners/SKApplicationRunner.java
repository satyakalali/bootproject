package com.boot.project.runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SKApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> nonOptionArgs = args.getNonOptionArgs();
		nonOptionArgs.forEach(s -> System.out.println("non Option: "+s));
		Set<String> optionNames = args.getOptionNames();
		optionNames.forEach(name -> System.out.println("Option: "+name+","+args.getOptionValues(name)));
	}

}

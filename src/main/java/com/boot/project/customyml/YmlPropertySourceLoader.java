package com.boot.project.customyml;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.PropertySource;

public class YmlPropertySourceLoader implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
		try {
			List<PropertySource<?>> propertySources = loader.load("employee",
					applicationContext.getResource("classpath:employee.yml"));
			propertySources.forEach(ps -> {
				applicationContext.getEnvironment().getPropertySources().addLast(ps);
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

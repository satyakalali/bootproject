package com.boot.project.customyml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties
/// @PropertySource(value = "classpath:employee.yml", factory =
/// YmlPropertySourceFactory.class)
public class Employee {
	private int emp_id;
	private String empName;
}

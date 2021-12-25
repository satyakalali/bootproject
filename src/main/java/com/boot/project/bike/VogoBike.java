package com.boot.project.bike;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties
public class VogoBike {

	private int vogo_id;
	private String bike_name;
}

package com.boot.project.bike;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class VogoBike {

	private int vogo_id;
	private String bike_name;
}

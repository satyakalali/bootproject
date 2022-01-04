package com.boot.project.healthindicator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.info.InfoContributor;

@Component
public class BootAcuatorInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("application.name", "boot actuator").withDetail("author", "sriman")
				.withDetail("version", "1.0").build();
	}

}
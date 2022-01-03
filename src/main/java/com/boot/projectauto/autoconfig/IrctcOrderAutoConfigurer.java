package com.boot.projectauto.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boot.project.autoconfig.IrctcOrder;

@Configuration
@ConditionalOnClass(value=IrctcOrder.class)
public class IrctcOrderAutoConfigurer {
	@Bean
	public IrctcOrder irctcOrder() {
		return new IrctcOrder();
	}
}

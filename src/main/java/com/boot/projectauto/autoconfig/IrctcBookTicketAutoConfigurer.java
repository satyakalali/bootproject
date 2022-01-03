package com.boot.projectauto.autoconfig;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boot.project.autoconfig.IrctcBookTicket;
import com.boot.project.autoconfig.IrctcOrder;

@Configuration
//@ConditionalOnBean(name = "irctcOrder")
//@ConditionalOnProperty(name="autoconfiureenable")
@ConditionalOnWebApplication
@AutoConfigureAfter(value = IrctcOrderAutoConfigurer.class)
public class IrctcBookTicketAutoConfigurer {
	@Bean
	public IrctcBookTicket irctcBookTicket(IrctcOrder irctcOrder) {
		return new IrctcBookTicket(irctcOrder);
	}
}

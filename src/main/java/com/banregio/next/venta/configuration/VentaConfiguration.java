package com.banregio.next.venta.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class VentaConfiguration {

	@Bean
	Logger.Level feignLoggerLevel() {return Logger.Level.FULL;}
}

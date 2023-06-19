package com.mehmed.profile.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mehmed.profile")
public class AppConfigure {

	@Value("${spring.message}")
	private String message;
}

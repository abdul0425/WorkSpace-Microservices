package com.mehmed.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("int")
@RestController
@RequestMapping(value = "/api")
public class ProfileController {

	@Value("${spring.message}")
	private String message;
	
	@GetMapping(value = "/message")
	public String getMessage() {
		return message;
	}
}

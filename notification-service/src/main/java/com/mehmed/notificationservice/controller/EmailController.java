package com.mehmed.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.notificationservice.constant.AppConstantEmail;
import com.mehmed.notificationservice.dto.EmailDto;
import com.mehmed.notificationservice.service.EmailService;

@RestController
@RequestMapping(value = AppConstantEmail.EMAIL)
public class EmailController {

	private EmailService emailService;
	@Autowired
	public EmailController(EmailService emailService) {
		this.emailService = emailService;
	}
	
	@PostMapping(value = AppConstantEmail.SEND_EMAIL)
	public Boolean sendEmail(@RequestBody EmailDto emailDto) {
		return emailService.sendEmail(emailDto);
	}
}

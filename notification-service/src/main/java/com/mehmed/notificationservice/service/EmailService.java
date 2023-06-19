package com.mehmed.notificationservice.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mehmed.notificationservice.dto.EmailDto;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	/* Based on Event Listener , For listening itself we use this annotation . */
	@KafkaListener(topics = "emailTemplate", groupId = "emailId")
	public void handleEmailNotification(EmailDto emailDto) {
		sendEmail(emailDto);
	}

	public Boolean sendEmail(EmailDto emailDto) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(emailDto.getSenderMailId());
			message.setTo(emailDto.getRecipentMailId());
			message.setSubject(emailDto.getSubject());
			message.setText(emailDto.getMailBodyContent());
			message.setSentDate(new Date());

			javaMailSender.send(message);
			System.out.println("Email Sent Successfully !");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}

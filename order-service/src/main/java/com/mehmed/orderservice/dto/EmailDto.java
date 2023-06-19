package com.mehmed.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailDto {

	private String senderMailId;
	private String recipentMailId;
	private String subject;
	private String mailBodyContent;
}

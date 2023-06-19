package com.mehmed.ekart.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

	private String firstName;
	private String lastName;
	private String email;
	private Date dateOfBirth;
	
}

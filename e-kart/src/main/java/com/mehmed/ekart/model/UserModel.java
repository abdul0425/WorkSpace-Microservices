package com.mehmed.ekart.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel  implements Serializable{


	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private Date dateOfBirth;
}

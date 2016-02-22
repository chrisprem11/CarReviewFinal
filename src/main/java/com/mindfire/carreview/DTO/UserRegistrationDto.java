package com.mindfire.carreview.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * This is a DTO class for the user registration.
 * @author mindfire
 *
 */
public class UserRegistrationDto {
	
	private Long user_id;
	
	@NotNull @Size(min=4,max=10)
	private String firstname;
	
	@NotNull @Size(min=3,max=10)
	private String lastname;
	
	@NotNull @Email
	private String email;
	
	@NotNull @Size(min=3,max=10)
	private String username;
	
	@NotNull @Size(min=4,max=10)
	private String password;

	/**
	 * No-arg constructor
	 */
	
	/**
	 * This a argumented constructor that hold the values to be stored.
	 */
	public UserRegistrationDto() {
	}

	public UserRegistrationDto(String firstname, String lastname, String email, String username, String password) {
		
		this.firstname = firstname;
		
		this.lastname = lastname;
		
		this.email = email;
		
		this.username = username;
		
		this.password = password;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

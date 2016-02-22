package com.mindfire.carreview.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * This class is a persistent class for the users.
 * @author mindfire
 *
 */
@Entity
@Table(name = "userdetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
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
	
	private String privilege;

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

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "Person [user_id=" + user_id + ", name=" + firstname + " " + lastname + ", username=" + email + "]";
	}

}

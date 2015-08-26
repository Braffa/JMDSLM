package com.braffa.sellem.model.xml.webserviceobjects.authentication;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "registeredUser")
public class RegisteredUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;

	private String firstname;

	private String lastname;
	
	private Login login;

	private String telephone;
	
	private Date crDate;
	
	private Date updDate;
	
	public RegisteredUser() {

	}

	public RegisteredUser(String email,
			String firstname, String lastname,
			String telephone, Login login) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Date getCrDate() {
		return crDate;
	}

	public void setCrDate(Date crDate) {
		this.crDate = crDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}
	
	public String toString () {
		return email + " "
		 + firstname + " "
		 +  lastname + " "
		 +  login.toString() + " "
		 +  telephone + " "
		 + crDate + " "
		 + updDate;
	}

}

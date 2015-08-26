package com.braffa.sellem.model.xml.authentication;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.braffa.sellem.model.hbn.entity.Login;
import com.braffa.sellem.model.hbn.entity.RegisteredUser;

@XmlRootElement(namespace = "com.braffa.sellem.model.xml.authentication.XmlRegisteredUserMsg" )
@XmlType(propOrder = { "crDate", "email", "firstname", "lastname", "login", "telephone", "updDate"})
public class XmlRegisteredUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;

	private String firstname;

	private String lastname;

	private String telephone;

	private Login login;

	private Date crDate;

	private Date updDate;

	public XmlRegisteredUser() {

	}

	public XmlRegisteredUser(RegisteredUser registeredUser) {

		this.email = registeredUser.getEmail();
		this.firstname = registeredUser.getFirstname();
		this.lastname = registeredUser.getLastname();
		this.telephone = registeredUser.getTelephone();
		this.login = new Login();
		this.login.setUserId(registeredUser.getUserId()); 
		this.crDate = registeredUser.getCrDate();
		this.updDate = registeredUser.getUpdDate();
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

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n email " + email);
		sb.append("\n firstname " + firstname);
		sb.append("\n lastname " + lastname);
		sb.append("\n telephone " + telephone);
		sb.append("\n telephone " + telephone);
		sb.append("\n userId " + login.getAuthorityLevel());
		sb.append("\n userId " + login.getUserId());
		sb.append("\n userId " + login.getPassword());
		sb.append("\n userId " + login.getUserId());
		return sb.toString();
	}
}

package com.braffa.sellem.model.hbn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.braffa.sellem.model.xml.authentication.XmlRegisteredUser;

@Entity
@Table(name = "REGISTEREDUSER")
public class RegisteredUser {

	@Column(name = "email")
	private String email;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "telephone")
	private String telephone;

	@Id
	@Column(name = "userId")
	private String userId;

	@Column(name = "crDate")
	private Date crDate;

	@Column(name = "updDate")
	private Date updDate;

	public RegisteredUser() {

	}

	public RegisteredUser(XmlRegisteredUser aXmlRegisteredUser) {
		this.email = aXmlRegisteredUser.getEmail();
		this.firstname = aXmlRegisteredUser.getFirstname();
		this.lastname = aXmlRegisteredUser.getLastname();
		this.telephone = aXmlRegisteredUser.getTelephone();
		this.userId = aXmlRegisteredUser.getLogin().getUserId();
		this.crDate = aXmlRegisteredUser.getCrDate();
		this.updDate = aXmlRegisteredUser.getUpdDate();
	}

	public RegisteredUser(String email, String firstname, String lastname,
			String password, String telephone, String userId, Date crDate,
			Date updDate) {

		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.userId = userId;
		this.crDate = crDate;
		this.updDate = updDate;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n email " + email);
		sb.append("\n firstname " + firstname);
		sb.append("\n lastname " + lastname);
		sb.append("\n telephone " + telephone);
		sb.append("\n telephone " + telephone);
		sb.append("\n userId " + userId);
		sb.append("\n updDate " + updDate);
		return sb.toString();
	}
}

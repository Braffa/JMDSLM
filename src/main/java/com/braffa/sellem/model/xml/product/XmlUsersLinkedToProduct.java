package com.braffa.sellem.model.xml.product;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.braffa.sellem.model.hbn.entity.Login;
import com.braffa.sellem.model.hbn.entity.RegisteredUser;

@XmlRootElement(namespace = "com.braffa.sellem.model.xml.authentication.XmlUsersLinkedToProduct" )
@XmlType(propOrder = { "addedDate", "email", "firstname", "lastname", "telephone", "userId"})
public class XmlUsersLinkedToProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date addedDate;
	
	private String email;

	private String firstname;

	private String lastname;

	private String telephone;

	private String userId;

	public XmlUsersLinkedToProduct() {

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

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n email     " + email);
		sb.append("\n firstname " + firstname);
		sb.append("\n lastname  " + lastname);
		sb.append("\n telephone " + telephone);
		sb.append("\n telephone " + telephone);
		sb.append("\n userId    " + userId);
		sb.append("\n addeddate " + addedDate);
		return sb.toString();
	}
}

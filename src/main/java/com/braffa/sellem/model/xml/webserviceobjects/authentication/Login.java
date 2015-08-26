package com.braffa.sellem.model.xml.webserviceobjects.authentication;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "login")
public class Login implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private String authorityLevel;
	
	private String password;
	
	private String userId;
	
	private Date crDate;
	
	private Date updDate;
	
	public Login () {
		
	}
	
	public Login(String authorityLevel, String password, String userId) {
		super();
		this.authorityLevel = authorityLevel;
		this.password = password;
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthorityLevel() {
		return authorityLevel;
	}

	public void setAuthorityLevel(String authorityLevel) {
		this.authorityLevel = authorityLevel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		return this.userId + " "
				+ this.password + " "
				+ this.authorityLevel + " "
				+ this.crDate + " " 
				+ this.updDate;
	}
}

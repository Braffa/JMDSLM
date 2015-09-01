package com.braffa.sellem.model.hbn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.braffa.sellem.model.xml.authentication.XmlLogin;

@Entity
@Table(name = "LOGIN")
public class Login {

	@Column(name = "authorityLevel")
	private String authorityLevel;

	@Column(name = "password")
	private String password;

	@Id
	@Column(name = "userId")
	private String userId;

	@Column(name = "crDate")
	private Date crDate;

	@Column(name = "updDate")
	private Date updDate;

	public Login() {

	}
	
	public Login(XmlLogin aXmlLogin) {
		this.authorityLevel = aXmlLogin.getAuthorityLevel();
		this.password = aXmlLogin.getPassword();
		this.userId = aXmlLogin.getUserId();
		this.crDate = new Date();
		this.updDate = new Date();
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

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" userId " + userId);
		sb.append("\n password " + password);
		sb.append("\n authorityLevel " + authorityLevel);
		sb.append("\n crDate " + crDate);
		sb.append("\n updDate " + updDate);
		return sb.toString();
	}
}

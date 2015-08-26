package com.braffa.sellem.model.xml.authentication;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.braffa.sellem.model.hbn.entity.Login;

@XmlRootElement(namespace = "com.braffa.sellem.model.xml.authentication.XmlLoginMsg" )
@XmlType(propOrder = { "authorityLevel", "crDate", "password", "userId", "updDate"})
public class XmlLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	private String authorityLevel;

	private String password;

	private String userId;

	private Date crDate;

	private Date updDate;

	public XmlLogin() {

	}

	public XmlLogin(String authorityLevel, String password, String userId) {
		super();
		this.authorityLevel = authorityLevel;
		this.password = password;
		this.userId = userId;
	}

	public XmlLogin(Login login) {
		super();
		this.authorityLevel = login.getAuthorityLevel();
		this.password = login.getPassword();
		this.userId = login.getUserId();
		this.crDate = login.getCrDate();
		this.updDate = login.getUpdDate();
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

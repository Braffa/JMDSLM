package com.braffa.sellem.model.database.authentication;

import java.io.Serializable;
import java.util.Date;

public class Login implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private String authorityLevel;
	
	private String password;
	
	private String userId;
	
	private Date crDate;
	
	private Date updDate;
	
	public Login () {
		
	}
	
	public Login(String authorityLevel, String password, String userId, Date crDate, Date updDate) {
		super();
		this.authorityLevel = authorityLevel;
		this.password = password;
		this.userId = userId;
		this.crDate = crDate;
		this.updDate = updDate;
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
	    StringBuffer sb = new StringBuffer();
	    sb.append("userId " + userId);
	    sb.append("\npassword " + password);
	    sb.append("\nauthorityLevel " + authorityLevel);
	    sb.append("\ncrDate " + crDate);
	    sb.append("\nupdDate " + updDate);
	    return sb.toString();
	}
}

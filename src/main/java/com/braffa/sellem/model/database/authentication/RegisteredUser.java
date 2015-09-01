package com.braffa.sellem.model.database.authentication;

import java.io.Serializable;
import java.util.Date;

import com.braffa.sellem.model.xml.webserviceobjects.authentication.Login;

public class RegisteredUser implements Serializable {

	private static final long serialVersionUID = 1L;

    private String authorityLevel;
    
	private String email;

	private String firstname;

	private String lastname;
 
    private String password;
    
    private String telephone;
    
    private String userId;

	private Date crDate;
	
	private Date updDate;
	
	public RegisteredUser() {

	}

    public RegisteredUser(String authorityLevel, String email,
            String firstname, String lastname, String password,
            String telephone, String userId, Date crDate, Date updDate) {
       
        this.authorityLevel = authorityLevel;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
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

    
    public String getAuthorityLevel() {
        return authorityLevel;
    }

    
    public void setAuthorityLevel(String authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getUserId() {
        return userId;
    }

    
    public void setUserId(String userId) {
        this.userId = userId;
    }

}

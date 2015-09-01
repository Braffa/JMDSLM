package com.braffa.sellem.model.xml.webserviceobjects.authentication;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "registeredusers")
public class RegisteredUsers implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<RegisteredUser> lOfRegisteredUser;

	public RegisteredUsers() {

	}
	
	public RegisteredUsers(List<RegisteredUser> lOfRegisteredUser) {
		super();
		this.lOfRegisteredUser = lOfRegisteredUser;
	}

	@XmlElementWrapper(name = "registeredusers")
	@XmlElementRef()
	public List<RegisteredUser> getlOfRegisteredUser() {
		return lOfRegisteredUser;
	}
	
	public void setlOfRegisteredUser(
			List<RegisteredUser> lOfRegisteredUser) {
		this.lOfRegisteredUser = lOfRegisteredUser;
	}

}

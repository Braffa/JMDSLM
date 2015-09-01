package com.braffa.sellem.model.xml.webserviceobjects.authentication;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "register")
public class Register {
	
	private static final long serialVersionUID = 1L;
	
	private RegisteredUsers registeredUsers;
	
	public Register () {
		
	}

	public Register (RegisteredUsers registeredUsers) {
		this.registeredUsers = registeredUsers;
	}
	@XmlElement(name = "users")
	public RegisteredUsers getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(RegisteredUsers registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

}

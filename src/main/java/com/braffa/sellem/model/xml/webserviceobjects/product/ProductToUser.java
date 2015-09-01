package com.braffa.sellem.model.xml.webserviceobjects.product;

import javax.xml.bind.annotation.XmlRootElement;

import com.braffa.sellem.model.xml.webserviceobjects.authentication.RegisteredUsers;

@XmlRootElement(name = "producttouser")
public class ProductToUser {
	
	private Product product;
	
	private RegisteredUsers registeredUsers;
	
	private UserToCatalogs userToCatalogs;
	
	public ProductToUser () {
		
	}
	
	public ProductToUser (Product product, UserToCatalogs userToCatalogs, RegisteredUsers registeredUsers) {
		this.product = product;
		this.userToCatalogs = userToCatalogs;
		this.registeredUsers = registeredUsers;
	}

	public UserToCatalogs getUserToCatalogs() {
		return userToCatalogs;
	}

	public void setUserToCatalogs(UserToCatalogs userToCatalogs) {
		this.userToCatalogs = userToCatalogs;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public RegisteredUsers getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(RegisteredUsers registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

}

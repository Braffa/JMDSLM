package com.braffa.sellem.model.xml.webserviceobjects.product;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductToUsers")
public class ProductToUsers {
	
	private static final long serialVersionUID = 1L;

	private List<ProductToUser> lOfProductToUser;
	
	public ProductToUsers () {
		
	}
	
	public ProductToUsers (List<ProductToUser> lOfProductToUser) {
		this.lOfProductToUser = lOfProductToUser;
	}

	public List<ProductToUser> getlOfProductToUser() {
		return lOfProductToUser;
	}

	public void setlOfProductToUser(List<ProductToUser> lOfProductToUser) {
		this.lOfProductToUser = lOfProductToUser;
	}

}

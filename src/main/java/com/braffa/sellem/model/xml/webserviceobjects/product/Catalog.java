package com.braffa.sellem.model.xml.webserviceobjects.product;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "catalog")
public class Catalog {
	
	private static final long serialVersionUID = 1L;
	
	private Products products;
	
	public Catalog () {
		
	}

	public Catalog (Products products) {
		this.products = products;
	}
	@XmlElement(name = "products")
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
}


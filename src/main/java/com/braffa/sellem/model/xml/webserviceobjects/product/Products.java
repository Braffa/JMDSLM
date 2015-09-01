package com.braffa.sellem.model.xml.webserviceobjects.product;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "products")
public class Products implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Product> lOfProducts;

	public Products() {

	}
	
	public Products(List<Product> lOfProducts) {
		super();
		this.lOfProducts = lOfProducts;
	}

	public List<Product> getlOfProducts() {
		return lOfProducts;
	}

	@XmlElementWrapper(name = "products")
	@XmlElementRef()
	public void setlOfProducts(List<Product> lOfProducts) {
		this.lOfProducts = lOfProducts;
	}
}

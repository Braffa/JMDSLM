package com.braffa.sellem.model.xml.product;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "products")
@XmlType(propOrder = { "action", "searchField", "success", "product",
		"LOfProducts" })
public class XmlProductMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	//private XmlProduct xmlProduct;

	private ArrayList<XmlProduct> lOfProducts;

	private XmlProduct product;

	private String searchField;

	private String success;

	private String action;

	public XmlProductMsg() {

	}

	public XmlProductMsg(XmlProduct xmlProduct) {
		this.product = xmlProduct;
	}

	public XmlProductMsg(ArrayList<XmlProduct> aLOfProducts) {
		this.lOfProducts = aLOfProducts;
	}

	public ArrayList<XmlProduct> getLOfProducts() {
		return lOfProducts;
	}

	@XmlElementWrapper(name = "productList")
	@XmlElement(name = "product")
	public void setLOfProducts(ArrayList<XmlProduct> lOfProducts) {
		this.lOfProducts = lOfProducts;
	}

	public XmlProduct getProduct() {
		return product;
	}

	@XmlElement(name = "product")
	public void setProduct(XmlProduct aProduct) {
		this.product = aProduct;
	}

	public String getSearchField() {
		return searchField;
	}

	@XmlElement(name = "searchField")
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public String getAction() {
		return action;
	}

	@XmlElement(name = "action")
	public void setAction(String action) {
		this.action = action;
	}

	@XmlElement(name = "success")
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

}

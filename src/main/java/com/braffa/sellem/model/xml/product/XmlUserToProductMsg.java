package com.braffa.sellem.model.xml.product;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "usertoproducts")
@XmlType(propOrder = { "action", "searchField", "success", "userToProduct", "LOfXmlUserToProduct" })
public class XmlUserToProductMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<XmlUserToProduct> lOfXmlUserToProduct;
	
	private XmlUserToProduct userToProduct;
	
	private String SearchField;
	
	private String success;
	
	private String action;

	public XmlUserToProductMsg() {

	}
	
	public XmlUserToProductMsg(XmlUserToProduct userToProduct) {
		this.userToProduct = userToProduct;
	}


	public XmlUserToProductMsg(ArrayList<XmlUserToProduct> aLOfXmlUserToProduct) {
		this.lOfXmlUserToProduct = aLOfXmlUserToProduct;
	}

	public ArrayList<XmlUserToProduct> getLOfXmlUserToProduct() {
		return lOfXmlUserToProduct;
	}

	@XmlElementWrapper(name = "usertoproductList")
	@XmlElement(name = "usertoproduct")
	public void setLOfXmlUserToProduct(
			ArrayList<XmlUserToProduct> lOfXmlUserToProduct) {
		this.lOfXmlUserToProduct = lOfXmlUserToProduct;
	}

	public String getSearchField() {
		return SearchField;
	}

	@XmlElement(name = "searchField")
	public void setSearchField(String searchField) {
		SearchField = searchField;
	}

	public String getAction() {
		return action;
	}

	@XmlElement(name = "action")
	public void setAction(String action) {
		this.action = action;
	}

	public XmlUserToProduct getUserToProduct() {
		return userToProduct;
	}

	@XmlElement(name = "usertoproduct")
	public void setUserToProduct(XmlUserToProduct userToProduct) {
		this.userToProduct = userToProduct;
	}

	@XmlElement(name = "success")
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

}

package com.braffa.sellem.model.xml.product;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "userstoproduct")
@XmlType(propOrder = { "action", "searchField", "success", "product", "lOfXmlUsersLinkedToProduct" })
public class XmlUsersProductMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<XmlUsersLinkedToProduct> lOfXmlUsersLinkedToProduct;
	
	private XmlProduct product;
	
	private String SearchField;
	
	private String success;
	
	private String action;

	public XmlUsersProductMsg() {

	}
	
	public ArrayList<XmlUsersLinkedToProduct> getlOfXmlUsersLinkedToProduct() {
		return lOfXmlUsersLinkedToProduct;
	}
	
	@XmlElementWrapper(name = "userslinkedtoproductList")
	@XmlElement(name = "userslinkedtoproduct")
	public void setlOfXmlUsersLinkedToProduct(
			ArrayList<XmlUsersLinkedToProduct> lOfXmlUsersLinkedToProduct) {
		this.lOfXmlUsersLinkedToProduct = lOfXmlUsersLinkedToProduct;
	}
	
	@XmlElement(name = "searchField")
	public void setSearchField(String searchField) {
		SearchField = searchField;
	}

	public String getSearchField() {
		return SearchField;
	}


	public String getAction() {
		return action;
	}

	@XmlElement(name = "action")
	public void setAction(String action) {
		this.action = action;
	}

	public XmlProduct getProduct() {
		return product;
	}

	@XmlElement(name = "product")
	public void setProduct(XmlProduct product) {
		this.product = product;
	}

	@XmlElement(name = "success")
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

}

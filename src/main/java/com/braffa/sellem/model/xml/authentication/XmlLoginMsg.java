package com.braffa.sellem.model.xml.authentication;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "logins")
@XmlType(propOrder = { "searchField", "success", "xmllogin", "LOfLogins" })
public class XmlLoginMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<XmlLogin> lOfLogins;

	private String searchField;

	private String success = "false";

	private XmlLogin xmllogin;

	public XmlLoginMsg() {

	}

	public XmlLoginMsg(XmlLogin aXmlLogin) {
		this.xmllogin = aXmlLogin;
	}

	public XmlLoginMsg(ArrayList<XmlLogin> aLOfLogins) {
		this.lOfLogins = aLOfLogins;
	}

	public ArrayList<XmlLogin> getLOfLogins() {
		return lOfLogins;
	}

	@XmlElementWrapper(name = "loginlist")
	@XmlElement(name = "login")
	public void setLOfLogins(ArrayList<XmlLogin> aLOfLogins) {
		this.lOfLogins = aLOfLogins;
	}

	public String getSearchField() {
		return searchField;
	}

	@XmlElement(name = "searchField")
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public XmlLogin getXmllogin() {
		return xmllogin;
	}

	@XmlElement(name = "login")
	public void setXmllogin(XmlLogin xmllogin) {
		this.xmllogin = xmllogin;
	}

	public String getSuccess() {
		return success;
	}

	@XmlElement(name = "success")
	public void setSuccess(String success) {
		this.success = success;
	}

}

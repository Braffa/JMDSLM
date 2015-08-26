package com.braffa.sellem.model.xml.authentication;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "registeredUsers")
@XmlType(propOrder = { "searchField", "success", "registeredUser", "LOfRegisteredUsers" })
public class XmlRegisteredUserMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<XmlRegisteredUser> lOfRegisteredUsers;

	private String searchField;

	private String success;

	private XmlRegisteredUser registeredUser;

	public XmlRegisteredUserMsg() {

	}

	public XmlRegisteredUserMsg(XmlRegisteredUser aRegisteredUser) {
		this.registeredUser = aRegisteredUser;
	}

	public XmlRegisteredUserMsg(ArrayList<XmlRegisteredUser> aLOfRegisteredUsers) {
		this.lOfRegisteredUsers = aLOfRegisteredUsers;
	}

	public ArrayList<XmlRegisteredUser> getLOfRegisteredUsers() {
		return lOfRegisteredUsers;
	}

	@XmlElementWrapper(name = "registereduserlist")
	@XmlElement(name = "registereduser")
	public void setLOfRegisteredUsers(
			ArrayList<XmlRegisteredUser> aLOfRegisteredUsers) {
		this.lOfRegisteredUsers = aLOfRegisteredUsers;
	}

	public String getSearchField() {
		return searchField;
	}

	@XmlElement(name = "searchField")
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public XmlRegisteredUser getRegisteredUser() {
		return registeredUser;
	}

	@XmlElement(name = "registereduser")
	public void setRegisteredUser(XmlRegisteredUser aRegisteredUser) {
		this.registeredUser = aRegisteredUser;
	}

	public String getSuccess() {
		return success;
	}

	@XmlElement(name = "success")
	public void setSuccess(String success) {
		this.success = success;
	}

}

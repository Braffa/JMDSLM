package com.braffa.sellem.model.xml.webserviceobjects.product;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userstocatalogs")
public class UserToCatalogs implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<UserToCatalog> lOfUserToCatalog;

	public UserToCatalogs() {

	}
	
	public UserToCatalogs(List<UserToCatalog> lOfUserToCatalog) {
		super();
		this.lOfUserToCatalog = lOfUserToCatalog;
	}

	public List<UserToCatalog> getlOfUserToCatalog() {
		return lOfUserToCatalog;
	}
	@XmlElementWrapper(name = "userstocatalog")
	@XmlElementRef()
	public void setlOfUserToCatalog(List<UserToCatalog> lOfUserToCatalog) {
		this.lOfUserToCatalog = lOfUserToCatalog;
	}
}

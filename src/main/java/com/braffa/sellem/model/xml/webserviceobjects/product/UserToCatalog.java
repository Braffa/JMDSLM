package com.braffa.sellem.model.xml.webserviceobjects.product;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "usertocatalog")
public class UserToCatalog implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	private String productId;
	
	private String productIndex;
	
	private Date crDate;
	
	private Date updDate;
	
	public UserToCatalog () {
		
	}
	
	public UserToCatalog (String userId, String productId, String productIndex) {
		this.userId = userId;
		this.productId = productId;
		this.productIndex = productIndex;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductIndex() {
		return productIndex;
	}

	public void setProductIndex(String productIndex) {
		this.productIndex = productIndex;
	}

	public Date getCrDate() {
		return crDate;
	}

	public void setCrDate(Date crDate) {
		this.crDate = crDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}
	
	public String toString () {
		return userId + " "
		 + productId + " "
		 + productIndex + " "
		 + crDate + " "
		 + updDate;
	}

}

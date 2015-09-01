package com.braffa.sellem.model.xml.product;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.braffa.sellem.model.hbn.entity.UserToProduct;

@XmlRootElement(namespace = "com.braffa.sellem.model.xml.product.XmlUserToProductMsg")
@XmlType(propOrder = { "userId", "productId", "productIndex", "crDate", "updDate"})
public class XmlUserToProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;

	private String productId;

	private int productIndex;

	private Date crDate;

	private Date updDate;

	public XmlUserToProduct() {

	}

	public XmlUserToProduct(UserToProduct aUserToProduct) {
		this.userId = aUserToProduct.getUserId();
		this.productId = aUserToProduct.getProductId();
		this.productIndex = aUserToProduct.getProductIndex();
		this.crDate = aUserToProduct.getCrDate();
		this.updDate = aUserToProduct.getUpdDate();
	}

	public XmlUserToProduct(String userId, String productId, int productIndex) {
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

	public int getProductIndex() {
		return productIndex;
	}

	public void setProductIndex(int productIndex) {
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

	public String toString() {
		return userId + " " + productId + " " + productIndex + " " + crDate
				+ " " + updDate;
	}

}

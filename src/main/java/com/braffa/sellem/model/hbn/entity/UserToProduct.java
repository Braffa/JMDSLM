package com.braffa.sellem.model.hbn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.braffa.sellem.model.xml.product.XmlUserToProduct;

@Entity
@Table(name = "UserToProduct")
public class UserToProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "productId")
	private String productId;

	@Column(name = "productIndex")
	private int productIndex;

	@Column(name = "userId")
	private String userId;

	@Column(name = "crDate")
	private Date crDate;

	@Column(name = "updDate")
	private Date updDate;

	public UserToProduct() {

	}
	
	public UserToProduct(XmlUserToProduct userToProduct) {
		super();
		this.productId = userToProduct.getProductId();
		this.productIndex = userToProduct.getProductIndex();
		this.userId = userToProduct.getUserId();
		this.crDate = userToProduct.getCrDate();
		this.updDate = userToProduct.getUpdDate();
	}

/*	public UserToProduct(int id, String productId, int productIndex,
			String userId, Date crDate, Date updDate) {
		super();
		this.id = id;
		this.productId = productId;
		this.productIndex = productIndex;
		this.userId = userId;
		this.crDate = crDate;
		this.updDate = updDate;
	}

	public UserToProduct(String productId, int productIndex, String userId) {
		this.productId = productId;
		this.productIndex = productIndex;
		this.userId = userId;
	}

	public UserToProduct(String productId, int productIndex, String userId,
			Date crDate, Date updDate) {
		this.productId = productId;
		this.productIndex = productIndex;
		this.userId = userId;
		this.crDate = crDate;
		this.updDate = updDate;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

}

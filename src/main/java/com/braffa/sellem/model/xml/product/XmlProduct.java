package com.braffa.sellem.model.xml.product;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.braffa.sellem.model.hbn.entity.Product;

@XmlRootElement(namespace = "com.braffa.sellem.model.xml.product.XmlProductMsg" )
@XmlType(propOrder = { "action", "author", "crDate", "imageURL", "imageLargeURL", "manufacturer", "productIndex", "productgroup" ,
		"productid", "productidtype", "source", "sourceid", "title", "userId", "updDate"})
public class XmlProduct implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String author;
	private String imageURL;
	private String imageLargeURL;
	private String manufacturer;
	private String productIndex;
	private String productgroup;
	private String productid;
	private String productidtype;
	private String source;
	private String sourceid;
	private String title;
	private String userId;
	private String action;
	private Date crDate;
	private Date updDate;
	
	public XmlProduct () {
		
	}
	
	public XmlProduct (Product aProduct) {
		super();
		this.author = aProduct.getAuthor();
		this.imageURL = aProduct.getImageURL();
		this.imageLargeURL = aProduct.getImageLargeURL();
		this.manufacturer = aProduct.getManufacturer();
		this.productgroup = aProduct.getProductgroup();
		this.productid = aProduct.getProductId();
		this.productidtype = aProduct.getProductidtype();
		this.source = aProduct.getSource();
		this.sourceid = aProduct.getSourceid();
		this.title = aProduct.getTitle();
		this.crDate = aProduct.getCrDate();
		this.updDate = aProduct.getUpdDate();
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getImageLargeURL() {
		return imageLargeURL;
	}

	public void setImageLargeURL(String imageLargeURL) {
		this.imageLargeURL = imageLargeURL;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductIndex() {
		return productIndex;
	}

	public void setProductIndex(String productIndex) {
		this.productIndex = productIndex;
	}

	public String getProductgroup() {
		return productgroup;
	}

	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceid() {
		return sourceid;
	}

	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductidtype() {
		return productidtype;
	}

	public void setProductidtype(String productidtype) {
		this.productidtype = productidtype;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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
		return author + " "
		 + imageURL + " "
		 + imageLargeURL + " "
		 + manufacturer + " "
		 + productIndex + " "
		 + productgroup + " "
		 + productid + " "
		 + productidtype + " "
		 + source + " "
		 + sourceid + " "
		 + title + " "
		 + userId + " "
		 + action + " "
		 + crDate + " "
		 + updDate;
	}
	
}

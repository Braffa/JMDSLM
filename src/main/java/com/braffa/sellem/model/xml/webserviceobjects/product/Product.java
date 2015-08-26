package com.braffa.sellem.model.xml.webserviceobjects.product;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
public class Product implements Serializable {
	
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
	public Product () {
		
	}

	public Product(String author, String imageURL, String imageLargeURL,
			String manufacturer, String productIndex, String productgroup, String productid, String productidtype,
			String source, String sourceid, String title) {
		super();
		this.author = author;
		this.imageURL = imageURL;
		this.imageLargeURL = imageLargeURL;
		this.manufacturer = manufacturer;
		this.productIndex = productIndex;
		this.productgroup = productgroup;
		this.productid = productid;
		this.productidtype = productidtype;
		this.source = source;
		this.sourceid = sourceid;
		this.title = title;
	}
	
	public Product(String author, String imageURL, String imageLargeURL,
			String manufacturer, String productIndex, String productgroup, String productid, String productidtype,
			String source, String sourceid, String title, String userId) {
		super();
		this.author = author;
		this.imageURL = imageURL;
		this.imageLargeURL = imageLargeURL;
		this.manufacturer = manufacturer;
		this.productIndex = productIndex;
		this.productgroup = productgroup;
		this.productid = productid;
		this.productidtype = productidtype;
		this.source = source;
		this.sourceid = sourceid;
		this.title = title;
		this.userId = userId;
	}
	
	public Product(String author, String imageURL, String imageLargeURL,
			String manufacturer, String productIndex, String productgroup, String productid, String productidtype,
			String source, String sourceid, String title, String userId, String action) {
		super();
		this.author = author;
		this.imageURL = imageURL;
		this.imageLargeURL = imageLargeURL;
		this.manufacturer = manufacturer;
		this.productIndex = productIndex;
		this.productgroup = productgroup;
		this.productid = productid;
		this.productidtype = productidtype;
		this.source = source;
		this.sourceid = sourceid;
		this.title = title;
		this.userId = userId;
		this.action = action;
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

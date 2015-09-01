package com.braffa.sellem.model.hbn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.braffa.sellem.model.xml.product.XmlProduct;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Column(name = "author")
	private String author;

	@Column(name = "imageURL")
	private String imageURL;

	@Column(name = "imageLargeURL")
	private String imageLargeURL;

	@Column(name = "manufacturer")
	private String manufacturer;

	@Column(name = "productgroup")
	private String productgroup;

	@Id
	@Column(name = "productId")
	private String productId;

	@Column(name = "productidtype")
	private String productidtype;

	@Column(name = "source")
	private String source;

	@Column(name = "sourceid")
	private String sourceid;

	@Column(name = "title")
	private String title;

	@Column(name = "crDate")
	private Date crDate;

	@Column(name = "updDate")
	private Date updDate;

	public Product() {

	}

	public Product(XmlProduct aXmlProduct) {
		super();
		this.author = aXmlProduct.getAuthor();
		this.imageURL = aXmlProduct.getImageURL();
		this.imageLargeURL = aXmlProduct.getImageLargeURL();
		this.manufacturer = aXmlProduct.getManufacturer();
		this.productgroup = aXmlProduct.getProductgroup();
		this.productId = aXmlProduct.getProductid();
		this.productidtype = aXmlProduct.getProductidtype();
		this.source = aXmlProduct.getSource();
		this.sourceid = aXmlProduct.getSourceid();
		this.title = aXmlProduct.getTitle();
		this.crDate = aXmlProduct.getCrDate();
		this.updDate = aXmlProduct.getUpdDate();
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

	public String getProductgroup() {
		return productgroup;
	}

	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductidtype() {
		return productidtype;
	}

	public void setProductidtype(String productidtype) {
		this.productidtype = productidtype;
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

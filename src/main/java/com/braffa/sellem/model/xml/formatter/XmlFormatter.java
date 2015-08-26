package com.braffa.sellem.model.xml.formatter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.braffa.sellem.model.xml.authentication.XmlLogin;
import com.braffa.sellem.model.xml.authentication.XmlLoginMsg;
import com.braffa.sellem.model.xml.authentication.XmlRegisteredUserMsg;
import com.braffa.sellem.model.xml.product.XmlProductMsg;
import com.braffa.sellem.model.xml.product.XmlUserToProductMsg;

public class XmlFormatter {

	public void formatXMLLogins(
			XmlLoginMsg xmlLogins) {
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(XmlLoginMsg.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(xmlLogins, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void formatXMLLogin(
			XmlLogin xmlLogin) {
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(XmlLogin.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(xmlLogin, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void formatXmlRegisteredUsers(
			XmlRegisteredUserMsg xmlRegisteredUsers) {
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(XmlRegisteredUserMsg.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(xmlRegisteredUsers, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void formatXmlProducts(
			XmlProductMsg xmlProducts) {
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(XmlProductMsg.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(xmlProducts, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void formatXmlUserToProduct(XmlUserToProductMsg xmlUserToProductMsg) {
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(XmlUserToProductMsg.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(xmlUserToProductMsg, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}

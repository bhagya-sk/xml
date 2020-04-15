package com.reactiveworks.jaxb.marshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.reactiveworks.jaxb.bind.XmlTypeExample;

public class XmlTypeEx {

	public static void main(String[] args) throws JAXBException {

		XmlTypeExample emp = new XmlTypeExample();
		JAXBContext contextObj = JAXBContext.newInstance(emp.getClass());
		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // to format the output
		marshallerObj.marshal(emp, System.out); // to print xml in the cosole

	}

}

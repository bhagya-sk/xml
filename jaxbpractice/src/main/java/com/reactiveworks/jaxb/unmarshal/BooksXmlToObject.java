package com.reactiveworks.jaxb.unmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.reactiveworks.jaxb.bind.Books;

public class BooksXmlToObject {

	private static final String XML_FILE = "books.xml";
	private static Logger LOGGER_OBJ = Logger.getLogger(BooksXmlToObject.class);
	private static JAXBContext jaxbContext;

	public static Books unmarshal() {
		Books booksObj = null;

		try {
			File file = new File(BooksXmlToObject.class.getClassLoader().getResource(XML_FILE).getFile());
			jaxbContext = JAXBContext.newInstance(Books.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			booksObj = (Books) jaxbUnmarshaller.unmarshal(file);
			LOGGER_OBJ.debug(booksObj);
		} catch (JAXBException jaxbExp) {
			jaxbExp.printStackTrace();
		}

		return booksObj;
	}

	public static void marshal() {
		Books booksObj = unmarshal();
		Marshaller marshallerObj;
		try {
			marshallerObj = jaxbContext.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // to format the output
			marshallerObj.marshal(booksObj, System.out); // to print xml in the cosole
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		marshal();
	}
}
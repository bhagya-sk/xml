package com.reactiveworks.jaxb.unmarshal;

import java.io.File;
import org.apache.log4j.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.reactiveworks.jaxb.bind.Students;

public class StudentXmlToObject {

	private static final String XML_FILE = "students.xml";
	private static Logger LOGGER_OBJ = Logger.getLogger(StudentXmlToObject.class);

	public static void unmarshal() {

		try {

			File file = new File(EmpXmlToObject.class.getClassLoader().getResource(XML_FILE).getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Students studentsObj = (Students) jaxbUnmarshaller.unmarshal(file);
			LOGGER_OBJ.debug(studentsObj);

		} catch (JAXBException jaxbExp) {
			jaxbExp.printStackTrace();
		}
	}

	public static void main(String[] args) {

		unmarshal();

	}
}
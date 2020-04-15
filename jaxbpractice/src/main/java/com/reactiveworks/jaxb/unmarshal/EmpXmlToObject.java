package com.reactiveworks.jaxb.unmarshal;

import java.io.File;
import org.apache.log4j.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.reactiveworks.jaxb.bind.Employee;

public class EmpXmlToObject {

	private static final String XML_FILE = "emp.xml";
	private static Logger LOGGER_OBJ=Logger.getLogger(EmpXmlToObject.class);

	public static void unmarshal() {

		try {
			File file = new File(EmpXmlToObject.class.getClassLoader().getResource(XML_FILE).getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee empObj = (Employee) jaxbUnmarshaller.unmarshal(file);
			LOGGER_OBJ.debug(empObj);
		} catch (JAXBException jaxbExp) {
			jaxbExp.printStackTrace();
		}
	}

	public static void main(String[] args) {

		unmarshal();

	}

}

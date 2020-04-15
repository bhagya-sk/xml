package com.reactiveworks.jaxb.unmarshaller;

import java.io.File;
import org.apache.log4j.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.reactiveworks.jaxb.bind.LeapDataServices;

public class EntityUnMarshaller {
	private static String XML_FILE = "Entity.xml";
	private static Logger LOGGER_OBJ = Logger.getLogger(EntityUnMarshaller.class);

	public static LeapDataServices unMarshaling() {
		LeapDataServices leapDataServicesObj = null;
		try {
			File file = new File(EntityUnMarshaller.class.getClassLoader().getResource(XML_FILE).getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(LeapDataServices.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			leapDataServicesObj = (LeapDataServices) jaxbUnmarshaller.unmarshal(file);
			LOGGER_OBJ.debug(leapDataServicesObj);
			
		} catch (JAXBException jaxbExp) {
			jaxbExp.printStackTrace();
		}
		return leapDataServicesObj;
	}

	public static void main(String[] args) throws JAXBException {
		unMarshaling();
	}

}

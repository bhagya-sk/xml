package com.reactiveworks.jaxb.marshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.reactiveworks.jaxb.bind.LeapDataServices;
import com.reactiveworks.jaxb.unmarshaller.EntityUnMarshaller;


public class EntityMarshaller {
	private static void marshaling() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(LeapDataServices.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			LeapDataServices leapDataServicesObj=EntityUnMarshaller.unMarshaling();
			// Marshal the employees list in console
			jaxbMarshaller.marshal(leapDataServicesObj, System.out);
		} catch (JAXBException jaxbExp) {
			jaxbExp.printStackTrace();
		}

	}

	public static void main(String[] args) {

		marshaling();
	}
}

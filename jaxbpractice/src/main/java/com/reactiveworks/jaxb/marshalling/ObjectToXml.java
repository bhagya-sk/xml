package com.reactiveworks.jaxb.marshalling;



import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.reactiveworks.jaxb.bind.Employee;

public class ObjectToXml {
	
	private static void marshaling(Employee empObj) throws JAXBException
	{
		 File file=new File("emp.xml");
	       JAXBContext contextObj=JAXBContext.newInstance(empObj.getClass());
	       Marshaller marshallerObj=contextObj.createMarshaller();
	       marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  //to format the output
	       marshallerObj.marshal(empObj, System.out); //to print xml in the cosole
	       marshallerObj.marshal(empObj, file); //to store the generated output into the file
	}

	public static void main(String[] args) throws JAXBException {
		
       Employee empObj = new Employee();
       empObj.setEmpNo(23);
       empObj.setFirstName("sda");
       empObj.setLastName("ghj");
       empObj.setSalary(1000.0);
      
       marshaling(empObj);
		
	}

}

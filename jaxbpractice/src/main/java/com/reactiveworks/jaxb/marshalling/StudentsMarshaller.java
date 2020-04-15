package com.reactiveworks.jaxb.marshalling;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.reactiveworks.jaxb.bind.Student;
import com.reactiveworks.jaxb.bind.Students;

public class StudentsMarshaller {
	static Students students=new Students();
	
	
	public static void createEmployeeList() {
		Map<Integer,Student> studentsList;
		students.setStudents(new LinkedHashMap<Integer,Student>());
		Student student1=new Student();
		Student student2=new Student();
		//Student student3=new Student();
		student1.setFirstName("a");
		student1.setLastName("b");
		student1.setRollNo(1);
		
		
		 student2.setFirstName("a");
		 student2.setLastName("b");
		 student2.setRollNo(1);
		 studentsList=students.getStudents();
		 
		 studentsList.put(1,student1);
		 studentsList.put(2,student2); 
	   //  System.out.println(studentsList);
	}
	
	private static void marshaling() throws JAXBException
	{
	    JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
	    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	     
	    //Marshal the employees list in console
	    jaxbMarshaller.marshal(students, System.out);
	     
	    //Marshal the employees list in file
	    jaxbMarshaller.marshal(students, new File("students.xml"));
	}

	public static void main(String[] args) throws JAXBException {
		createEmployeeList();
		 marshaling();
	}

}

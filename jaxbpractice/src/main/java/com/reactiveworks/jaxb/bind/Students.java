package com.reactiveworks.jaxb.bind;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
	@XmlElement(name="student")
	private Map<Integer,Student> student=null;
    
	
	public Map<Integer,Student> getStudents() {
		return student;
	}

	public  void setStudents( Map<Integer,Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Students [student:" + student + "]";
	}
	
}

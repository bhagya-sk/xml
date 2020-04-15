package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="employee")
@XmlType(propOrder = {})
@XmlAccessorType (XmlAccessType.FIELD) // only all public fields (non-static) will be automatically included for marshalling.No getter will be considered.
public class XmlTypeExample{

	
	public int empNo=9;
	@XmlTransient  //Prevents mapping a field or property to the XML Schema
	public double salary=4567;
	
	@XmlElement
	public String lastName="sdf";
	
	@XmlElement
	public String firstName="dfgg";
	
	
	
}

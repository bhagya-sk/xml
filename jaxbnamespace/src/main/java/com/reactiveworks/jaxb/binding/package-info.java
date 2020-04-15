@XmlSchema( 
    namespace = "http://www.example.com/package", 
    elementFormDefault = XmlNsForm.QUALIFIED,
    xmlns = {
            @XmlNs(prefix="elens", namespaceURI="http://www.example.com/package"),
            @XmlNs(prefix="rootns", namespaceURI="http://www.example.com")
    }) 

package com.reactiveworks.jaxb.binding;
 
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;


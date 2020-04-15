package com.reactiveworks.jaxb.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityColumn {

	@XmlAttribute
	private String entityFieldNameRef;

	@XmlAttribute
	private String hasAutoIncrement;

	@XmlAttribute
	private String name;

	@XmlAttribute
	private String sequence;

	@XmlElement(name = "Attribute")
	private List<Attribute> attributes;

	public String getEntityFieldNameRef() {
		return entityFieldNameRef;
	}

	@Override
	public String toString() {
		return "EntityColumn [entityFieldNameRef=" + entityFieldNameRef + ", hasAutoIncrement=" + hasAutoIncrement
				+ ", name=" + name + ", sequence=" + sequence + ", attributes=" + attributes + "]";
	}

	public void setEntityFieldNameRef(String entityFieldNameRef) {
		this.entityFieldNameRef = entityFieldNameRef;
	}

	public String getHasAutoIncrement() {
		return hasAutoIncrement;
	}

	public void setHasAutoIncrement(String hasAutoIncrement) {
		this.hasAutoIncrement = hasAutoIncrement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

}

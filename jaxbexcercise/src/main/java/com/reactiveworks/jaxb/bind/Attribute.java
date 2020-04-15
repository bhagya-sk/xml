package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Attribute {

	@XmlAttribute
	private String name;

	@XmlAttribute
	private String value;

	@XmlAttribute
	private String isPrimaryKey;

	@XmlAttribute
	private String attributeDatatype;

	@XmlAttribute
	private String type;

	@XmlAttribute
	private String size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getIsPrimaryKey() {
		return isPrimaryKey;
	}

	public void setIsPrimaryKey(String isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	public String getAttributeDatatype() {
		return attributeDatatype;
	}

	public void setAttributeDatatype(String attributeDatatype) {
		this.attributeDatatype = attributeDatatype;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Attribute [name=" + name + ", value=" + value + ", isPrimaryKey=" + isPrimaryKey
				+ ", attributeDatatype=" + attributeDatatype + ", type=" + type + ", size=" + size + "]";
	}

}

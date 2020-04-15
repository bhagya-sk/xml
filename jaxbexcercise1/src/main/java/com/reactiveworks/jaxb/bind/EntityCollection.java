package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityCollection {

	@XmlAttribute
	private String collectionName;
	@XmlAttribute
	private String collectionType;

	public String getCollectionName() {
		return collectionName;
	}

	@Override
	public String toString() {
		return "EntityCollection [collectionName=" + collectionName + ", collectionType=" + collectionType + "]";
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

}

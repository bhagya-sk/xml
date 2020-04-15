package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityIndex {

	@XmlAttribute
	private String entityColumnRef;

	public String getEntityColumnRef() {
		return entityColumnRef;
	}

	public void setEntityColumnRef(String entityColumnRef) {
		this.entityColumnRef = entityColumnRef;
	}

	@Override
	public String toString() {
		return "EntityIndex [entityColumnRef=" + entityColumnRef + "]";
	}

}

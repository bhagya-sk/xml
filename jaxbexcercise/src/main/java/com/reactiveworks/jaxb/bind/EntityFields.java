package com.reactiveworks.jaxb.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityFields {

	@XmlElement(name="EntityField")
	private List<EntityField> entityfield;

	public List<EntityField> getEntityfield() {
		return entityfield;
	}

	public void setEntityfield(List<EntityField> entityfield) {
		this.entityfield = entityfield;
	}

	@Override
	public String toString() {
		return "EntityFields [entityfield=" + entityfield + "]";
	}

}

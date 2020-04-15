package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Entity {

	@XmlAttribute
	private String isEnable;

	@XmlAttribute
	private String name;

	@XmlElement(name="EntityCollection")
	private EntityCollection entityCollectionObj;

	@XmlElement(name="EntityFields")
	private EntityFields entityFieldsObj;

	@XmlElement(name="EntityAccessConfig")
	private EntityAccessConfig entityAccessConfigObj;

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EntityCollection getEntityCollectionObj() {
		return entityCollectionObj;
	}

	public void setEntityCollectionObj(EntityCollection entityCollectionObj) {
		this.entityCollectionObj = entityCollectionObj;
	}

	public EntityFields getEntityFieldsObj() {
		return entityFieldsObj;
	}

	public void setEntityFieldsObj(EntityFields entityFieldsObj) {
		this.entityFieldsObj = entityFieldsObj;
	}

	public EntityAccessConfig getEntityAccessConfigObj() {
		return entityAccessConfigObj;
	}

	public void setEntityAccessConfigObj(EntityAccessConfig entityAccessConfigObj) {
		this.entityAccessConfigObj = entityAccessConfigObj;
	}

	@Override
	public String toString() {
		return "Entity [isEnable=" + isEnable + ", name=" + name + ", entityCollectionObj=" + entityCollectionObj
				+ ", entityFieldsObj=" + entityFieldsObj + ", entityAccessConfigObj=" + entityAccessConfigObj + "]";
	}

}
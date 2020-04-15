package com.reactiveworks.jaxb.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityAccessConfig {
	
	@Override
	public String toString() {
		return "EntityAccessConfig [type=" + type + ", entityTableObj=" + entityTableObj + ", entityAccess="
				+ entityAccess + "]";
	}

	@XmlAttribute
	private String type;
	
	@XmlElement(name="EntityTable")
	private EntityTable entityTableObj;
	
	@XmlElement(name="EntityAccess")
	private List<EntityAccess> entityAccess;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EntityTable getEntityTableObj() {
		return entityTableObj;
	}

	public void setEntityTableObj(EntityTable entityTableObj) {
		this.entityTableObj = entityTableObj;
	}

	public List<EntityAccess> getEntityAccess() {
		return entityAccess;
	}

	public void setEntityAccess(List<EntityAccess> entityAccess) {
		this.entityAccess = entityAccess;
	}
	

}

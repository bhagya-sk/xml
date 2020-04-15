package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LeapDataServices")
@XmlAccessorType(XmlAccessType.FIELD)
public class LeapDataServices {

	@XmlElement(name="Entity")
	private Entity entity;

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "LeapDataServices [entity=" + entity + "]";
	}
	

}

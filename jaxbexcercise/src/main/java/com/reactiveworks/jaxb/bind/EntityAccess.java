package com.reactiveworks.jaxb.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityAccess {

	@XmlAttribute
	private String accessMethod;

	@XmlAttribute
	private String accessType;

	@XmlAttribute
	private String authorizedResource;

	@XmlAttribute
	private String isCollection;

	@XmlElementWrapper(name = "EntityReadKeysMapping")
	@XmlElement(name = "EntityKey")
	private List<EntityKey> entityKeys;

	@XmlElementWrapper(name = "EntityFilterKeysMapping")
	@XmlElement(name = "EntityKey")
	private List<EntityKey> entityFilterKeys;

	@XmlElementWrapper(name = "LDCResponseConfigs")
	@XmlElement(name = "ApplyLDCConfig")
	private List<ApplyLDCConfig> applyLDCConfigs;

	public String getAccessMethod() {
		return accessMethod;
	}

	@Override
	public String toString() {
		return "EntityAccess [accessMethod=" + accessMethod + ", accessType=" + accessType + ", authorizedResource="
				+ authorizedResource + ", isCollection=" + isCollection + ", entityKeys=" + entityKeys
				+ ", entityFilterKeys=" + entityFilterKeys + ", applyLDCConfigs=" + applyLDCConfigs + "]";
	}

	public void setAccessMethod(String accessMethod) {
		this.accessMethod = accessMethod;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAuthorizedResource() {
		return authorizedResource;
	}

	public void setAuthorizedResource(String authorizedResource) {
		this.authorizedResource = authorizedResource;
	}

	public String getIsCollection() {
		return isCollection;
	}

	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}

	public List<EntityKey> getEntityKeys() {
		return entityKeys;
	}

	public void setEntityKeys(List<EntityKey> entityKeys) {
		this.entityKeys = entityKeys;
	}

	public List<EntityKey> getEntityFilterKeys() {
		return entityFilterKeys;
	}

	public void setEntityFilterKeys(List<EntityKey> entityFilterKeys) {
		this.entityFilterKeys = entityFilterKeys;
	}

	public List<ApplyLDCConfig> getApplyLDCConfigs() {
		return applyLDCConfigs;
	}

	public void setApplyLDCConfigs(List<ApplyLDCConfig> applyLDCConfigs) {
		this.applyLDCConfigs = applyLDCConfigs;
	}

}
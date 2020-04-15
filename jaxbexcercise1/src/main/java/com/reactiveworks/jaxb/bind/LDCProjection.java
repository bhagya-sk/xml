package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class LDCProjection {

	@XmlAttribute
	private String projectionFileName;

	@XmlAttribute
	private String projectionSource;

	@XmlAttribute
	private String required;

	public String getProjectionFileName() {
		return projectionFileName;
	}

	public void setProjectionFileName(String projectionFileName) {
		this.projectionFileName = projectionFileName;
	}

	public String getProjectionSource() {
		return projectionSource;
	}

	@Override
	public String toString() {
		return "LDCProjection [projectionFileName=" + projectionFileName + ", projectionSource=" + projectionSource
				+ ", required=" + required + "]";
	}

	public void setProjectionSource(String projectionSource) {
		this.projectionSource = projectionSource;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

}

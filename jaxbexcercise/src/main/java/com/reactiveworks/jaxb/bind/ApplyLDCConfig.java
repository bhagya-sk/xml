package com.reactiveworks.jaxb.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ApplyLDCConfig {

	@XmlAttribute
	private String applyAt;

	@XmlAttribute
	private String sequence;

	@XmlElement(name="LDCSchema")
	private LDCSchema ldcSchemaObj;

	@XmlElement(name="LDCProjection")
	private LDCProjection ldcProjectionObj;

	@XmlElement(name="LDCTaxonomy")
	private LDCTaxonomy ldcTaxonomyObj;

	public String getApplyAt() {
		return applyAt;
	}

	public void setApplyAt(String applyAt) {
		this.applyAt = applyAt;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public LDCSchema getLdcSchemaObj() {
		return ldcSchemaObj;
	}

	public void setLdcSchemaObj(LDCSchema ldcSchemaObj) {
		this.ldcSchemaObj = ldcSchemaObj;
	}

	public LDCProjection getLdcProjectionObj() {
		return ldcProjectionObj;
	}

	public void setLdcProjectionObj(LDCProjection ldcProjectionObj) {
		this.ldcProjectionObj = ldcProjectionObj;
	}

	public LDCTaxonomy getLdcTaxonomyObj() {
		return ldcTaxonomyObj;
	}

	public void setLdcTaxonomyObj(LDCTaxonomy ldcTaxonomyObj) {
		this.ldcTaxonomyObj = ldcTaxonomyObj;
	}

	@Override
	public String toString() {
		return "ApplyLDCConfig [applyAt=" + applyAt + ", sequence=" + sequence + ", ldcSchemaObj=" + ldcSchemaObj
				+ ", ldcProjectionObj=" + ldcProjectionObj + ", ldcTaxonomyObj=" + ldcTaxonomyObj + "]";
	}

}

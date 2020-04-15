package com.reactiveworks.jaxb.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityTable {

	@XmlAttribute
	private String autoCreate;

	@XmlAttribute
	private String tablename;

	@XmlElementWrapper(name = "EntiyColumns")
	@XmlElement(name = "EntityColumn")
	private List<EntityColumn> entityColumns;

	@XmlElementWrapper(name = "EntityIndexs")
	@XmlElement(name = "EntityIndex")
	private List<EntityIndex> entityIndexes;

	public String getAutoCreate() {
		return autoCreate;
	}

	public List<EntityIndex> getEntityIndexes() {
		return entityIndexes;
	}

	public void setEntityIndexes(List<EntityIndex> entityIndexes) {
		this.entityIndexes = entityIndexes;
	}

	@Override
	public String toString() {
		return "EntityTable [autoCreate=" + autoCreate + ", tablename=" + tablename + ", entityColumns=" + entityColumns
				+ ", entityIndexes=" + entityIndexes + "]";
	}

	public void setAutoCreate(String autoCreate) {
		this.autoCreate = autoCreate;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public List<EntityColumn> getEntityColumns() {
		return entityColumns;
	}

	public void setEntityColumns(List<EntityColumn> entityColumns) {
		this.entityColumns = entityColumns;
	}

	
}

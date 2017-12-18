package com.company.adapter.presentation.impl;

import java.util.Map;

import com.company.adapter.presentation.Category;

/**
 * Created by arpine on 12/18/17.
 */
public class CategoryImpl
		implements Category {
	private String name;
	private String columnName;
	private boolean isVisible;
	private Map<String, String> properties;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean visible) {
		isVisible = visible;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
}

package com.company.adapter.knowledge.impl;

import com.company.adapter.knowledge.Category;
import com.company.adapter.knowledge.CategoryProperty;

/**
 * Created by arpine on 12/18/17.
 */
public class CategoryImpl
		implements Category {
	private String name;
	private String columnName;
	private CategoryProperty property;

	public CategoryImpl(String name, String columnName, CategoryProperty property) {
		this.name = name;
		this.columnName = columnName;
		this.property = property;
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

	public CategoryProperty getProperty() {
		return property;
	}

	public void setProperty(CategoryProperty property) {
		this.property = property;
	}

}

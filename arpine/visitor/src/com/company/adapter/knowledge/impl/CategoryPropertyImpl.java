package com.company.adapter.knowledge.impl;

import java.util.List;

import com.company.adapter.knowledge.CategoryProperty;

/**
 * Created by arpine on 12/18/17.
 */
public class CategoryPropertyImpl
		implements CategoryProperty {
	private List<String> values;

	public CategoryPropertyImpl(List<String> values) {
		this.values = values;
	}

	public List<String> getValues() {
		return values;
	}

	public void setProperty(List<String> property) {
		this.values = property;
	}
}

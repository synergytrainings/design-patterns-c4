package com.company.model.impl;

import com.company.model.DateField;
import com.company.model.util.FieldType;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class DateFieldImpl
		extends FieldImpl
		implements DateField {
	private String pattern;

	DateFieldImpl(Integer id, String name) {
		this(id, name, null);
	}

	DateFieldImpl(Integer id, String name, String pattern) {
		super(id, name);
		this.pattern = pattern;
		setFieldType(FieldType.DATE_AND_TIME);
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public void accept(FieldVisitor visitor) {
		visitor.visit(this);
	}
}

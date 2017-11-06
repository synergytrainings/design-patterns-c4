package com.company.model.impl;

import com.company.model.DateField;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class DateFieldImpl
		extends BaseObjectImpl
		implements DateField {
	private final String pattern;

	public DateFieldImpl(Integer id, String name, String pattern) {
		super(id, name);
		this.pattern = pattern;
	}

	public String getPattern() {
		return pattern;
	}

	@Override
	public void accept(FieldVisitor visitor) {
		visitor.visit(this);
	}
}

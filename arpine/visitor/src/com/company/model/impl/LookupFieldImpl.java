package com.company.model.impl;

import com.company.model.LookupField;
import com.company.model.util.FieldType;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class LookupFieldImpl
		extends FieldImpl
		implements LookupField {
	private Integer lookupCategoryId;

	LookupFieldImpl(Integer id, String name) {
		this(id, name, null);
	}

	LookupFieldImpl(Integer id, String name, Integer lookupCategoryId) {
		super(id, name);
		this.lookupCategoryId = lookupCategoryId;
		setFieldType(FieldType.LOOKUP);
	}

	public void setLookupCategoryId(Integer lookupCategoryId) {
		this.lookupCategoryId = lookupCategoryId;
	}

	public Integer getLookupCategoryId() {
		return lookupCategoryId;
	}

	@Override
	public void accept(FieldVisitor visitor) {
		visitor.visit(this);
	}

}

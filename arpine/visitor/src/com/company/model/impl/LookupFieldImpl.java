package com.company.model.impl;

import com.company.model.LookupField;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class LookupFieldImpl
		extends BaseObjectImpl
		implements LookupField {
	private final Integer lookupCategoryId;

	public LookupFieldImpl(Integer id, String name, Integer lookupCategoryId) {
		super(id, name);
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

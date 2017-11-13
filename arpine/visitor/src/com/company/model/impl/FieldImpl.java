package com.company.model.impl;

import com.company.model.Field;
import com.company.model.util.FieldType;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class FieldImpl
		extends BaseObjectImpl
		implements Field {
	private Integer orderNumber = null;
	private Integer sortId = null;
	private boolean isDefault;
	private FieldType fieldType;

	FieldImpl(Integer id, String name) {
		super(id, name);
		this.fieldType = FieldType.SIMPLE;
	}

	@Override
	public Integer getId() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public void setDefault(boolean aDefault) {
		isDefault = aDefault;
	}

	public Integer getOrderNumber() {

		return orderNumber;
	}

	public Integer getSortId() {
		return sortId;
	}

	public boolean isDefault() {
		return isDefault;
	}

	@Override
	public void accept(FieldVisitor visitor) {

	}

	public FieldType getFieldType() {
		return fieldType;
	}

	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}
}

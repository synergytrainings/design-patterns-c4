package com.company.model.impl;

import com.company.factory.CategoryFactory;

/**
 * @author arpine on 11/13/17.
 */
public class SystemCategoryFactoryImpl
		implements CategoryFactory {
	private String systemTypeId;

	public SystemCategoryFactoryImpl(String systemTypeId) {
		this.systemTypeId = systemTypeId;
	}

	@Override
	public SystemCategoryImpl createCategory(String name) {
		Integer id = (int) Math.random();
		return new SystemCategoryImpl(id, name, this.systemTypeId);
	}
}

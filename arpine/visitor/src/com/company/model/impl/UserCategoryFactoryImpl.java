package com.company.model.impl;

import com.company.factory.CategoryFactory;

/**
 * @author arpine on 11/13/17.
 */
public class UserCategoryFactoryImpl
		implements CategoryFactory {
	private String createdById;

	public UserCategoryFactoryImpl(String createdById) {
		this.createdById = createdById;
	}

	@Override
	public UserCategoryImpl createCategory(String name) {
		Integer id = (int) Math.random();

		return new UserCategoryImpl(id, name, this.createdById);
	}
}

package com.company.model.impl;

import com.company.model.UserCategory;

/**
 * @author arpine on 11/6/17.
 */
public class UserCategoryImpl
		extends Category
		implements UserCategory {
	private String createdById;

	UserCategoryImpl(Integer id, String name, String createdById) {
		super(id, name);
		this.createdById = createdById;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Created By User Id  :" + this.getCreatedById());
	}
}

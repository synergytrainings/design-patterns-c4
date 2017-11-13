package com.company.model.impl;

import com.company.model.SystemCategory;

/**
 * @author arpine on 11/6/17.
 */
public class SystemCategoryImpl
		extends Category
		implements SystemCategory {
	private String systemTypeId;

	SystemCategoryImpl(Integer id, String name, String systemTypeId) {
		super(id, name);
		this.systemTypeId = systemTypeId;
	}

	public String getSystemTypeId() {
		return systemTypeId;
	}

	public void setSystemTypeId(String systemTypeId) {
		this.systemTypeId = systemTypeId;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("System Id  :" + this.getSystemTypeId());
	}
}

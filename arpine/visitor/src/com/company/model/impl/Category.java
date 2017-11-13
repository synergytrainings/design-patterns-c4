package com.company.model.impl;

/**
 * @author arpine on 11/6/17.
 */
public class Category
		extends BaseObjectImpl {
	public Category(Integer id, String name) {
		super(id, name);
	}

	public void printInfo() {
		System.out.println("Id is :" + this.getId() + ". Name is :" + this.getName());
	}
}

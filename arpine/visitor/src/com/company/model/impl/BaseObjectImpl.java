package com.company.model.impl;

import com.company.model.BaseObject;

/**
 * @author arpine on 11/4/17.
 */
public class BaseObjectImpl
		implements BaseObject {
	private final Integer id;
	private final String name;

	public BaseObjectImpl(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
